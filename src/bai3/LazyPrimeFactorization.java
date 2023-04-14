package bai3;

public class LazyPrimeFactorization implements Runnable {
    public boolean Check(int n){

        if(n<2){
            return false;
        }else {
            for(int i=2; i<n;i++){
                if(n % i==0){
                    return false;
                }

            }
        }
        return true;
    }
    @Override
    public void run() {
        System.out.println("tìm số nguyên tố không tối ưu:");
       int i =0;
       int count=0;
       while (count<50) {
           if (Check(i) == true) {
               System.out.println("A " + i);
               count++;
           }
           i++;
       }
    }
}
