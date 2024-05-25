package pw;

// Checked whether List is Palindrome or not
// dont used extra space

public class TwinSumOfEvenLL {

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static int pairSumOfEvenList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList((slow.next));
        int maxSum = 0;
        ListNode p1 = head;
        ListNode p2 = slow.next;

        while (p2 != null) {
            int sum = p1.val + p2.val;
            if (maxSum < sum)
                maxSum = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
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

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(13);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;

        System.out.println("Original List");
        displayList(l1);

        int twinSum = pairSumOfEvenList(l1);
        System.out.println("Maximum Twin Pair of Even List:-  " + twinSum);

    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
