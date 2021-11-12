/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emira
 */
public class StackArray {
    int data[];
    int top;
    
    public StackArray(int N) {
        data = new int [N];
        top= -1;
        
    }
    
    public void push(int element) {
        if(!isFull()) {
            top++;
            data[top] =element;
        }
    }
    
    public int pop() {
        if(isEmpty()) 
            throw new java.util.NoSuchElementException();
        
        else {
            top--;
            return data[top+1];
        }
    }
    
    public boolean isFull() {
        if (top==data.length-1)
            return true;
        else {return false;
        
        }
    }
    
     public boolean isEmpty() {
        if (top==-1)
            return true;
        else {return false;
        
        }
    }
    
    
    
}
