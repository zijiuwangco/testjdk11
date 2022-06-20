package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @create 2022-06-19
 */
class Garbage {
    int n = (int)(Math.random() * 100);
    @Override
    public void finalize() {
        System.out.println(this + " : " + n + " is dying");
    }
}
public class EpsilonTest {

    public static void main(String[] args) {
        boolean flag = true;
        List<Garbage> list = new ArrayList<>();
        long count = 0;
        while (flag) {
            list.add(new Garbage());
            if (list.size() == 1000000 && count == 0) {
                list.clear();
                count++;
            }
        }
        System.out.println("程序结束");
    }
}
