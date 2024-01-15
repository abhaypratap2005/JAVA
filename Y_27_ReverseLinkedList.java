public class Y_27_ReverseLinkedList {

    Node head;
    private int size;

    Y_27_ReverseLinkedList() {
        this.size = 0;
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
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }


        //reverse Iterate
    public void reverseIterate(){

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nexNode = curNode.next;
            curNode.next = prevNode;

            // update
            prevNode = curNode;
            curNode = nexNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head ){

        if(head==null || head.next == null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next= head;

        head.next= null;

        return newHead;
    }

    public static void main(String[] args) {
        Y_27_ReverseLinkedList list= new Y_27_ReverseLinkedList();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // list.getSize();
        // list.printList();

        // System.out.println(list.getSize());
        // list.addFirst("this");
        // System.out.println(list.getSize());

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        list.reverseRecursive(list.head);
        list.printList();

    }
}
