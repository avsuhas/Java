package com.samsonsoft.practice;

import java.util.ArrayList;

public class NameQueue {
	
	ArrayList<Integer> queue = new ArrayList<Integer>();
	
	public void enqueue(int num){	
		queue.add(num);
		}
	
	public void dequeue(){		
		System.out.println("deleted element= "+queue.remove(0));
	}
	
	 public void display(){
		 for(int i=0; i<queue.size();i++){
			 System.out.print(queue.get(i));
		 }
	 }
	 
 public static void main(String[] args){
	 NameQueue q = new NameQueue();
	 
	 q.enqueue(1);
	 q.enqueue(2);
	 q.enqueue(3);
	 q.enqueue(4);
	 q.enqueue(5);
	 
	 q.display();
	
	 q.dequeue();
	 q.dequeue();
	 q.dequeue();
	 
	 q.display();
	
 }
}
