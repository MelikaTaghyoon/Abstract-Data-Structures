/**
 * 
 */
package dictionary;

import java.util.Iterator;

/**
 * An Iterator for an array. 
 * 
 * The constructor creates a new array from the given array. 
 *  
 * This class provides a concrete implementation for methods in the
 * Java interface Iterator.
 * 
 * @author S H S Wong
 * @version 04-10-2018
 *
 */
public class ArrayIterator<T> implements Iterator<T> {

	private T[] contents;
	private int limit;
	private int next;		// a pointer to keep track of the next position 
	
	/**
	 * Constructor: 
	 * Create an ArrayIterator object whose contents is kept in an array of type T.
	 * @param array
	 * @param size 
	 */
	public ArrayIterator(T[] array, int size) {
		
		this.contents = array;
		this.limit = size; 
		this.next = 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext() {
		return (next < limit);
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	public T next() {
		T item = contents[next];
		next++;
		return item;
	}

}
