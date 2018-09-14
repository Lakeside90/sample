package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * </pre>
 *
 * @author jianwu6 [2018/9/13 10:37]
 */
public class Flatmap {
    // test stash


    public static void main(String[] args) {

        Integer[] integer = new Integer[]{1, 2, 3};
        Integer[] integer2 = new Integer[]{21, 22, 23};
        List<Integer[]> oldList = Arrays.asList(integer, integer2);
        List<Integer> newList = oldList.stream().flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(newList);

    }


}
