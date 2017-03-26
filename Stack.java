package pl.modulczwarty_java;

import java.util.Iterator;

// interfejs stosu

public interface Stack {
	int size();

	boolean isEmpty();   

	void push(Object element);

	Object pop();

	Object peek();

	Iterator iterator();

}
