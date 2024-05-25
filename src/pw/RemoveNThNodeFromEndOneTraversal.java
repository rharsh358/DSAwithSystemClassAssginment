package pw;

// Que :- Remove  Nth Node from the end of linked list in one traversal
// Asked in interview 90 %
// Que:- Remove Nth node from end of linked list in one traversal  n= 1st node from end.
// Any pos node from end(Except first node = head) and last node(tail)
// Both question solution work below one

public class RemoveNThNodeFromEndOneTraversal {

    public static ListNode remvNthNodeFromEndOneTravers(ListNode head, int n) {


        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

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

        ListNode a = new ListNode(100);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        displayList(a);
        a = remvNthNodeFromEndOneTravers(a, 6);
        displayList(a);

    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;

        }
    }
}
