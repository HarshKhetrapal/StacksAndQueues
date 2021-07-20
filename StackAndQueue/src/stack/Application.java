package stack;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		ArrayStack<String> aStack = new ArrayStack<>();
		LinkedListStack<String> lStack = new LinkedListStack<>();
		aStack.push("to");
		aStack.push("be");
		aStack.push("or");
		aStack.push("not");
		aStack.push("to");
		//System.err.println(aStack.pop());
		aStack.push("be");
		//System.err.println(aStack.pop());
		//System.err.println(aStack.pop());
		aStack.push("that");
		//System.err.println(aStack.pop());
		//System.err.println(aStack.pop());
		//System.err.println(aStack.pop());
		aStack.push("is");
		
		Iterator<String> i = aStack.iterator();
		while(i.hasNext())
		{
			String s = i.next();
			System.out.println(s);;
		}
		
		System.err.println("----------------------------------------------------------------");
		
		lStack.push("to");
		lStack.push("be");
		lStack.push("or");
		lStack.push("not");
		lStack.push("to");
		//System.err.println(lStack.pop());
		lStack.push("be");
		//System.err.println(lStack.pop());
		//System.err.println(lStack.pop());
		lStack.push("that");
		//System.err.println(lStack.pop());
		//System.err.println(lStack.pop());
		//System.err.println(lStack.pop());
		lStack.push("is");
		
		Iterator<String> j = lStack.iterator();
		while(j.hasNext())
		{
			String k = j.next();
			System.out.println(k);;
		}
	}

}
