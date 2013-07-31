
public class PreorderDeclarativeTraversal extends AbstractTraverser implements Traverser {

	@Override
	public void traverse(Node node) {
		if (node == null)
			return;
		else
		{
			visit(node);
			traverse(node.left);
			traverse(node.right);
		}
	}

}
