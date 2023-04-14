package ex1;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;
    public RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread "+ threadName+", "+i);
            Thread.sleep(50);//dừng vòng lặp 50ms
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void start(){
        System.out.println("Starting "+ threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo=new RunnableDemo("Thread-1-HR-Database");
        runnableDemo.start();

        RunnableDemo runnableDemo1= new RunnableDemo("Thread-2-Send-Email");
        runnableDemo1.start();
    }
}
