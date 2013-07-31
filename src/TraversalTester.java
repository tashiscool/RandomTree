import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TraversalTester {

	Node a = new Node("a");
	Node b = new Node("b");
	Node c = new Node("c");
	Node d = new Node("d");
	Node e = new Node("e");
	Node f = new Node("f");
	Node g = new Node("g");
	Node h = new Node("h");
	Node i = new Node("i");
	@Before
	public void setUp() {
		f.setLeft(b);
		b.setLeft(a);
		f.setRight(g);
		g.setRight(i);
		i.setLeft(h);
		b.setRight(d);
		d.setLeft(c);
		d.setRight(e);
	}
	@Test
	public void IOrderTest() {
		System.out.println("-----------------------------");
		InorderDeclarativeTraversal traversal = new InorderDeclarativeTraversal();
		traversal.traverse(f);
		System.out.println("-----------------------------");
	}
	
	@Test
	public void PreOrderTest() {
		System.out.println("-----------------------------");
		Traverser traversal = new PreorderDeclarativeTraversal();
		traversal.traverse(f);
		System.out.println("-----------------------------");
	}
	@Test
	public void PostOrderTest() {
		System.out.println("-----------------------------");
		Traverser traversal = new PostorderDeclarativeTraversal();
		traversal.traverse(f);
		System.out.println("-----------------------------");
	}

}
