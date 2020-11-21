package ArrayListModulu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class List_Ex7 {
    public static void main(String[] args) {
        String[] oyun = {"Kupa", "Sinek", "Karo", "Maca"};
        List liste = Arrays.asList(oyun);
        for (Object s : liste)
            System.out.println(s);

        System.out.println("--------------------");

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(liste);
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());
    }
}

