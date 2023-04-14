package bai2;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        System.out.println("Mã băm "+ hashCode());
        try{
            for (int i=0; i<=10;i++){
                System.out.println(i + ", mã băm "+hashCode());
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
