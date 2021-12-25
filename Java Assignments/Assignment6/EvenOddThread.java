package edyoda.Assignment6;
import java.util.Scanner;

// Java program for the above approach
public class EvenOddThread {
    int counter = 1;

    public void printOddNumber(int num) {
        synchronized (this) {
            while (counter < num) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd: "+counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber(int num) {
        synchronized (this) {
            while (counter < num) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even: "+counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        EvenOddThread obj = new EvenOddThread();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.printEvenNumber(num);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.printOddNumber(num);
            }
        });

        t1.start();
        t2.start();
    }
}
