
public class InorderDeclarativeTraversal extends AbstractTraverser implements Traverser {

	@Override
	public void traverse(Node node) {
		if (node == null) 
			return;
		else
		{
			traverse(node.getLeft());
			visit(node);
			traverse(node.getRight());
		}
	}
	

}
