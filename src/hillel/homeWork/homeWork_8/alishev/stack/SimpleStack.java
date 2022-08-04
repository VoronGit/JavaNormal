package hillel.homeWork.homeWork_8.alishev.stack;

public class SimpleStack<T> {
    private T[] stackArr;
    private int maxSize;
    private int top;

    public SimpleStack(int maxSize) {
        this.stackArr = ((T[]) new Object[maxSize]);
        this.maxSize = maxSize;
        this.top = -1;
    }

    // Добавлет элемент в конец очереди.
    public void push(T element) {
        stackArr[++top] = element;
    }

    // Удаляет и возвращает вершину очереди.
    public T pop() {
        return stackArr[top--];
    }

    // НЕ удаляет и возвращает вершину очереди.
    public T pick(){
        return stackArr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
