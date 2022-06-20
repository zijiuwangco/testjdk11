package test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @author admin
 * @create 2022-06-19
 */
public class InputStreamTest {
    @Test
    public void test01() throws Exception {
        var classLoader = this.getClass().getClassLoader();
        var file = classLoader.getResourceAsStream("file");
        try (
                file;
                var os = new FileOutputStream("file2")
        ) {
            // 原始数据的快速复制
            file.transferTo(os);
        }
    }
}
