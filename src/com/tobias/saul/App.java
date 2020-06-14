package com.tobias.saul;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Queue<String> orders = new PriorityQueue<String>();

		orders.add("order1");
		orders.add("order2");
		orders.add("order3");
		orders.add("order4");
		orders.add("order5");
		orders.add("order6");
		
		System.out.println("Current orders");
		orders.stream().collect(Collectors.toList()).forEach(order -> System.out.println(order));
		System.out.println();
		
		System.out.println("Peeking....");
		System.out.println(orders.peek());
		System.out.println();
		
		System.out.println("Polling...");
		System.out.println(orders.poll());
		System.out.println();
		
		System.out.println("Current Orders");
		orders.stream().collect(Collectors.toList()).forEach(order -> System.out.println(order));
		System.out.println();
		
		System.out.println("Size: " + orders.size());
	}

}
