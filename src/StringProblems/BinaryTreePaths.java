package StringProblems;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {

    //    public List<String> binaryTreePaths0(TreeNode root) {
    //        List<String> rootToLeaf = new ArrayList<>();
    //        while (!root.isLeaf()){
    //            rootToLeaf.add(root.left.val+"");
    //        }
    //    }
    //    public String goUntilNull(TreeNode root){
    //        if (root.isLeaf()) return "";
    //        String left = goUntilNull(root.);
    //    }

    public List<String> binaryTreePaths1(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) { searchBT(root, "", answer); }
        return answer;
    }

    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) { answer.add(path + root.val); }
        if (root.left != null) { searchBT(root.left, path + root.val + "->", answer); }
        if (root.right != null) { searchBT(root.right, path + root.val + "->", answer); }
    }

    public List<String> binaryTreePaths2(final TreeNode root) {
        final List<String> result = new ArrayList<>();

        helper(result, new StringBuilder(), root);

        return result;
    }

    private void helper(final List<String> result, final StringBuilder sb, final TreeNode root) {
        final int tmp = sb.length();

        if(root.left == null && root.right == null) {
            sb.append(root.val);
            result.add(sb.toString());
        } else {
            sb.append(root.val);
            sb.append("->");

            if(root.right != null)
                helper(result, sb, root.right);

            if(root.left != null)
                helper(result, sb, root.left);
        }

        sb.setLength(tmp);
    }

    public static void main(String[] args) {
        BinaryTreePaths btp = new BinaryTreePaths();
        System.out.println(btp.binaryTreePaths2(new TreeNode(20, new TreeNode(7,
                                                                             new TreeNode(4, null,
                                                                                          new TreeNode(6)),
                                                                             new TreeNode(9)),
                                                            new TreeNode(35, new TreeNode(31,
                                                                                          new TreeNode(28), null),
                                                                         new TreeNode(40,
                                                                                      new TreeNode(38),
                                                                                      new TreeNode(52))))));
    }
}
