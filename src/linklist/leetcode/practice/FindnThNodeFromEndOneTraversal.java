package linklist.leetcode.practice;

// Finding  Nth Node from the end of linked list in one traversal
// Asked in interview 90 %


public class FindnThNodeFromEndOneTraversal {

    public static ListNode nthNodeFromEndOneTravers(ListNode head, int n){


        ListNode slow = head;
        ListNode fast = head;

        for (int i =1;i<= n;i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
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
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ListNode nthNode = nthNodeFromEndOneTravers(a,4);
        System.out.println(nthNode.val);

    }
}
