package scalar.stack;

import java.util.Stack;

public class Impl {

    private Node head;

    public void push(int x) {
       Node node = new Node(x);
       if (head==null){
           head = node;
           head.minElement = x;
           return;
       }
       node.minElement = Math.min(head.minElement,node.data);
       node.next = head;
       head = node;
    }

    public void pop() {
        if (head==null){
            return;
        }
        head = head.next;
    }

    public int top() {
       if (head==null){
           return -1;
       }
       return head.data;
    }

    public int getMin() {
        if (head==null){
            return -1;
        }
        return head.minElement;
    }

    private static class Node {
        private final int data;
        private Node next;
        private int minElement;

        private Node(int data) {
            this.data = data;
        }
    }
}
