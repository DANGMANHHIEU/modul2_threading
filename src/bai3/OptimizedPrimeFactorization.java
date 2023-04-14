package bai3;

public class OptimizedPrimeFactorization implements Runnable{
    public boolean Check(int n){

        if(n<2){
            return false;
        }else {
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n % i==0){
                    return false;
                }

            }
        }
        return true;
    }
    @Override
    public void run() {
        System.out.println("tìm số nguyên tố tối ưu:");
        int i =0;
        int count=0;
        while (count<50) {
            if (Check(i) == true) {
                System.out.println("B " + i);
                count++;
            }
            i++;
        }
    }
    }

