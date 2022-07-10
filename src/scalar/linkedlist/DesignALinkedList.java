package scalar.linkedlist;

public class DesignALinkedList {
    // insert_node(position, value) - To insert the input value at the given position in the linked list.
    //delete_node(position) - Delete the value at the given position from the linked list.
    //print_ll() - Print the entire linked list, such that each element is followed by a single space.

    private static Node head;
    private static int length;

    private static class Node {
        private int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position > length + 1) {
            return;
        }
        if (position == 1) {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
            length++;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        length++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position < 1 || position > length) {
            return;
        }
        if (position == 1) {
            if (head == null) {
                return;
            }
            head = head.next;
            length--;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        length--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node node = head;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                System.out.print(node.data);
            } else {
                System.out.print(node.data + " ");
            }
            node = node.next;
        }
    }

    public static void main(String[] args) {
        insert_node(1, 101);
        insert_node(2, 100);
        insert_node(1, 99);
        print_ll();
        delete_node(4);
        print_ll();
    }
}
