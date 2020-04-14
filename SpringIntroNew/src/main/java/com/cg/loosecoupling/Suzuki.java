package com.cg.loosecoupling;

public class Suzuki implements Car {

	private double price;
    private String model;
	public Suzuki(double price, String model) {
		super();
		this.price = price;
		this.model = model;
	}

	public void getPrice() {
		System.out.println("your suzuki car pice is "+ price);
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setModel(String model) {
		// TODO Auto-generated method stub
		this.model=model;
		
	}

	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("your maruthi model " + model);
		
	}


}
