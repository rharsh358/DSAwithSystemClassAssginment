package linklist.leetcode.practice;

// Most Important Question

// Que :- Cycle in Linked List


// Case 1:  List is empty
// Case 2:  List is having 1 node only
// Case 3:  Slow is having null reference
// Case 4: fast is having null reference
// Case 5: cycle is return    1 -> 2 -> 3 -> 4 -> 5 and -> again 2
// 5 -> 2  5 linkes as pervious 2 ....- infinite cycle

// Importatant Que

public class CycleLL {


    public static boolean hasCycle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){
            if (slow == null) return false;
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
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

        boolean temp;

        temp= hasCycle(a);


        System.out.println("Cycle Link List :- " +temp);


        

    }
}
