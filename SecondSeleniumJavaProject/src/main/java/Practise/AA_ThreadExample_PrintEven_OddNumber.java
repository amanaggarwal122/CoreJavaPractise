package Practise;



class EvenOddPrinter {
    private int n = 10;
    private boolean isOdd = true;

    synchronized void printOdd(int num) {
        while (!isOdd) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Odd: " + num);
        isOdd = false;
        notify();
    }

    synchronized void printEven(int num) {
        while (isOdd) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Even: " + num);
        isOdd = true;
        notify();
    }
}

public class AA_ThreadExample_PrintEven_OddNumber {
    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) printer.printOdd(i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) printer.printEven(i);
        });

        t1.start();
        t2.start();
    }
}