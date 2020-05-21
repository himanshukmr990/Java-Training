package com.test.observer;

public class Youtube {
    public static void main(String args[])
    {
    	Channel technical = new Channel();
    	Subscriber s1 = new Subscriber("Akshay");
    	Subscriber s2 = new Subscriber("Sonam");
    	Subscriber s3 = new Subscriber("Harsh");
    	Subscriber s4 = new Subscriber("Kiran");
    	Subscriber s5 = new Subscriber("Pravin");
    	
    	technical.subscribe(s1);
    	technical.subscribe(s2);
    	technical.subscribe(s3);
    	technical.subscribe(s4);
    	technical.subscribe(s5);
    	
    	technical.unSubscribe(s3);
    	
    	s1.subscribeChannel(technical);
    	s2.subscribeChannel(technical);
    	s3.subscribeChannel(technical);
    	s4.subscribeChannel(technical);
    	s5.subscribeChannel(technical);
    	
    	technical.upload("How to learn programming?");
    }
}
