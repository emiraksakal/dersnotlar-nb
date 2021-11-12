/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emir;

/**
 *
 * @author emira
 */
public class MyLinkedListy {
    
    Node first; //head
    Node last;
    int size;
    
    MyLinkedListy() {
        first=null;
        last=null;
        size=0;
    }
    
    //NODE
    public class Node{
        int data;  //node'un değeri olacak
        Node next; //Node'den sonra gelen Node olacak
        
        //constructor
        Node(int data) {
            this.data=data;
            this.next= null; 
        }
    }
    //NODE
    
    
    public void insertFirst(int x) {
        Node newNode = new Node(x);
        if (first==null) {
            newNode =first;
            newNode=last;
        }
        else {
            newNode.next=first;
            first=newNode;
        }
        size++;
    }
    
    
    public void insertLast(int x) {
        Node newNode = new Node(x);
        if (first==null) {
            newNode = first;
            newNode = last;
        }
        else{
            last.next=newNode;
            newNode=last;
        }
        size++;
    }
    
    public Node removeFirst(){
        if (first==null) {
           return null;
        }
        else{
            Node tmp=first;
            tmp.next=first;   //first = first.next;
            size--;
            return tmp;
        }
    }    
    
    public Node removeLast() {
        if(first==null) {
            return null;
        }
        else {
            Node tmp = last;
            Node prev= first;
            
            while(prev.next!=last) {
                prev =prev.next;
            }
            
            prev.next = null;
            last=prev;  
            size--;
            return tmp;
            
        }
    }
    
    
     public Node removeAfter(Node prev) {
        Node tmp = prev.next;
        prev.next = prev.next.next;
        size--;
        return tmp;
    }
    
    
}
