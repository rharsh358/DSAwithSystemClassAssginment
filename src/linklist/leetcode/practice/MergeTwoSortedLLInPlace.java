package linklist.leetcode.practice;


// Merge two sorted list no space or inplace
// given both list should be sorted

public class MergeTwoSortedLLInPlace {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
           // next = null;
        }

    }

    public static ListNode mergeTwoSortedLLInplace(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(4);
        ListNode temp = head;

        while (temp1 != null && temp2 != null){
            if (temp1.val < temp2.val){
                temp.next =temp1;
                temp =temp1;
                temp1 = temp1.next;
            } else {
                temp.next =temp2;
                temp =temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null){
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
    }

    public static void displayList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val +" ");
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
        l2.next =l3;
        l3.next =l4;
        l4.next = l5;
        l5.next =l6;
        l6.next = l7;

        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(6);
        ListNode p4 = new ListNode(11);

        p1.next = p2;
        p1.next.next =p3;
        p1.next.next.next =p4;


        System.out.println("Original First List");
        displayList(l1);
        System.out.println("Orginal Second List");
        displayList(p1);
        System.out.println("Megre Sort inPlace");
        ListNode sortedList = mergeTwoSortedLLInplace(l1,p1);
        displayList(sortedList);

    }
}
