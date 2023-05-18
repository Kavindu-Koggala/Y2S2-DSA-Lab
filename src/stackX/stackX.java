package stackX;

public class stackX {
	private char []stkArray;
	private int top;
	private int maxSize;
	
	public stackX(int j) {
		maxSize = j;
		stkArray = new char [maxSize];
		top = -1;
	}
	public void push(char s) {
		if(top == maxSize-1) {
			System.out.println("Stack is full");
			
		}
		else {
			stkArray[++top] = s;
		}
	}
	public char pop() {
		if(top == -1) {
			System.out.println("Stack is empty...");
			return 0;
		}
		else {
			return (stkArray[top--]);
		}
	}
	public char peek() {
		if(top == -1) {
			System.out.println("Stack is empty...");
			return 0;
		}
		else {
			return (stkArray[top]);
		}
	}
	
	public void display() {
		System.out.println("Display Stack : ");
		
		int i= top;
		
		do {
			System.out.print(stkArray[i]+" ");
			i--;
		}while (i>=0);
	}
	

}
