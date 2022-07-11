package leetcode.linkedlist;

import scalar.tree.IdenticalBinaryTrees;

import java.util.HashSet;
import java.util.Stack;

public class DetectCycleInLinkedList {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> stack = new HashSet();
        ListNode node = head;
        while(node!=null){
            if(stack.contains(node)){
                return true;
            }
            stack.add(node);
            node = node.next;
        }
        return false;
    }

    public boolean hasCycleOptimised(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2!=null){
            if (node1==node2.next){
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;
        }
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
