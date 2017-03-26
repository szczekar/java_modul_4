package pl.modulczwarty_java;

import java.util.Iterator;

public class StackClass implements Stack {

	int index;
	Object[] tab;

	// CONSTRUCTOR
	public StackClass(int sizeOfArray) {
		if (sizeOfArray < 0) {
			throw new NegativeArraySizeException("The size of array cannot be negative !");
		} else if (sizeOfArray == 0) {
			throw new ArrayIndexOutOfBoundsException("The size of array cannot be zero !");
		} else {

			tab = new Object[sizeOfArray];
			index = 0;

		}
	}

	// RETURN THE SIZE OF THE STACK
	@Override
	public int size() {
		return index;
	}

	// CHECK IT THE STACK IS EMPTY
	@Override
	public boolean isEmpty() {
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(Object element) {
		if (index < tab.length) {
			tab[index] = element;
			index++;
		} else {
			throw new ArrayIndexOutOfBoundsException("Stack is full, this operation cannot be done.");
		}
	}

	// REMOVE ELEMENT FROM STACK
	public Object pop() throws IndexOutOfBoundsException {
		if (index <= 0) {
			throw new IndexOutOfBoundsException("Stack is empty, this operation cannot be done.");
		}

		Object temp = tab[index - 1];
		tab[index - 1] = null;
		index--;
		return temp;
	}

	// PEEK, CHECK TOP ELEMENT ON STACK
	public Object peek() throws IndexOutOfBoundsException {
		if (index == 0) {
			throw new IndexOutOfBoundsException("Stack is empty, this operation cannot be done.");
		}

		int temp = index - 1;
		return (tab[temp]);

	}

	// ITERATOR FROM JAVA
	class customIterator implements Iterator {

		private int currentIndex = 0;
		private int currentSize = tab.length;

		@Override
		public boolean hasNext() {
			return currentIndex < currentSize && tab[currentIndex] != null;
		}

		@Override
		public Object next() {

			return tab[currentIndex++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public Iterator iterator() {
		return new customIterator();
	}

}
