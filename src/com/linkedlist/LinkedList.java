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
	    
	    //deleting first element in a linkedlist using pop method
	    
	    public void  pop() {
	        if (head == null) {
	            System.out.println("List is empty");

	        } else {

	            if (head != tail) {
	                head = head.next;
	            }
	            else {
	                head = tail = null;
	            }
	        }
	    }
	    
	    //deleting last element in a linkedlist using poplast method
	    
	    public void  popLast(){
	        if(head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        else {
	            if(head != tail ) {
	                Node current = head;
	                while(current.next != tail) {
	                    current = current.next;
	                }
	                tail = current;
	                tail.next = null;
	            }
	            else {
	                head = tail = null;
	            }
	        }
	    }
	    
}
