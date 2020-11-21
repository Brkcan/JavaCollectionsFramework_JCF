package ArrayListModulu;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Ex9 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++)
            list.add(i * 10);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext())
            System.out.print("-" + listIterator.next());

        System.out.println("Verilen indis silindi.../ ");
        list.remove(0);
        ListIterator listIterator2 = list.listIterator();
        while (listIterator2.hasNext())
            System.out.print("-" + listIterator2.next());

        System.out.println();
        System.out.println("EnsureCapasity----");

        list.ensureCapacity(15);

        for (int i = 10; i < 10; i++)
            list.add(100 * i);

        System.out.println(list);

        System.out.println("Sub list -----");

        List altliste =  list.subList(2, 4);
        System.out.println(altliste);



    }
}
