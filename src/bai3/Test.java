package bai3;

public class Test {
    public static void main(String[] args) {
        Thread n1 = new Thread(new LazyPrimeFactorization());
        Thread n2 =new Thread(new OptimizedPrimeFactorization());

        n1.start();
        n2.start();



    }
}
