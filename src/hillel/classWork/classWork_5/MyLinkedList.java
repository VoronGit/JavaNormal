package hillel.classWork.classWork_5;

import java.util.ArrayList;

public class MyLinkedList<T> implements LinkedList<T> {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public void add(T value) {
        if (first == null) {
            first = new Node(value, null, null);
        } else {
            last = new Node(value, first, null);
            first.setNextLink(last);
            first = last;
            last = null;
        }
        size++;
    }

    @Override
    public void add(T value, int i) {
        Node<T> saveNode = first;                                   // Создаём сейв для нашей последней ноды.
        Node<T> added = new Node(value, null, null);
        Node<T> saved = null;
        if (i > size) return;
        if (first == null || i == size) {
            add(value);
        } else {
            if (i != 0) {
            for (int j = 0; j < size - i; j++) {
                if (first.getPrevLink() != null) first = first.getPrevLink();
                if (j == size - i - 2) saved = first;
            }
                first.setNextLink(added);
                added.setPrevLink(first);
                added.setNextLink(saved);
                saved.setPrevLink(added);
            } else {
                for (int j = 0; j < size - 1; j++) {
                    first = first.getPrevLink();
                }
                added.setNextLink(first);
                first.setPrevLink(added);
            }
            first = saveNode;
            size++;
        }
    }

    @Override
    public void remove(T value) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public String toString() {
        Node<T> saveNode = first;                               // Создаём сейв для нашей последней ноды.
        if (first == null) return "В листе нет элементов.";     // Сторожевой if, на случай отсутсвия элементов.
        String str = first.toString();                          // Присвоили в стрингу значение последнего елемента.
        while (first.getPrevLink() != null) {                   // Проверяем есть ли предидущий элемент.
            str = first.getPrevLink().toString() + ", " + str;  // Добавляем к строке предидущий элемент.
            first = first.getPrevLink();                        // Переприсваиваем "текущий елемент".
        }
        first = saveNode;                                       // Возвращаем "на место" первую ноду.
        return str;                                             // Возвращаем результат в виде строки.
    }

    class Node<T> {
        private T value;
        private Node<T> prevLink;
        private Node<T> nextLink;

        public Node(T value, Node<T> prevLink, Node<T> nextLink) {
            this.value = value;
            this.prevLink = prevLink;
            this.nextLink = nextLink;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getPrevLink() {
            return prevLink;
        }

        public void setPrevLink(Node<T> prevLink) {
            this.prevLink = prevLink;
        }

        public Node<T> getNextLink() {
            return nextLink;
        }

        public void setNextLink(Node<T> nextLink) {
            this.nextLink = nextLink;
        }

        @Override
        public String toString() {
            return (String) value;
        }
    }
}