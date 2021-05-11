package ex_27_04;

public class Compute implements Runnable {
    private int n, sum;

    public Compute(int n) {
        this.n = n;
    }

    public int getSum() {
        return sum;
    }
    
    @Override
    public void run() {
        sum = (n + 1) * (n / 2);
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        Compute c = new c(10);
        Thread worker = new Thread(c);
        
        worker.start();
        try {
            worker.join(); // wait until worker finish then continue run
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Result is: " + (cc.getSum() + 1));
    }
    
}
