import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;


public class test {
    public static void main(String[] args) {
        AtomicInteger atomicInteger=new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5, 2019) + "\t current data:" + atomicInteger.get());
    }

}
