/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package newpackage;


//class LinkedList {}
/*{ 
    Node head;  

    public void push(int new_data) 
    { 
     
        Node new_node = new Node(new_data); 
    new_node.next = head; 
  head = new_node; 
    } 
  
    
    public void insertAfter(Node prev_node, int new_data) 
    { 
        
        if (prev_node == null) 
        { 
            System.out.println("cannot be null); 
            return; 
        } 
  
   
        Node new_node = new Node(new_data); 
  
        new_node.next = prev_node.next;
        prev_node.next = new_node; 
        
    public void append(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        if (head == null) 
        { 
            head = new Node(new_data); 
            return; 
        } 
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        return; 
    } 
    
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        
        LinkedList liste = new LinkedList(); 
        liste.append(3);
       // last.add(3);
        liste.append(8);
       // last.add(8);
        liste.append(-1);
       // last.add(-1);
        liste.append(9);
       // first.add(9);
//        liste.append17);
       // last.add(17);
        liste.append63);
       // first.add(6);
        liste.insertAfter(11,349);
        
         static Node remove(Node b, int index) {
	Node c = b;
	
	for(int i = 1; i<index; i++) {
		c = c.next;
	}
	c.next = c.next.next;
	return c;
}
         
         static int get(Node b, int index) {
	Node c = b;
	
	for(int i = 0; i<index; i++) {
		c = c.next;
	}
	return c.data;
}
         
         public static Node deleteLast(Node list,String str)
    {
       while(temp != null){
  prev = temp;
  temp = temp.getNext();
}
prev.next = null;
        }
        
  
    
} 
//çalışma kısmı

/* //public class MyLinkedList {
    LinkedList<Integer> liste = new LinkedList<Integer>();
    Node head,tail;
    
    static int get(Node b, int index) {
	Node c = b;
	
	for(int i = 0; i<index; i++) {
		c = c.next;
	}
	return c.data;
}
    
    static Node remove(Node b, int index) {
	Node c = b;
	
	for(int i = 1; i<index; i++) {
		c = c.next;
	}
	c.next = c.next.next;
	return c;
}
    
    static Node addLast(Node b, int value) {
	Node c = b;
	
	while(c.next != null) {
		c = c.next;
	}
	c.next = new Node(value);
	
	return b;
}   
    
    static Node addMiddle(Node b, int index, int value) {
	Node c = b;
	
	for(int i = 1; i<index; i++) {
		c = c.next;
	}
	
	Node add = new Node(value, c.next);
	c.next = add;
	
	return b;
}
    static Node addFirst(Node b, int value) {
	Node c = new Node(value, b);
	return c;
}
}
