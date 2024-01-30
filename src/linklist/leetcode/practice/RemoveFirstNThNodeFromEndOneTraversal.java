package linklist.leetcode.practice;


// Asked in interview 90 %
// Que:- Remove Nth node from end of linked list in one traversal.
// n= mth  node from end (where  m = no of nodes )
// Means :- first node of list (head One)

// slight diffrent than last node delete and nth node delete

public class RemoveFirstNThNodeFromEndOneTraversal {

    public static void remvFirstNthNodeFromEndOneTravers(ListNode head, int n){


        ListNode slow = head;
        ListNode fast = head;

        for (int i =1;i<= n;i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }

    public static void displayList(ListNode head){
        ListNode temp = head;
        while (temp !=  null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
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
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        displayList(a);
        remvFirstNthNodeFromEndOneTravers(a,2);
        displayList(a);

    }
}
