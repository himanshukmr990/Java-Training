package com.test.composite;

public class CompositeTest {
	
	public static void main(String[] args)
	{
		Leaf hdd = new Leaf(4000, "HDD");
		Leaf mouse = new Leaf(500, "Mouse");
		Leaf monitor = new Leaf(8000, "Monitor");
		Leaf ram = new Leaf(3000, "Ram");
		Leaf cpu = new Leaf(9000, "CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}

}
