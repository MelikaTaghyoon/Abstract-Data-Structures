package labtest;
import jss2.LinearNode;

public class quiz {

	public static void main(String[] args) {
		LinearNode<Integer> first = new LinearNode<Integer>(0);
		int count = 1;
		while(count<=4) {
			LinearNode<Integer> node = new LinearNode<Integer>(count);
			first = node;
			node.setNext(first);
			count++;
		}
		System.out.println(count);

	}

}
