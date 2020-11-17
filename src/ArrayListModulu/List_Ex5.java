package ArrayListModulu;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Ex5 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ankara");
        arrayList.add("Bagdat");
        arrayList.add("Tahran");

        ArrayList arrList = new ArrayList();
        arrList.add("Istanbul");
        arrList.add("Kutahya");
        arrList.add("Mersin");
        arrList.addAll(1, arrayList);

        ListIterator listIterator = arrList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");
    }
}
