package pw;

// Recursion for Reversal
// Reverse the Linked List using extra space with recursion

public class ReverseListUsingRecursionWithExtraSpace {

    public static ListNode reverseRecursionLL(ListNode head) {
        if (head.next == null) return head;
        ListNode newHead = reverseRecursionLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void displayList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(8);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(10);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        System.out.println("Original First List");
        displayList(l1);
        System.out.println("Reverse Recursion List");
        ListNode resultList = reverseRecursionLL(l1);
        displayList(resultList);


    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
