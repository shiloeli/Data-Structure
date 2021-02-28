
public class Ex3 {

	public static int isFull(MyNode root) {
	if(root==null)return -1;
	if(root.left==null&&root.right==null)return 0;
	if( full1(root)) {
	int h=full2(root);
	int leaves=full3(root);
	if(leaves==Math.pow(2, h)) {
		return h;
	}else {
		return -2;
	}
	}else {
		return -2;
	}
}
	
	public static boolean full1(MyNode root) {
		if((root.left!=null&&root.right==null)||(root.left==null&&root.right!=null)) return false;
		if(root.left==null&&root.right==null) return true;
		return full1(root.left)&&full1(root.right);
	}
	public static int full2(MyNode root){
		if(root.left==null)return 0;
		return full2(root.left)+1;
		
	}
	public static int full3(MyNode root){
		if(root.left==null&&root.right==null)return 1;
			return full3(root.left)+full3(root.right);
		
	}
}
