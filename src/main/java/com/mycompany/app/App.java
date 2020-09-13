package com.mycompany.app;

import com.mycompany.app.Good;
import com.mycompany.app.GoodList;
import java.text.DecimalFormat;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DecimalFormat f = new DecimalFormat("##.00");

        System.out.println( "Hello World!" );
        
		GoodList productList = new GoodList();
		Good g1 = new Good("book", 12.49, false, "book");
		Good g2= new Good("Music CD", 14.99, false, "CD");
		Good g3 = new Good("Chocolate Bar", 0.85, false, "food");
		
		//System.out.println(g1.getTaxedPrice());
		//System.out.println(f.format(g2.getTaxedPrice()));
		productList.addGood(g1,2);
		productList.addGood(g2,1);
		productList.addGood(g3,1);
		System.out.println(productList.getReceipt());
    }
}
