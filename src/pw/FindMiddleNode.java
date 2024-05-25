package pw;

// Que :- Finding the middle node of link list

// Case 1:  1 2 3 4 5 node given middle is 3 find it
// Case 2:  1 2 3 4 5 6 node given then middle node is 4 (Right middle)
// Case 3:  1 2 3 4 5 6  node given then middle node is 3 (Left middle)
// in case2 and case 3 most of the time middle should be case 3.
// some time perticular given to follow case 2
// Importatant Que

public class FindMiddleNode {

    public static ListNode findRightMiddleAndEvenMiddleOfLL(ListNode head) { // find case 1 and case 2

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode findLeftMiddleOfLL(ListNode head) {  // find case 3

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
        a.next.next = c;  //b.next = c;
        a.next.next.next = d; // c.next = d;
        a.next.next.next.next = e; // d.next = e
        a.next.next.next.next.next = f; //e.next = f

        ListNode p = new ListNode(3);
        ListNode q = new ListNode(5);
        ListNode r = new ListNode(8);
        ListNode s = new ListNode(11);
        ListNode t = new ListNode(17);

        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;


        displayList(a);
        System.out.println("Right Middle Node of the Even LL :" + findRightMiddleAndEvenMiddleOfLL(a).val);
        displayList(p);
        System.out.println("Middle Node of the Odd LL :" + findRightMiddleAndEvenMiddleOfLL(p).val);
        displayList(a);
        System.out.println("Left Middle Node of the Even LL :" + findLeftMiddleOfLL(a).val);


    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;

        }
    }
}
