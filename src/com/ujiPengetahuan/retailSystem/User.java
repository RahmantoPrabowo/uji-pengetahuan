package com.ujiPengetahuan.retailSystem;

import java.util.Date;

public class User {

	private static String name;
	private static boolean employee;
	private static boolean affiliate;
	private static Date joinDate;
	
	public User(String name, boolean employee, boolean affiliate, Date joinDate) {
		User.name = name;
		User.employee = employee;
		User.affiliate = affiliate;
		User.joinDate = joinDate;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		User.name = name;
	}

	public static boolean isEmployee() {
		return employee;
	}

	public static void setEmployee(boolean employee) {
		User.employee = employee;
	}

	public static boolean isAffiliate() {
		return affiliate;
	}

	public static void setAffiliate(boolean affiliate) {
		User.affiliate = affiliate;
	}

	public static Date getJoinDate() {
		return joinDate;
	}

	public static void setJoinDate(Date joinDate) {
		User.joinDate = joinDate;
	}
	
	
}
