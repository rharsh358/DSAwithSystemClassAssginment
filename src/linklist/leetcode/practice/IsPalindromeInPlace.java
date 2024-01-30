package linklist.leetcode.practice;

// Checked whether List is Palindrome or not
// dont used extra space

public class IsPalindromeInPlace {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while (curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList((slow.next));
        slow.next = temp;

        ListNode p1 = head;
        ListNode p2 = slow.next;

        while (p2 != null){
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
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
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(1);

        l1.next = l2;
        l2.next =l3;
        l3.next =l4;
        l4.next = l5;
        l5.next =l6;

        System.out.println("Original List");
        displayList(l1);

        boolean isPalindrome = isPalindrome(l1);
        System.out.println("Is Palindrome List:-  "+isPalindrome);

    }
}
