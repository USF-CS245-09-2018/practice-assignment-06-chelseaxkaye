public class ArrayStack implements Stack {

	protected Object[] arr;
	protected int top;

	public ArrayStack() {
		arr = new Object[10];
		top = -1;
	}

	public void push(Object obj) {
		if (top >= arr.length - 1) {
			grow();
		}
		arr[++top] = obj;
	}

	public Object pop() {
		return arr[top--];
	}

	public Object peek() {
		return arr[top];
	}

	public boolean empty() {
		return (top == -1);
	}

	private void grow(){
		Object[] b = new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
		}
		arr = b;
	}


}