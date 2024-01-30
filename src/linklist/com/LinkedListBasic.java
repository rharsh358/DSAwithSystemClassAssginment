package linklist.com;


public class LinkedListBasic {

    public static void displayList(Node head){
        if (head == null) {
            System.out.println("Empty link list");
        } else {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

    public static void displayListRecursion(Node head){
        if (head == null) return;
        System.out.print(head.data+" ");
        displayListRecursion(head.next);
    }

    public static void displayListRecursionReverse(Node head){
        if (head == null) return;
        displayListRecursionReverse(head.next);
        System.out.print(head.data+" ");
    }

   public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }



    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        //System.out.println(a);

        /*System.out.println("Printing the Data in Scratch");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);*/

        //Node temp = a;

        //Print the List
        /*for(int i=1; i<=5; i++){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }*/

        //Print the List
        /*while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }*/

        displayList(a);
        System.out.println();
        displayListRecursion(a);
        System.out.println();
        displayListRecursionReverse(a);
        //displayListRecursion(a);
        //displayListRecursionReverse(a);

    }
}
