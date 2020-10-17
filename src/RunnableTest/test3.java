package RunnableTest;

public class test3 {
    public static void main(String[] args) throws InterruptedException{
        Thread thread=new Thread(()->{
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("1");
                    return ;
                }
                else if(!Thread.currentThread().isInterrupted()){
                    System.out.println("3");
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("2");
                }
            }
        });
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
