class MyLinkedList {

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = new Node(-1);   // Dummy head
        tail = new Node(-1);   // Dummy tail

        head.next = tail;
        tail.prev = head;

        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        Node first = head.next;

        head.next = newNode;
        newNode.prev = head;

        newNode.next = first;
        first.prev = newNode;

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        Node last = tail.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = tail;
        tail.prev = newNode;

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node curr = head.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node prev = curr.prev;
        Node newNode = new Node(val);

        prev.next = newNode;
        newNode.prev = prev;

        newNode.next = curr;
        curr.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        Node curr = head.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node prev = curr.prev;
        Node next = curr.next;

        prev.next = next;
        next.prev = prev;

        size--;
    }
}