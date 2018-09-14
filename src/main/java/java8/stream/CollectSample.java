package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <pre>
 *     Stream:集合流、数组流、文件流
 *
 *     中间操作：filter, distinct, limit, skip, sorted, map, flatMap ...
 *
 *     终止操作：allMatch, anyMatch, noneMatch, findFirst, findAny, count, reduce, Collect...
 *
 * </pre>
 *
 * @author jianwu6 [2018/9/14 11:26]
 */
public class CollectSample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a2", "a1", "b1", "b2", "c11", "c22");

        //过滤
        List<String> filter = list.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
        System.out.println(filter);

        //查找匹配
        boolean allMatch = list.stream().allMatch(x -> x.endsWith("1"));
        System.out.println(allMatch);

        boolean anyMatch = list.stream().anyMatch(x -> x.length() == 2);
        System.out.println(anyMatch);

        System.out.println(list.stream().filter(x -> x.startsWith("b")).findFirst().get());

        System.out.println(list.stream().filter(x -> x.startsWith("b")).findAny().get());

        //计数
        System.out.println(list.stream().filter(x -> x.length() == 2).count());

        System.out.println(list.stream().max(Comparator.naturalOrder()).get());

        //去重
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        //排序
        list.stream().sorted().limit(4).collect(Collectors.toList());

        //归约
        System.out.println(list.stream().reduce("AAA", (x, y) -> x + y));

        //分组
        Map<Integer, List<String>> group = list.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(group);

        //map
        System.out.println(list.stream().map(x -> "MAP" + x).collect(Collectors.toList()));
    }
}
