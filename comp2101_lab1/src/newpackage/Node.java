/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author emira
 */
public class Node {
    int data;
	Node next;
	
	Node(){
		this.data = -1;
		this.next = null;
	}
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
    
}
