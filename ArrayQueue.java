public class ArrayQueue implements Queue {

	protected int head;
	protected int tail;
	protected Object[] arr;

	public ArrayQueue() {
		arr = new Object[10];
		head = 0;
		tail = 0;
	}

	public Object dequeue() {
		Object obj = arr[head];
		++head;
		head = head % arr.length;
		return obj;
	}

	public void enqueue(Object obj) {
		if ((tail + 1) % arr.length == head)
			grow_array();
		arr[tail++] = obj;
		if (tail >= arr.length)
			tail = 0;
	}
	
	public boolean empty() {
		return (head == tail);
	}

	public void grow_array() {

		Object[] b = new Object[arr.length * 2];
		tail = 0;
		for (int i = head; i < arr.length + head; i++) {
			System.out.println(i + " Tail: " + tail);
			b[tail++] = arr[(i) % arr.length];
		}	

		head = 0;
		arr = b;
	}

}