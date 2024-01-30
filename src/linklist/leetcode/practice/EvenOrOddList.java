package linklist.leetcode.practice;

 /*Given the head of single link list group all the node with Odd indices together
   followed by thebnodes with even indices & retun reordered list
   Space Comp O(1) and  Time Compe O(n)
  */

public class EvenOrOddList {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode oddEvenList(ListNode head){
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);

        ListNode tempOdd = odd;
        ListNode tempEven = even;
        ListNode temp = head;

        while (temp != null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            tempEven.next = temp;
            if (temp == null) break;
            temp = temp.next;
            tempEven = tempEven.next;
        }

        odd = odd.next;
        even = even.next;
        tempOdd.next =even;
        return odd;

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

        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(11);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(5);

        l1.next = l2;
        l2.next =l3;
        l3.next =l4;
        l4.next = l5;
        l5.next =l6;

        System.out.println("Original List");
        displayList(l1);

        System.out.println("List of Even Odd List");
        ListNode EvenOdd = oddEvenList(l1);
        displayList(EvenOdd);



    }
}
