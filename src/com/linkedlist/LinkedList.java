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
	    
	    public void display() {
	        Node<T> temp = head;
	        while (temp != null) {
	            System.out.print(temp.key + " -> ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    
	    //insert elements between elements in a linkedlist
	    public void insert(T key,int position){
	        //Create a new node
	        Node<T> newNode = new Node(key);
	        if(head == null) {
	            //If list is empty, both head and tail would point to new node
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            Node temp, current;
	            temp = head;
	            current = null;
	            for(int i = 0; i < position; i++) {
	                //Node current will point to temp
	                current = temp;
	                //Node temp will point to node next to it.
	                temp = temp.next;
	            }
	            //current will point to new node
	            current.next = newNode;
	            //new node will point to temp
	            newNode.next = temp;
	        }

	    }
	    
	    
}
