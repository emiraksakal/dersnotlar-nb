/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cevap;

/**
 *
 * @author elifd
 */
public class LinkedList {
  public static void main(String[] args) {
        LinkedList ml = new LinkedList();
        ml.insertFirst(100);
        ml.insertFirst(101);
        ml.insertFirst(202);
        ml.insertLast(312);
        System.out.println(ml);

        ml.insertFirst(249);
        ml.insertFirst(349);
        ml.insertLast(531);
        ml.insertLast(111);

        // search and insert after
        Node temp = ml.search(249);
        ml.insertLast(111);
        System.out.println(ml);

        // Remove
        ml.removeFirst();
        System.out.println(ml);
        ml.removeLast();
        ml.removeFirst();
        System.out.println(ml);

        // remove after
        temp = ml.search(100);
        ml.removeAfter(temp);
        System.out.println(ml);

        LinkedList m2 = new LinkedList();
        m2.insertFirst(10);
        m2.insertFirst(10);
        m2.insertFirst(10);
        m2.insertFirst(10);
        System.out.println("Sum :"+m2.getSum());
        m2.insertLast(100);
        System.out.println(m2);
        m2.swapNodes(m2.first, m2.last);
        System.out.println(m2);





    }
    Node first, last;
    int size = 0;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node tmp = first;
        first = first.next;
        size--;
        return tmp;
    }

    public Node removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node tmp = last;
        Node prev = first;
        while (prev.next != last) {
            prev = prev.next;
        }
        prev.next = null;
        last = prev;

        size--;
        return tmp;
    }

    public Node removeAfter(Node prev) {
        Node tmp = prev.next;
        prev.next = prev.next.next;
        size--;
        return tmp;
    }

    public void removeNode(Node n) {
        if (isEmpty()) {
            return;
        }
        if (n == first) {
            removeFirst();
        } else if (n == last) {
            removeLast();
        } else {
            Node tmp = first;
            Node prev = null;
            while (tmp != n) {
                prev = tmp;
                tmp = tmp.next;
            }
            prev.next = n.next;
            n.next = null;
            size--;
        }
    }

    public void insertFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void insertAfter(Node p, int x) {
        Node newNode = new Node(x);
        if (p == null || size == 0) {

            return;
        }
        if (p == last) {
            insertLast(x);
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
        size++;
    }

    public void insertAfter(Node p, Node q) {
        q.next = p.next;
        p.next = q;
        if (p == last) {
            last = q; // q must be new last/ 
        }
        size++;
    }

    public void insertLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node search(int value) {
        Node tmp = first;
        while (tmp != null) {
            if (tmp.data == value) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public String toString() {
        Node tmp = first;
        String str = "List with " + size + " elements: ";

        while (tmp != null) {
            str += tmp.data + "->";
            tmp = tmp.next;
        }
        str += "\n first: " + first.data + " last: " + last.data;

        return str;
    }

    public int getSum() {
        int sum = 0;
        Node tmp = first;
        while (tmp != last) {
            sum = sum + tmp.data;
            tmp = tmp.next;
        }
        sum = sum + tmp.data;
        return sum;
    }

    public void swapNodes(Node P, Node Q) {
        // need to find previous nodes to p and q
        Node tmp = first;
        Node prevP = null;
        Node prevQ = null;
        while (tmp != P && tmp != last) {
            prevP = tmp;
            tmp = tmp.next;
        }
        tmp = first;
        while (tmp != Q && tmp != last) {
            prevQ = tmp;
            tmp = tmp.next;
        }

        boolean isQLast = Q == last;
        boolean isPLast = P == last;
        System.out.println("here :" + this);

        if (prevP != null) // means P is not the first
        {
            prevP.next = Q;
        } else {
            first = Q;
        }

        if (prevQ != null) // means Q is not the first
        {
            prevQ.next = P;
        } else {
            first = P;
        }

        // now complete the swap.
        Node tmp3 = Q.next;
        Q.next = P.next;
        P.next = tmp3;

        //now mark the last if changed
        if (isQLast) {
            last = P;
        } else if (isPLast) {
            last = Q;
        }
    }

}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}