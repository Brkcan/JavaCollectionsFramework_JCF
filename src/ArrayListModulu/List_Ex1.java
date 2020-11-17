package ArrayListModulu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class List_Ex1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));

        Collections.sort(list);

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");

        System.out.println();

        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous() + " ");
    }
}
