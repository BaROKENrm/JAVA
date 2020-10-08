class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode(int val) {
        this.val = val;
    }
    public String toString() {
        return String.format("%c", val);
    }
}
