package listInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        /*Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(4);

        System.out.println(pq); // internally implementing min heap
        System.out.println(pq.poll());
        System.out.println(pq);*/

        // max heap
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(40);
        priorityQueue.offer(12);
        priorityQueue.offer(24);
        priorityQueue.offer(36);
        priorityQueue.offer(4);

        System.out.println(priorityQueue); // internally implementing max heap
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
