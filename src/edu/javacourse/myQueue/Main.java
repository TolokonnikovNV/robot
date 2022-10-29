package edu.javacourse.myQueue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

//        for (int i = 1; i <= 10; i++) {
//            queue.pushPriority("String " + i, i);
//        }

        queue.pushPriority("Object 1", 9);
        queue.pushPriority("Object 2", 8);
        queue.pushPriority("Object 3", 7);
        queue.pushPriority("Object 4", 6);
        queue.pushPriority("Object 5", 5);
        queue.pushPriority("Object 6", 4);
        queue.pushPriority("Object 7", 3);
        queue.pushPriority("Object 8", 2);
        queue.pushPriority("Object 9", 1);


        while (queue.getSize() > 0) {
            String s = (String) queue.pullForward();
            System.out.println(s);
        }

    }
}
