package ArrayListModulu;

import java.util.ArrayList;
import java.util.List;

public class List_Ex6 {
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        arrList.add("Kartal");
        arrList.add("Dogan");
        arrList.add("Sahin");

        Object[] arr = new String[5];
        arr = arrList.toArray();
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
