package CS113;

import CS113.interfaces.ListInterface;
import CS113.interfaces.ListIterableInterface;
import CS113.interfaces.ListIteratorInterface;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListInterface<Integer> ourList = new LinkedListPH<>();
        List<Integer> javaList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            ourList.add(i);
            javaList.add(i);
        }

        ourList.add(4, null);
        javaList.add(4, null);

        System.out.println("Our List:");
        System.out.println(ourList);

        System.out.println("Java List:");
        System.out.println(javaList);

        System.out.println("Testing the Iterator:");
        System.out.print("[");
        ListIterableInterface<Integer> iterList = (ListIterableInterface<Integer>) ourList;
        ListIteratorInterface<Integer> it = iterList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) { System.out.print(", "); }
        }
        System.out.println("]");

        System.out.println("Cleared List:");
        ourList.clear();
        System.out.println(ourList);
    }
}