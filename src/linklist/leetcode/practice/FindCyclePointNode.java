package linklist.leetcode.practice;

// Most Important Question

// Que :- Find out the node where the cycle begins.
// example the node at which the tail node points


// Case 1:  List is empty
// Case 2:  List is having 1 node only
// Case 3:  Slow is having null reference
// Case 4: fast is having null reference
// Case 5: cycle is return    100 -> 13 -> 4 -> 5 -> 12 -> 10  and -> again 4
// 10 -> 4  5 linkes as pervious 2 ....- infinite cycle
// find cycl Link Begin Point in link list node as 4

// Importatant Que

public class FindCyclePointNode {


    public static ListNode cycleBeginPoint(ListNode head){
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){
            if (slow == null) return null;
            slow = slow.next;
            if (fast.next == null) return null;
            fast = fast.next.next;
            if (fast == slow) break;
        }
        ListNode temp = head;
        while (temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }

    public static class ListNode{

        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;

        }
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
        f.next =c; // cycle node link to previou node

        ListNode cyclLinkBeginPoint = cycleBeginPoint(a);
        System.out.println("Linked previous node Value : " +cyclLinkBeginPoint.val);

    }
}
