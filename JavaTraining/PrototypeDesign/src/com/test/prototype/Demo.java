package com.test.prototype;

public class Demo 
{
   public static void main(String args[]) throws CloneNotSupportedException
   {
	   BookShop bs = new BookShop();
	   bs.setShopName("Novelty");
	   bs.loadData();
	   
	   
	 //  BookShop bs1 = new BookShop();
	   BookShop bs1 = bs.clone();
	   bs.getBooks().remove(2);
	   bs1.setShopName("A1"); 
	   
	   System.out.println(bs);
	   System.out.println(bs1);
   }
}



//This is shallow clonning another one is deep cloning
//Clone Method is protected you cannot used that
//First of all you need to give permission to the class
//Clonable is the marker interface i.e no method in interface
//you need to override