package com.fevermxp.demo.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fevermxp.demo.common.C;

public class AccessInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger log = Logger.getLogger(AccessInterceptor.class);
	
	private List<String> needFilters;
	private List<String> noFilters;
	
	private String loginPage;
	
	public void setNoFilters(List<String> noFilters) {
		this.noFilters = noFilters;
	}
	
	public List<String> getNoFilters() {
		return noFilters;
	}
	public void setNeedFilters(List<String> needFilters) {
		this.needFilters = needFilters;
	}
	
	public List<String> getNeedFilters() {
		return needFilters;
	}

	public String getLoginPage() {
		return loginPage;
	}
	
	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object o) throws Exception {
		
		String uri = request.getRequestURI();
		
		//log.debug("验证URI："+uri);
		boolean beFilter = false;
        for (String s : needFilters) {
            if (StringUtils.contains(uri, s)) {
                beFilter = true;
                break;
            }
        }
        if(beFilter){
        	for (String s : noFilters) {
                if (StringUtils.contains(uri, s)) {
                    beFilter = false;
                    break;
                }
            }
        }
        //log.debug("是否要检查Session："+beFilter);
        if (beFilter) {
        	log.debug("检查Session："+uri);
        	Object obj = request.getSession().getAttribute(C.SESSION_KEY);
        	if(null == obj){
        		//log.debug("Session为空");
        		response.setStatus(401);
        		if (request.getHeader("X-Requested-With") != null) {
        			//TODO ajax 401
        			log.debug("非法请求,强制登录ajax");
        			ajax401Return(response);
        		} else {
        			log.debug("非法请求,强制登录");
        			response.sendRedirect(request.getContextPath() + loginPage);
        		}
        		return false;
        	}
        }
        log.debug("AccessInterceptor 通过");
		return true;
	}
	
	private void ajax401Return(HttpServletResponse response) {
		response.setContentType("text/json;charset=UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write("{title:'登录超时',message:'请重新登录'}");
			out.flush();
		} catch (IOException e) {
			log.error(e);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
