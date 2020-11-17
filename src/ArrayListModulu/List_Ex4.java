package ArrayListModulu;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Ex4 {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        arrList.add("C");
        arrList.add("C++");
        arrList.add("Java");
        arrList.add("Pascal");
        arrList.add("Python");
        arrList.add("Ruby");

        ListIterator listIterator = arrList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");

        System.out.println();

        arrList.add(3, "Excel");

        ListIterator listIterator1 = arrList.listIterator();
        while (listIterator1.hasNext())
            System.out.print(listIterator1.next() + " ");

        System.out.println();

        arrList.set(3, "Ms Word");

        ListIterator listIterator2 = arrList.listIterator();
        while (listIterator2.hasNext())
            System.out.print(listIterator2.next() +  " ");
    }
}
