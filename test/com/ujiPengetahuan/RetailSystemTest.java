package com.ujiPengetahuan;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.ujiPengetahuan.retailSystem.RetailSystem;
import com.ujiPengetahuan.retailSystem.User;

class RetailSystemTest {

	@Test
	void test() {
		User user = new User("Bowo", false, false, new Date());
		RetailSystem indomaret = new RetailSystem();
		indomaret.CalculateDiscount(user, 3000, false);
	}
	
	@Test
	void test_royal_cust() throws ParseException {
		Date joinDate = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		joinDate = dateFormat.parse("2015-12-06 17:03:00");
		User user = new User("Bowo", true, true, new Date());
		RetailSystem indomaret = new RetailSystem();
		indomaret.CalculateDiscount(user, 3000, false);
	}

}
