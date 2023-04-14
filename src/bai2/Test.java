package bai2;

public class Test {
    public static void main(String[] args) {
        Thread numberGenerator1=new Thread(new NumberGenerator());
        numberGenerator1.start();
        numberGenerator1.setPriority(Thread.MAX_PRIORITY);

        Thread numberGenerator2=new Thread(new NumberGenerator());
        numberGenerator2.start();
        numberGenerator2.setPriority(Thread.MIN_PRIORITY);

    }
}
