package com.mycompany.app;
import java.util.*;
import java.text.DecimalFormat;
public class GoodList {
    DecimalFormat f = new DecimalFormat("##.00");
	private Map<Good, Integer> goods = new HashMap<Good, Integer>();
	
	public void addGood(Good g, int quantity) {
		goods.put(g, quantity);
	}
	public String getReceipt() {
		String receipt="";
		Double totalPrice = 0.0;
		Double tax=0.0;
		for (Map.Entry<Good, Integer> el : goods.entrySet()) {
			String product = "";
			Integer quantity = el.getValue();
			Good g = el.getKey();
			product += quantity.toString();
			if(g.getImportedValue()) {
				product += " imported";
			}
			product += " " + g.getName() + " at " + g.getTaxedPrice()*quantity+"\n";
			receipt += product;
			tax += g.getTaxValue()*quantity;
			totalPrice += g.getTaxedPrice() * quantity;
		}
		receipt+= "Sales Taxes " + f.format(tax) + "\n";
		receipt+= "Total " + f.format(Math.round(totalPrice*100.0)/100);
		return receipt;	
	}
}




