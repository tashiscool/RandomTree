
public class TreeUtil {
	public static void rotateRight(Node five)
	{
		Node three =  five.left;
		Node four = three.right;
		five.left = four;
		three.right = five;
		
		
	}
	public static void rotateLeft(Node three)
	{
		Node five =  three.right;
		Node four = five.left;
		three.right = four;
		five.left = three;
	}
	
	public void insert(Node node)
	{
		
	}
	
	public int depth(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			return Math.max(depth(n.left),depth(n.right)) + 1;
		}
	}
}
