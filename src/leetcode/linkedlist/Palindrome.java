package leetcode.linkedlist;

public class Palindrome {


    private static class ListNode {
        int val;
        ListNode(int val) {
            this.val = val;
        }
        ListNode next;
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        while(node!=null){
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        ListNode node1 = head;
        ListNode node2 = prev;
        while(node1!=null){
            System.out.println(node1.val+" "+node2.val);
            if(node1.val!=node2.val){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next =  new ListNode(2);
//        head.next.next =  new ListNode(3);
//        head.next.next.next =  new ListNode(4);
//        head.next.next.next.next =  new ListNode(5);

        ListNode head = new ListNode(1);
        head.next =  new ListNode(1);
        head.next.next =  new ListNode(2);
        head.next.next.next =  new ListNode(1);
        boolean status= isPalindrome(head);
        System.out.println(status);
    }
}
