package genrics;

import java.util.Arrays;
import java.util.List;

public class JavaGenerics extends GenericsCounter<Integer>{

    public static void main(String ars[]){

        List<Integer> integers  = Arrays.asList(2, 3, 3, 445,4545,34);

        add(integers);

    }

    public static <T extends Number> void add(List<T> t){

        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
    }
}
