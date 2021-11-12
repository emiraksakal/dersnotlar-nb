package ll;

/**
 *
 * @author btek (modified by cmshalom)
 * @version 2020
 */
public class DoublyLinkedList {
	private class Node{
	    int data;
	    Node next=null;
	    Node prev= null;
	    
	    Node(int data){
	        this.data = data;
	    }
	    
	    public String toString(){
	        return "Node: "+data;
	    }
	}

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertOrdered(8);
        dl.insertOrdered(15);
        dl.insertOrdered(43);
        dl.insertOrdered(3);
        dl.insertOrdered(99);
        dl.prepend(100);
        dl.append(1);
        System.out.println(dl);
    }
    
    public int getSize() {
    	return size;
    }
    
    public void prepend(int i){
        Node node = new Node(i);
        node.next = head;
        if(head == null){
            tail = node;
        } else{
            head.prev = node;
        }
        head = node;
        size++;
    }
    
    public void append(int i){
        Node node = new Node(i);
        node.prev = tail;
        if(tail==null){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }
    
    public void insertOrdered(int i){
        Node newNode = new Node(i); 

        Node node = head;
        while(node!=null && node.data<i){
            node=node.next;
        }

        newNode.next=node;
        if (node != null) {
        	newNode.prev = node.prev;
        	node.prev = newNode;
        } else {
            newNode.prev = tail;
            tail = newNode;
        }
        
        if (newNode.prev != null) {
        	newNode.prev.next = newNode;
        } else {
        	head = newNode;
        }
        size++;        
    }
    
    public int countPositives(){
        // Quiz question
        int pos=0;
        
        return pos;
    }
    
    public int findMax(){
        // Quiz question
        int max=0;
        
        return max;
    }
    
    public String toString(){
        Node node = head;
		StringBuilder sb = new StringBuilder();
        while(node != null){
        	if (sb.length() != 0) sb.append(", ");
            sb.append(node.data);
            node = node.next;
        }
        return sb.toString();
    }
    
}
