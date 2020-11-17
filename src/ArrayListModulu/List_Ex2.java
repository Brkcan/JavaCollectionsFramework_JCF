package ArrayListModulu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Ex2 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.println("Orjinal listenin Ogeleri");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext())
            listIterator.set(listIterator.next() +  "& ");

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.print(it.next() +  " ");
    }
}
