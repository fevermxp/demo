package com.fevermxp.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUsidIsNull() {
            addCriterion("usid is null");
            return (Criteria) this;
        }

        public Criteria andUsidIsNotNull() {
            addCriterion("usid is not null");
            return (Criteria) this;
        }

        public Criteria andUsidEqualTo(Integer value) {
            addCriterion("usid =", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotEqualTo(Integer value) {
            addCriterion("usid <>", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThan(Integer value) {
            addCriterion("usid >", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usid >=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThan(Integer value) {
            addCriterion("usid <", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThanOrEqualTo(Integer value) {
            addCriterion("usid <=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidIn(List<Integer> values) {
            addCriterion("usid in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotIn(List<Integer> values) {
            addCriterion("usid not in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidBetween(Integer value1, Integer value2) {
            addCriterion("usid between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotBetween(Integer value1, Integer value2) {
            addCriterion("usid not between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("login =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("login <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("login like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("login not like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNull() {
            addCriterion("workcode is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("workcode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(String value) {
            addCriterion("workcode =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(String value) {
            addCriterion("workcode <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(String value) {
            addCriterion("workcode >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("workcode >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(String value) {
            addCriterion("workcode <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("workcode <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLike(String value) {
            addCriterion("workcode like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotLike(String value) {
            addCriterion("workcode not like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<String> values) {
            addCriterion("workcode in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<String> values) {
            addCriterion("workcode not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(String value1, String value2) {
            addCriterion("workcode between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(String value1, String value2) {
            addCriterion("workcode not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andCrdtIsNull() {
            addCriterion("crdt is null");
            return (Criteria) this;
        }

        public Criteria andCrdtIsNotNull() {
            addCriterion("crdt is not null");
            return (Criteria) this;
        }

        public Criteria andCrdtEqualTo(Date value) {
            addCriterionForJDBCDate("crdt =", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtNotEqualTo(Date value) {
            addCriterionForJDBCDate("crdt <>", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtGreaterThan(Date value) {
            addCriterionForJDBCDate("crdt >", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crdt >=", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtLessThan(Date value) {
            addCriterionForJDBCDate("crdt <", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crdt <=", value, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtIn(List<Date> values) {
            addCriterionForJDBCDate("crdt in", values, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtNotIn(List<Date> values) {
            addCriterionForJDBCDate("crdt not in", values, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crdt between", value1, value2, "crdt");
            return (Criteria) this;
        }

        public Criteria andCrdtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crdt not between", value1, value2, "crdt");
            return (Criteria) this;
        }

        public Criteria andLndtIsNull() {
            addCriterion("lndt is null");
            return (Criteria) this;
        }

        public Criteria andLndtIsNotNull() {
            addCriterion("lndt is not null");
            return (Criteria) this;
        }

        public Criteria andLndtEqualTo(Date value) {
            addCriterionForJDBCDate("lndt =", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtNotEqualTo(Date value) {
            addCriterionForJDBCDate("lndt <>", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtGreaterThan(Date value) {
            addCriterionForJDBCDate("lndt >", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lndt >=", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtLessThan(Date value) {
            addCriterionForJDBCDate("lndt <", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lndt <=", value, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtIn(List<Date> values) {
            addCriterionForJDBCDate("lndt in", values, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtNotIn(List<Date> values) {
            addCriterionForJDBCDate("lndt not in", values, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lndt between", value1, value2, "lndt");
            return (Criteria) this;
        }

        public Criteria andLndtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lndt not between", value1, value2, "lndt");
            return (Criteria) this;
        }

        public Criteria andUpdtIsNull() {
            addCriterion("updt is null");
            return (Criteria) this;
        }

        public Criteria andUpdtIsNotNull() {
            addCriterion("updt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtEqualTo(Date value) {
            addCriterionForJDBCDate("updt =", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtNotEqualTo(Date value) {
            addCriterionForJDBCDate("updt <>", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtGreaterThan(Date value) {
            addCriterionForJDBCDate("updt >", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updt >=", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtLessThan(Date value) {
            addCriterionForJDBCDate("updt <", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updt <=", value, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtIn(List<Date> values) {
            addCriterionForJDBCDate("updt in", values, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtNotIn(List<Date> values) {
            addCriterionForJDBCDate("updt not in", values, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updt between", value1, value2, "updt");
            return (Criteria) this;
        }

        public Criteria andUpdtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updt not between", value1, value2, "updt");
            return (Criteria) this;
        }

        public Criteria andRightsIsNull() {
            addCriterion("rights is null");
            return (Criteria) this;
        }

        public Criteria andRightsIsNotNull() {
            addCriterion("rights is not null");
            return (Criteria) this;
        }

        public Criteria andRightsEqualTo(String value) {
            addCriterion("rights =", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotEqualTo(String value) {
            addCriterion("rights <>", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThan(String value) {
            addCriterion("rights >", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThanOrEqualTo(String value) {
            addCriterion("rights >=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThan(String value) {
            addCriterion("rights <", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThanOrEqualTo(String value) {
            addCriterion("rights <=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLike(String value) {
            addCriterion("rights like", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotLike(String value) {
            addCriterion("rights not like", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsIn(List<String> values) {
            addCriterion("rights in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotIn(List<String> values) {
            addCriterion("rights not in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsBetween(String value1, String value2) {
            addCriterion("rights between", value1, value2, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotBetween(String value1, String value2) {
            addCriterion("rights not between", value1, value2, "rights");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}