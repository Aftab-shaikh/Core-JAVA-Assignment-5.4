package com.assisngment5_4;
/*tried to find out the logic but no getting
 * 
 */

public class Main {// main class
	public static void main(String[] args) {// main method
		FixedStack fixedstack=new FixedStack();//object of fixed stack
		fixedstack.pop();// method called 
		fixedstack.push(1);// method called
		
	}

}

class FixedStack implements Stack{// fixedstack class implements the interface
	
	public FixedStack() {
		int Stack = 100;// intiliazed in constructor
	}

	@Override
	public void push(int l) { // tried to setup the loop
		for (l=0;l<=100;l++) {
			System.out.println(l);
			}
		
	}

	@Override
	public int pop() { // loop to check over flow
		int stack=100;
		for (int i=0;i<=100;i++) {
			if (i==100) {
				System.out.println(" Stack over flow");
			}
			}
		
		return 0;
	}
}

class VariableStack implements Stack{// VariableStack class implements the interface
	
	public VariableStack() {
		// cant find logic 
	}

	@Override
	public void push(int l) {
		// cant find logic 
		
	}

	@Override
	public int pop() {
		//cant find logic
		return 0;
	}
}
