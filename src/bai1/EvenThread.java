package bai1;

public class EvenThread extends Thread{


    @Override
    public void run() {
        System.out.println("In các số chawcn từ 1 đến 10");
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                Thread.sleep(15);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
