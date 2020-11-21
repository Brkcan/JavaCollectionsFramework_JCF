package ArrayListModulu;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Ex8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.get(3));
        System.out.println(list.lastIndexOf(20));
    }
}
