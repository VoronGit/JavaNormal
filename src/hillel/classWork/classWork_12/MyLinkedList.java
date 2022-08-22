package hillel.classWork.classWork_12;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int item) {
        if (head == null) {
            this.head = new Node(item);
        } else {
            Node tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(new Node(item));
        }
        size++;
    }

    public int get(int index) {
        if (head == null || index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node temp = head;
            for (int i = 0; i <= index - 1; i++) {
                temp = temp.getNext();
            }
            return temp.getItem();
        }
    }

    public void remove(int index) {
        if (head == null || index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index == 0) {
            head = head.getNext();
        } else {
            Node temp = head;
            for (int i = 0; i <= index - 2; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node tempNode = head;
        while (tempNode != null) {
            result[index++] = tempNode.getItem();
            tempNode = tempNode.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
