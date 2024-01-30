package linklist.leetcode.practice;

// Que :- Finding the intersection of two link list
// Importatant Que

public class InterSectionOfTwoLL {

    public static ListNode remvNthNodeFromEndOneTravers(ListNode headA, ListNode headB){

        ListNode tempA = headA;
        ListNode tempB = headB;

        int legthA = 0;
        while(tempA != null) { // calculating legth of first ll for for compare (m-n)
            legthA++;
            tempA = tempA.next;
        }

        int legthB = 0;
        while(tempB != null) { // calculating legth of second ll for for compare (m-n)
            legthB++;
            tempB = tempB.next;
        }

        tempA = headA;  //very imporatant to assign again
        tempB = headB;  // very important to assign again

        if (legthA > legthB){  // compare both list node to perticuler point as per size (m-n) if first LL is big
            int steps = legthA - legthB;
            for (int i=1 ; i<= steps; i++){
                tempA = tempA.next;
            }
        } else {   // compare both list so will move big list node to perticuler point as per size (m-n) if second LL is big
            int steps = legthB-legthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB){  // move the both node till the intersection will get
            tempA= tempA.next;
            tempB=tempB.next;
        }

        return tempA;
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


        ListNode p = new ListNode(90);
        ListNode q = new ListNode(9);
        p.next = q;
        p.next.next =d;


        displayList(a);
        displayList(p);
        System.out.println("Intersection of Two LL : " +remvNthNodeFromEndOneTravers(a,p).val);

    }
}
