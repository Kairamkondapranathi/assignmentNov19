package stack;

public class Stack {
public static void main(String[] args) {
		
		Stack stk=new Stack();
		stk.push(2);
		stk.push(10);
		
		System.out.println(stk.peek());
		System.out.println(((Stack) stk).avg());
		System.out.println(((Stack) stk).getMax());
		stk.pop();
		System.out.println(stk.peek());
		System.out.println(((Stack) stk).avg());
		System.out.println(((Stack) stk).getMax());
		
	}

	int A[]=new int[15];
	int s=0;
	
	void push(int f)
	{
		if(s<A.length)
		{
			A[s++]=f;
		}
		else {
			System.out.println("overflow");
		}
	}
	void pop() {
		
		if(s!=-1)
		{
			s=s-1;
		}
		else
		{
			System.out.println("underflow");
		}
	}
	int peek() {
		if(s!=-1)
		{
			return A[s-1];
		}
		else {
			return -1;
		}
	}
	int avg()
	{
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum=sum+A[i];
		}
		return sum/s;
	}
	int getMax() {
		int max=0;
		for(int i=0;i<s;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		return max;
	}
}
