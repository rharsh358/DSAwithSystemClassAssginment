package pw;

/* Question : Can we delete a node given the node itself as parameter ?
            Is there any efficient way, provided that the given node is not  the last node ? */

class ListNode {
    int val;
    ListNode next;

    ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {  // Cannot delete if the node is null or the last node
            return;
        }

        node.val = node.next.val; // Copy the data from the next node to the current node
        node.next = node.next.next; // Update the next pointer to skip the next node
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Deleting the node with value 2
        deleteNode(head.next);

        System.out.println("\nLinked List after deleting node with value 2:");
        printLinkedList(head);
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
