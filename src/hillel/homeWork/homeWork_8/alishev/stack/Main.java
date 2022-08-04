package hillel.homeWork.homeWork_8.alishev.stack;

public class Main {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(6);
        simpleStack.push(4);
        simpleStack.push(2);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack.pick());
        System.out.println(simpleStack.pick());
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack.isEmpty());

        SimpleStack<String> simpleStack2 = new SimpleStack<>(10);
        simpleStack2.push("one");
        simpleStack2.push("two");
        simpleStack2.push("three");
        System.out.println(simpleStack2.pop());
        System.out.println(simpleStack2.pick());
        System.out.println(simpleStack2.pick());
        System.out.println(simpleStack2.pop());
        System.out.println(simpleStack2.pop());
        System.out.println(simpleStack2.isEmpty());
    }
}
