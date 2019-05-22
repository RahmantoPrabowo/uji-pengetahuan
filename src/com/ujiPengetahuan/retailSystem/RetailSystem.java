package com.ujiPengetahuan.retailSystem;

import java.util.Date;

public class RetailSystem {

	private double [] arrayDiscounts;

	public String CalculateDiscount(User user, double bill, boolean groceries) {
		arrayDiscounts = new double[4];
		double discount = 0;
		double maxBill = 100;
		boolean royalCustomer = calculateJoinDate(user);
		if (!groceries) {
			if (User.isEmployee()) {
				arrayDiscounts[0] = 30;
			} else if (User.isAffiliate()) {
				arrayDiscounts[1] = 10;
			} else if (royalCustomer) {
				arrayDiscounts[2] = 5;
			} else if(bill > maxBill) {
				arrayDiscounts[3] = ((bill / 100) * 5);
			}
		}
		
		for (double i : arrayDiscounts) {
			if(discount < i) {
				discount = i;
			}
		}
		
		return String.valueOf((bill / 100)*5)+" "+String.valueOf(arrayDiscounts[3])+" Total discount get by "+ User.getName() + " is "
		+ String.valueOf(discount) + "% "
				+ "\ntotal payable = "+String.valueOf(bill - (bill*(discount/100)));
	}
	
	private boolean calculateJoinDate(User user) {
		long a = (new Date()).getTime();
		long b = user.getJoinDate().getTime();
		long diff =  a - b ;
		long joinDate = (long) (diff / (60 * 60 * 1000 * 24 * 30.41666666 * 12));
		
		if (joinDate > 2) {
			return true;
		}
		
		return false;
	}
}
