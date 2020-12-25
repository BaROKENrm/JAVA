public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20 && !Thread.currentThread().isInterrupted()/*获取当前线程的中断标志位*/; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();//线程开始，中断标志位是false
        Thread.sleep(5000);
        t.interrupt();//将线程的中断标志位设置成true
        System.out.println("main");
    }
}
