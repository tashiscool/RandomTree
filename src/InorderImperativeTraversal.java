import java.util.Stack;


public class InorderImperativeTraversal extends AbstractTraverser implements Traverser {

	@Override
	public void traverse(Node node) {
		Stack stack = new Stack();
		while (!stack.isEmpty() || node != null)
		{
			if (node != null )
			{
				stack.push(node);
				node = node.left;
			}
			else
			{
				node = (Node) stack.pop();
				visit(node);
				node = node.right;
			}
		}
	}
}
