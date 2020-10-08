public class someMethod {
    //求结点个数
    public static int sumTreeNodeSize(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int rootNodeSize = 1;
            int leftSubTreeNodeSize = sumTreeNodeSize(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize(root.right);

            return rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
        }
    }

    //求第k层的节点个数
    public static int sunKLevelNodeSize(TreeNode root, int k) {
        if (root == null) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            int leftNodeSize = sunKLevelNodeSize(root.left, k - 1);
            int rightNodeSIze = sunKLevelNodeSize(root.right, k - 1);
            return leftNodeSize + rightNodeSIze;
        }
    }

    //求二叉树的高度
    public static int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftTreeHeight = treeHeight(root.left);
            int rightTreeHeight = treeHeight(root.right);
            return Math.max(leftTreeHeight, rightTreeHeight) + 1;
        }
    }

    public static boolean contains1(TreeNode root, int v) {
        if (root == null) {
            // 空树
            return false;
        } else {
            if (root.val == v) {
                // 根里找到了
                // 没必要再去左右子树找了
                return true;
            } else {
                // 根里没找到
                boolean leftSubTreeContains = contains1(root.left, v);
                if (leftSubTreeContains) {
                    // 左子树里找到了
                    // 没必要再去右子树里找了
                    return true;
                } else {
                    // 左子树里也没找到
                    boolean rightSubTreeContains = contains1(root.right, v);
                    if (rightSubTreeContains) {
                        // 右子树里找到了
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
