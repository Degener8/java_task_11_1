package com.company;

import com.company.Lucky.*;

public class Main {

        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new LuckyThread();
            Thread t2 = new LuckyThread();
            Thread t3 = new LuckyThread();
            t1.start();
            t2.start();
            t3.start();
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Total: " + Lucky.count);

            int n = 0;
            int expected = 0;
            while (n < 999999) {
                n++;
                if ((n % 10) + (n / 10) % 10 + (n / 100) % 10 == (n / 1000)
                        % 10 + (n / 10000) % 10 + (n / 100000) % 10) {
                    expected++;
                }
            }

            System.out.println("Expected: " + expected);
        }

}


