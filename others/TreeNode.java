import java.util.List;

import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        List<Integer> left = inorderTraversal(root.left);
        result.addAll(left);
        result.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        result.addAll(right);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        result.add(root.val);
        List<Integer> left = inorderTraversal(root.left);
        result.addAll(left);
        List<Integer> right = inorderTraversal(root.right);
        result.addAll(right);
        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        List<Integer> left = inorderTraversal(root.left);
        result.addAll(left);
        List<Integer> right = inorderTraversal(root.right);
        result.addAll(right);
        result.add(root.val);
        return result;
    }
public static void main(String[] args) {
    ArrayList<Integer>list1=new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    ArrayList<Integer>list2=new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    System.out.println(list1);
}
}