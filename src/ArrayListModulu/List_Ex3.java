package ArrayListModulu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
             Integer in = (Integer) listIterator.next();
             listIterator.set(in * (int) (Math.random() * 10));
        }
        System.out.println();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
