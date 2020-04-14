package com.cg.loosecoupling;

public class Maruthi implements Car{
	
    private double price;
    private String model;
	public void getPrice() 
	{
		System.out.println("your maruthi price " +price);
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public void setModel(String model) {
		// TODO Auto-generated method stub
		this.model = model;
		
	}

	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("your maruthi model " +model);
	}
    

}
