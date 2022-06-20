package test;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * @author admin
 * @create 2022-06-19
 */
public class StringTest {
    @Test
    public void test01() {
        //此处最后输入了一个全角的汉字空格
        String str = " \t \r\n ABC　\t ";
        String str1 = "";
        // true 判断是否都是空白
        System.out.println(str.isBlank());
        // false 判断是否都是空
        System.out.println(str.isEmpty());

        // true 判断是否都是空白
        System.out.println(str1.isBlank());
        // true 判断是否都是空
        System.out.println(str1.isEmpty());
        System.out.println("********************************");
        // strip()可以去除包括英文在内的多种语言的空白
/*        String ret = isLatin1() ? StringLatin1.strip(value)
                : StringUTF16.strip(value);
        return ret == null ? this : ret;*/
        String strip = str.strip();
        System.out.println(strip);
        System.out.println(strip.length());
//        String ret = isLatin1() ? StringLatin1.trim(value)
//                : StringUTF16.trim(value);
//        return ret == null ? this : ret;
        String trim = str.trim();
        // trim()不能去除非英文的空白（码值小于等于32的空白字符）
        System.out.println(trim);
        System.out.println(trim.length());

        System.out.println("********************************");
        // stripLeading去除首部的空白
        String stripLeading = str.stripLeading();
        System.out.println(stripLeading);
        System.out.println(stripLeading.length());
        // stripTrailing去除尾部的空白
        String stripTrailing = str.stripTrailing();
        System.out.println(stripTrailing);
        System.out.println(stripTrailing.length());
    }

    @Test
    public void test02() {
        String str = "abc";
        System.out.println(str.repeat(3));

        String str1 = "a\nb\nc";
        Stream<String> lines = str1.lines();
        System.out.println(lines.count());
    }
}
