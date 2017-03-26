package pl.modulczwarty_java;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		StackClass stack = new StackClass(5);

		if (stack.isEmpty() == true) {

			System.out.println("Stack is empty !");
		}

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Current size of the stack is:" + stack.size());

		stack.pop();
		stack.pop();

		System.out.println("Current size of the stack(after 2 pop methods) is:" + stack.size());
		System.out.println("Current element on the top is: " + stack.peek());

		// Display stack using iterator
		System.out.println("Elements of the stack: ");
		Iterator<Object> iter = stack.iterator();
		while (iter.hasNext()) {
			int element = (int) iter.next();
			System.out.println(element);
		}
	}
}
