package test;

import org.junit.Test;

import java.util.Optional;

/**
 * @author admin
 * @create 2022-06-19
 */
public class OptionalTest {
    @Test
    public void test01() {
        // 传入的如果是null会报空指针
//        Optional<Object> optionalO = Optional.of(null);
        Optional<Object> optionalO = Optional.ofNullable(null);
        Object abc = optionalO.orElse("ABC");
        System.out.println(abc);

        optionalO.orElseThrow();
    }
}
