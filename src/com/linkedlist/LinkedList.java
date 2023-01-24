package com.linkedlist;

public class LinkedList<T> {
	    Node<T> head;
	    Node<T> tail;
	    
	    public void add(T key){
	        Node<T> newNode = new Node<>(key);
	        if (head == null){
	            head=newNode;
	            tail= newNode;
	        }else {
	            newNode.next = head;
	            head = newNode;
	        }

	    }
	    //to display the elements
	    public void display() {
	        Node<T> temp = head;
	        while (temp != null) {
	            System.out.print(temp.key + " -> ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    
	  
	    
	    
}
