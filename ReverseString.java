package stack;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		Stack<Character> stk= new Stack<Character>();
		String n="Iam is Pranathi";
		for(int i=0;i<n.length();i++)
		{
			stk.push(n.charAt(i));
		}
		String rev="";
		
		String temp="";
		while(!stk.isEmpty())
		{
	
			char d=stk.pop();
			if(d!=' ')
			{
				temp=d+temp;
			}
			if(d==' ')
			{
			    rev=rev+" "+temp;
				temp="";
			}
		}
		rev=rev+" "+temp;
		System.out.println(rev);
	}
}



