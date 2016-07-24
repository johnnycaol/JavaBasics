package queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);//Queue is an interface
		q1.add(12);
		q1.add(23);
		q1.add(5);
		
		Integer element = q1.remove();//return the head of the queue
		System.out.println(element);
	}

}
