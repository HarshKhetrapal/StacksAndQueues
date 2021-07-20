package Queue;

import java.util.Iterator;


public class Application {

	public static void main(String[] args) {

		ArrayQueue<String> aQueue = new ArrayQueue<>();
		LinkedListQueue<String> lQueue = new LinkedListQueue<>();
		aQueue.enqueue("to");
		aQueue.enqueue("be");
		aQueue.enqueue("or");
		aQueue.enqueue("not");
		aQueue.enqueue("to");
		System.err.println(aQueue.dequeue());
		aQueue.enqueue("be");
		System.err.println(aQueue.dequeue());
		System.err.println(aQueue.dequeue());
		aQueue.enqueue("that");
		System.err.println(aQueue.dequeue());
		System.err.println(aQueue.dequeue());
		System.err.println(aQueue.dequeue());
		aQueue.enqueue("is");
		
//		Iterator<String> i = aQueue.iterator();
//		while(i.hasNext())
//		{
//			String s = i.next();
//			System.out.println(s);;
//		}
		
		System.err.println("----------------------------------------------------------------");
		
		lQueue.enqueue("to");
		lQueue.enqueue("be");
		lQueue.enqueue("or");
		lQueue.enqueue("not");
		lQueue.enqueue("to");
		System.err.println(lQueue.dequeue());
		lQueue.enqueue("be");
		System.err.println(lQueue.dequeue());
		System.err.println(lQueue.dequeue());
		lQueue.enqueue("that");
		System.err.println(lQueue.dequeue());
		System.err.println(lQueue.dequeue());
		System.err.println(lQueue.dequeue());
		lQueue.enqueue("is");
		
//		Iterator<String> j = lQueue.iterator();
//		while(j.hasNext())
//		{
//			String k = j.next();
//			System.out.println(k);;
//		}
	}

}
