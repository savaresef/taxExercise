package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;


public class sampleInput {
	@Test
	 public void testGood() {
		
	    
		GoodList productList = new GoodList();
		Good g1 = new Good("book", 12.49, false, "book");
		Good g2= new Good("Music CD", 14.99, false, "CD");
		Good g3 = new Good("Chocolate Bar", 0.85, false, "food");
		productList.addGood(g1,2);
		productList.addGood(g2,1);
		productList.addGood(g3,1);
		System.out.println("INVOICE 1");
		System.out.println(productList.getReceipt()+ "\n");

	    }
	 @Test
	 public void testGood2() {
			GoodList productList = new GoodList();
			Good g1 = new Good("Box of chocolate", 10.00, true, "food");
			Good g2= new Good("Bottle of purfume", 47.50, true, "general");
			productList.addGood(g1,1);
			productList.addGood(g2,1);
			System.out.println("INVOICE 2");
			System.out.println(productList.getReceipt() + "\n");

	    }

	 @Test
	 public void testGood3() {

			GoodList productList = new GoodList();
			Good g1= new Good("Bottle of purfume", 27.99, true, "general");
			Good g2= new Good("Bottle of purfume", 18.99, false, "general");
			Good g3 = new Good("Box of chocolate", 11.25, true, "food");
			Good g4= new Good("packet of headache pills", 9.75, true, "medical");


			productList.addGood(g1,1);
			productList.addGood(g2,1);
			productList.addGood(g3,3);
			productList.addGood(g4,1);
		
			System.out.println("INVOICE 3");
			System.out.println(productList.getReceipt() + "\n");

	    }
	 
}

	

