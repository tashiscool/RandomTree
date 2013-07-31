
public class PostorderDeclarativeTraversal extends AbstractTraverser implements Traverser {

	@Override
	public void traverse(Node node) {
		if (node == null)
			return;
		else
		{
			traverse(node.getLeft());
			traverse(node.getRight());
			visit(node);
		}
		

	}

}
