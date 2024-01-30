package linklist.leetcode.practice;

public class Solution {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static class LeetCodeLinkList {
       ListNode head = null;
        ListNode tail = null;

        int size = 0;
        void insertAtEnd(int data){

            ListNode temp = new ListNode(data);
            if (head == null){
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;

            }
            size ++;
        }

        void insertAtStart(int data){

            ListNode temp = new ListNode(data);
            if (head == null){
                head = tail = temp;

            } else {
                temp.next = head;
                head = temp;
            }
            size ++;
        }




        void display(){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        /*int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count ++;
                temp = temp.next;
            }
            return count;
        }*/

         /* Question : Can we delete a node given the node itself as parameter ?
            Is there any efficient way, provided that the given node is not  the last node ? */

        void deleteNode(ListNode node){

            if (node == null || node.next == null) {
                // Cannot delete if the node is null or the last node
                return;
            }
            node.val = node.next.val;
            node.next =node.next.next;
        }

    }


    public static void main(String[] args) {
        LeetCodeLinkList linkList = new LeetCodeLinkList();
        /*linkList.insertAtEnd(5);
        linkList.insertAtEnd(7);
        linkList.insertAtEnd(9);
        linkList.insertAtEnd(3);
        linkList.insertAtEnd(8);
        linkList.display();

        linkList.deleteNode(new ListNode(1));*/

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        linkList.display();




    }
}
