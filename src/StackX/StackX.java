package StackX;

public  class StackX {

	
	private double []stkArray;
	private int maxSize;
	private int top;
	
	public StackX(int s) {
		maxSize = s;
		stkArray = new double[maxSize];
		top = -1;
	}
	
	public void push(double j) {
		if(top == maxSize - 1) {
			System.out.println("Stack is full");
		}
		else {
			stkArray[++top]=j;
		}
	}
	
	public double pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return -99;
		}
		else {
			return stkArray[top--];
		}
	}
	
	public double peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return -99;
		}
		else {
			return stkArray[top];
		}
	}
	public boolean isFull() {
		return (top == maxSize-1);
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void disply() {
		System.out.println("Printing Stack = ");
		
		int i = top;
		
		do {
			System.out.print(stkArray[i]+" ");
			i--;
		}while (i>=0);
		
	}

}
