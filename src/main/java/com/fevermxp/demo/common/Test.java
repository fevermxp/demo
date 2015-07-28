package com.fevermxp.demo.common;

import java.math.BigInteger;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "1,2,3,101,102,103,104,105,201,202,301";
		//String str = "1,2,3,5,7,8,12,17,23";
		BigInteger rights = RightsHelper.sumRights(Tools.str2StrArray(str));
		System.out.println("==>"+rights);
	}

}
