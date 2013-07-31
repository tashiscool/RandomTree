import java.util.Stack;


public class PostorderImperativeTraversal extends AbstractTraverser implements Traverser {

	@Override
	public void traverse(Node node) {
		Stack stack = new Stack();
		if (node != null)
			return;
		stack.push(node);
		Node prevNode = null;
		while (!stack.isEmpty())
		{
			Node currNode = (Node) stack.peek();
			if (prevNode == null || prevNode.left == currNode || prevNode.right == currNode)
			{
				if (currNode.left != null)
				{
					stack.push(currNode.left);
				}
				else if (currNode.right != null)
				{
					stack.push(currNode.right);
				}
			}
			else if (currNode.left == prevNode)
			{
				if (currNode.right != null)
				{
					stack.push(currNode.right);
				}
			}
			else
			{
				visit(currNode);
				stack.pop();
			}
			prevNode = currNode;
		}
	}

}
