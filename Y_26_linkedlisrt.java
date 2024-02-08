
public class Y_26_linkedlisrt {
    Node head;
    private int size;

    Y_26_linkedlisrt(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add -first,
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while ((currNode.next != null)) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while ((currNode != null)) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list empty");
            return;

        }
        head = head.next;
    }
    
    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
           secondLast.next=null;
    }

    //get size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Y_26_linkedlisrt list = new Y_26_linkedlisrt();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        
        list.addFirst("this");
        list.printList();
        
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getSize();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());

    }
}