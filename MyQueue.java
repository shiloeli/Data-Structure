

public class MyQueue {

	private MyStack arr1;
	private MyStack arr2;

	public MyQueue(int capacity) {
		arr1 = new MyStack(capacity);
		arr2 = new MyStack(capacity);
	}

	public boolean enqueue(int data) {
		return arr1.push(data);
	}

	public int dequeue() {
		int temp = arr1.pop();
		while (temp != Integer.MAX_VALUE) {
			arr2.push(temp);
			temp = arr1.pop();
		}
		int num = arr2.pop();
		temp = arr2.pop();
		while (temp != Integer.MAX_VALUE) {
			arr1.push(temp);
			temp = arr2.pop();
		}
		return num;
	}
}
