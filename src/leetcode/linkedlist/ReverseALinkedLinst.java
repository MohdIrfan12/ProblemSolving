package leetcode.linkedlist;

public class ReverseALinkedLinst {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next =  new ListNode(2);
        head.next.next =  new ListNode(3);
        head.next.next.next =  new ListNode(4);
        head.next.next.next.next =  new ListNode(5);

        ListNode listNode = reverseList(head);
        System.out.println(listNode.val);
    }

    private static ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prevNode = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prevNode;
            prevNode = node;
            node = temp;
        }
        return prevNode;
    }

    private static class ListNode {
        int val;

        ListNode(int val) {
            this.val = val;
        }

        ListNode next;
    }
}
