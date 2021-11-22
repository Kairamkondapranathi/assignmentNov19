package queue;

import java.util.ArrayList;

public class CircularQueue {
	
public static void main(String[] args) {
		
		CircularQueue q=new CircularQueue(2);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(7);
		
		System.out.println(q.isFull());
		System.out.println(q.getRear());
		System.out.println(q.getFront());
		
		q.deque();
		System.out.println(q.isFull());
		System.out.println(q.size);
		System.out.println(q.getFront());
	}

	int a[];
	int front,size,c;
	public CircularQueue(int i) {
		
	}
	void CircularQueue(int c){
		front=0;
		size=0;
		a=new int[c];
	}
	boolean isFull() {
		return c==size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int getFront() {
		if(isEmpty())
			return -1;
		else
			return front;
	}
	int getRear() {
		if(isEmpty())
			return -1;
		else
			return (front+1)%c;
	}
	void enqueue(int x)
	{
		if(isFull())
			return;
		int rear=getRear();
		rear=(rear+1)%c;
		a[rear]=x;
		size++;
	}
	void deque() {
		if(isEmpty())
			return;
		else
		{
			front=(front+1)%c;
			size--;
		}		
	}
}
