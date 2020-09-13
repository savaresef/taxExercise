package com.mycompany.app;

public class Good {
	protected String name;
	protected Double price;
	protected boolean taxable;
	protected Double taxPercentage;
	protected Double importTaxPercentage;
	protected boolean imported;
	protected String type;
	protected Double taxValue;
	protected Double taxedPrice;
	public Good() {
		taxable = true;
		
	}
	public Good(String n, Double p, boolean imp, String t) {
		name = n;
		price = p;
		imported = imp;
		type = t;
		if((t == "food") || (t == "medical") || (t == "book")) {
			taxPercentage = 0.0;}
		else
			taxPercentage = 10.0;
		if(imp) {importTaxPercentage = 5.0;}
		else {importTaxPercentage = 0.0;}
		
	    Double saleTax = price*taxPercentage/100;
		taxValue = price * importTaxPercentage/100 + Math.round(saleTax * 100.0) / 100.0;;
		taxedPrice = price + taxValue;
		
		
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setPrice(Double p) {
		price = p;
	}
	public void setTaxPercentage(Double t) {
		taxPercentage = t;
	}
    public void setImported(boolean i) {
    	imported = i;
    }
    public void setType(String t){
    	type = t;

    }
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public Double getTaxedPrice() {
		return taxedPrice;
			
	}
	public Double getTaxPercentage() {
		return taxPercentage;
	}
	public boolean getImportedValue() {
		return imported;
	}
	public String getType() {
		return type;
	}
	
	public Double getTaxValue() {
		return taxValue;
	}
	
	

}
