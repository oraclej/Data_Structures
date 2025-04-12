package edu.iaun.ds.queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
//        SimpleQueue queue = new SimpleQueue();
        Queue<Integer> queue = new LinkedQueue<Integer>();
        String s = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            s = sc.nextLine();
            if(s.startsWith("+"))
                queue.enqueue(Integer.parseInt(s.substring(1)));
            else if(s.startsWith("-"))
                System.out.println(queue.dequeue());
        }while (!s.equals(""));
    }
}
