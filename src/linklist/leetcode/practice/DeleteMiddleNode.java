package linklist.leetcode.practice;

// Que :- Delete the middle node of link list

// Case 1:  1 2 3 4 5 node given middle is 3 delete it
// Case 2:  1 2 3 4 5 6 node given then middle node is 4 (Right middle) delete it
// Case 3:  1 2 3 4 5 6  node given then middle node is 3 (Left middle) delete it.

// Importatant Que

public class DeleteMiddleNode {

    public static ListNode deleteMiddleNode(ListNode head){ // Even LL and Odd LL with Rigth Middle Node delete and with 1 LL as well work
        if (head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next; // Assign to node
        return head ;
    }

    public static ListNode deleteLeftMiddleNode(ListNode head1){
        if (head1.next == null){
            return null;
        }
        ListNode slow = head1;
        ListNode fast = head1;
        while(fast.next.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head1 ;
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
        a.next.next = c;  //b.next = c;
        a.next.next.next = d; // c.next = d;
        a.next.next.next.next = e; // d.next = e
        a.next.next.next.next.next = f; //e.next = f

        System.out.println("Orginal Linked List");
        displayList(a);


        ListNode temp1 = deleteLeftMiddleNode(a);
        System.out.println("After Delete Left Middle Node of LL");
        displayList(temp1);

        ListNode  temp = deleteMiddleNode(a);
        System.out.println("After Delete Right Middle Node of LL");
        displayList(temp);


    }
}
