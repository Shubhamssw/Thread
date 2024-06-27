class MyRunnable implements Runnable {
    public void run()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}