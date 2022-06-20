package test;

import org.junit.Test;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author admin
 * @create 2022-06-16
 */
public class StreamTest {
    @Test
    public void test01() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        stream1.forEach(System.out::println);
        System.out.println("********************************");
        Stream<Object> stream2 = Stream.of();
        stream2.forEach(System.out::println);
        System.out.println("********************************");
        // of方法不允许只传入一个null值
//        Stream<Object> stream3 = Stream.of(null);
//        stream3.forEach(System.out::println);
        System.out.println("********************************");
        Stream<Object> stream4 = Stream.of(null,1,2);
        stream4.forEach(System.out::println);
        System.out.println("********************************");
        Stream<Object> stream5 = Stream.ofNullable(null);
        stream5.forEach(System.out::println);
        System.out.println("********************************");
    }

    @Test
    public void test02() {
        var stream1 = Stream.of(1, 2, 3,4,5,6,7,8,9,10);
        //takeWhile从流中一直获取判定为真元素，一直到判定为假，终止获取
        stream1.takeWhile(num->num<=5).forEach(System.out::println);
        System.out.println("********************************");
        //takeWhile从流中一直丢弃判定为真元素，一直到判定为假，终止丢弃
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream2.dropWhile(num->num<=5).forEach(System.out::println);
    }

    @Test
    public void test03() {
        // 有种子值调用UnaryOperator方法生成流 1.9新增
        Stream<Integer> integerStream = Stream.iterate(1, num -> num * 2 + 1);
        integerStream.limit(5).forEach(System.out::println);
        System.out.println("********************************");

        // 无种子值调用Supplier方法生成流， 1.8新增
        Stream<String> generate = Stream.generate(() -> UUID.randomUUID().toString());
        generate.limit(5).forEach(System.out::println);
        System.out.println("********************************");

        // 有种子值调用UnaryOperator方法生成流 1.9新增 第二个参数Predicate用于判断是否继续生成
        Stream<Integer> integerStream2 = Stream.iterate(1,t->t<500, num -> num * 2 + 1);
        integerStream2.forEach(System.out::println);
    }
}
