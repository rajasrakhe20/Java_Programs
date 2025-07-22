package java_collection_framework.dequeue_interface;

import java.util.*;

public class DequeueWithArrayImp {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Adding elemenst from front side
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);

        System.out.println("Printing Dequeue: "+dq);

        //Remove element from front side
        System.out.println("Remove First: "+ dq.removeFirst());
        System.out.println("Remove with poll method: "+dq.pollFirst());
        System.out.println("Print Dequeue: " + dq);

        // Size of dequeue
        System.out.println("Size of dequeue: "+dq.size());

        // Chcek empty status of dequeue
        System.out.println("Empty status of dequeue: "+dq.isEmpty());

        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);

        // Remove elemenst from rear side of dequeue
        System.out.println("Remove Last: "+dq.removeLast());
        System.out.println("Remove Last with poll method: "+dq.pollLast());
        System.out.println("Print  Dequeue: "+dq);

        // Print First and Last element of dequeue
        System.out.println("Front element: "+dq.peekFirst());
        System.out.println("Rear element: "+dq.peekLast());

        //Check element present in deqeueue
        System.out.println("Check element isn dequeue:"+dq.contains(1));

        // Additional method:push() & pop(()
        dq.push(6);
        dq.push(8);
        System.out.println("Print Dequeue: "+dq);
        System.out.println("Pop in dequeue: "+dq.pop());
    }

}
