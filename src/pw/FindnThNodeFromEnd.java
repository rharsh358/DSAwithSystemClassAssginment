package pw;

// Finding  Nth Node from the end of linked list
// Formula need to calculate  nth from last = (m-n+1) node from start
//// Asked in interview 50 %

public class FindnThNodeFromEnd {

    public static ListNode nthNodeFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;

        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
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

        ListNode nthNode = nthNodeFromEnd(a, 3);
        System.out.println(nthNode.val);

    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;

        }
    }
}
