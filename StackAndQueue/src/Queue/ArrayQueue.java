package Queue;

import java.util.Iterator;

public class ArrayQueue<Item> implements Iterable<Item>{
	private Item[] s;
	private int first = 0;
	private int last = 0;
	
	public ArrayQueue()
	{
		s = (Item[]) new Object[1];
	}
	
	public void enqueue(Item item)
	{
		if(last == s.length)
			resize(2*s.length);
		s[last++] = item;
	}
	
	private void resize(int capacity)
	{
		Item[] copy = (Item[]) new Object[capacity];
		int j = 0;
		for(int i = first; i < last; i++)
			copy[j++] = s[i];
		s = copy;
		first = 0;
		last  = j;
	}
	
	public Item dequeue()
	{
		Item item = s[first];
		s[first++] = null;
		if(first == last)
		{
			first = 0;
			last = 0;
		}
		if(last > 0 && last == s.length/4)
			resize(s.length/2);
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<Item>
	{
		private int i = first;
		private int j = last;
		@Override
		public boolean hasNext() {
			return i < j;
		}

		@Override
		public Item next() {
			return s[i++];
		}
		
	}
}
