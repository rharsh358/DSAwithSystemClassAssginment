package pw;

 /* Construct a deep copy of a linked List where eah node contains an additional random
 point which could point to any node in the list or null
  */
// Hint
// Step 1:-  Create Deep Copy
// Step 2:-  Alternate the connection
// Step 3:- Assigning random points
// Steps 4:-  Separate the List

// List      7    13  11  10   1   null
// Ranodm  null    7   1  11   7

public class RandomeLinkList {

    public static Node copyRandomList(Node head) {

        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        // Creating Deep Copy
        while (temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // Alternate the Connection
        Node temp = new Node(-1);
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;

        }
        temp2 = head2;
        temp1 = head;
        // Assigning Random Pointer
        while (temp1 != null) {
            if (temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if (temp1 != null) temp2 = temp1.next;
        }

        temp2 = head2;
        temp1 = head;
        // Separate the List
        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp1 == null) break;
            temp2.next = temp1.next;
            if (temp2 == null) break;
            temp2 = temp2.next;
        }

        return head;
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node l1 = new Node(7);
        Node l2 = new Node(13);
        Node l3 = new Node(11);
        Node l4 = new Node(10);
        Node l5 = new Node(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        /*System.out.println("Original List");
        displayList(l1);*/

        System.out.println("Random List");
        Node copyList = copyRandomList(l1);
        displayList(copyList);


    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

    }
}
