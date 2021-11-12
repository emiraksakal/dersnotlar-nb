/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.LinkedList;

/**
 *
 * @author emira
 */
public class MyDoubleLinkedList {
DoubleNode first;
DoubleNode last;
public MyDoubleLinkedList(){
first = null;
last = null;
}

LinkedList list = new LinkedList();

//methods

void insertFirst(DoubleNode newNode){
if (last == null)
last = newNode;
else
first .previous = newNode;
newNode.next = first;
first = newNode;
}


void insertLast(DoubleNode newNode){
if (first == null)
first = newNode;
else
last.next = newNode;
newNode.previous = last;
last = newNode;
}

void insertMiddle(DoubleNode newNode, DoubleNode previous){
newNode.next =previous.next;
newNode.previous = previous;
previous.next.previous = newNode;
previous.next = newNode;
}

void deleteFirst(){
first = first.next;
if (first == null)
last = null;
else
first.previous = null;
}


void deleteLast(){
last = last.previous;
if (last == null)
first = null;
else
last.next = null;
}


void deleteMiddle(DoubleNode s){
s.next.previous=s.previous;
s.previous.next =s.next;
}

// void DoubleNode middle(){ 
//size dan gidebilir miyim};


void swap(DoubleNode f, DoubleNode s){
    if(f!=last || f!=first) {
    s.next=f.next;
    f.previous=s.previous;
    f.previous.next=s.next;
    //
    }
}

void remove(DoubleNode n){
    
    
    DoubleNode back = n.previous;
    DoubleNode front = n.next;
	back.next = front;
	front.previous = back;
}
    
    /*if(n!=last || n!=first) {
        n.next=n.previous.next;
        n.previous=n.next.previous;
        n=null;
        //listeden atabiliyor muyum direkt?bak
    }
    
    else if(n==first) {
        n.next=first;
         n=null;
    }
    
    else if(n==last){
        n.previous=last;
         n=null;
    }
*/



 public MyDoubleLinkedList merge(MyDoubleLinkedList second){return null; //
};
 
 void cutPaste(DoubleNode cutStart, DoubleNode cutEnd,DoubleNode pasteStart){
    cutStart.previous=cutEnd.next.previous; //2
    pasteStart.next=cutStart; //7
    
 
 };
 
 int findMax(){
     int max = 0;
     for (int i = 0; i <list.size() ; i++) {
         for (int j = i+1; j <list.size(); j++) {
             if(i>j) {
                 max=i;
             }
         }
     
     }
     return max;
}

}

