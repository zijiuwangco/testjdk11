package test;

import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * 集合的新API
 *
 * @author admin
 * @create 2022-06-16
 */
public class CollectionTest {

    @Test
    public void test() {
        var list = List.of(1, 2, 3);
        list.forEach(System.out::println);
        // of方法生产的是ImmutableCollections不可变集合，不允许添加元素，类似Arrays.asList生成的集合
//        list.add(4);
        System.out.println("----------------------------------");
        Set<Integer> set = Set.of(1, 2, 3);
        set.forEach(System.out::println);
        // set添加重复元素会报错  java.lang.IllegalArgumentException: duplicate element: 3
//        Set.of(1, 2, 3, 3);
    }
}
