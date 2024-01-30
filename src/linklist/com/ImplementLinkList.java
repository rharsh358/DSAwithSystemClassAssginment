package linklist.com;

public class ImplementLinkList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class ImpleLinkList{
        Node head = null;
        Node tail = null;

        int size = 0;
        void insertAtEnd(int data){

            Node temp = new Node(data);
            if (head == null){
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;

            }
            size ++;
        }

        void insertAtStart(int data){

            Node temp = new Node(data);
            if (head == null){
                head = tail = temp;

            } else {
                temp.next = head;
                head = temp;
            }
            size ++;
        }

        void insertAtIndex(int idx, int data){

            Node t = new Node(data);
            Node temp = head;

            if (idx == size){
                insertAtEnd(data);
                return;
            } else if (idx == 0) {
                insertAtStart(data);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            }
            for (int i = 1; i<= idx -1;i++){
                temp= temp.next;
            }
            t.next = temp.next;
            temp.next=t;
            size ++;
        }
        void deleteAtIndex(int idx){
            if (idx == 0){
                head= head.next;
                size --;
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            }
            Node temp = head;
            for (int i =1; i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next= temp.next.next;
            tail =temp;
            size --;

        }

        int getElementByIndex(int idx){

            Node temp = head;
            if (idx < 0 || idx > size) {
                System.out.print("Invalid Index :" +idx);
                System.out.println();
                return -1;
            }
            for(int i=1;i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
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

    }

    public static void main(String[] args) {
        ImpleLinkList ll = new ImpleLinkList();
        ll.insertAtEnd(4); // 4
        ll.insertAtEnd(7); // 4 5
        //ll.display();
       // System.out.println(ll.size);
        ll.insertAtStart(3);
       // ll.display();
        ll.getElementByIndex(-8);
       // System.out.println(ll.size);
        ll.insertAtIndex(3,12);
        //ll.display();
        ll.insertAtEnd(10); // 4
        ll.insertAtStart(9);
        ll.display();
        ll.deleteAtIndex(5);
        ll.display();
        System.out.println(ll.tail.data);


    }
}
