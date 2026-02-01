public class BinNode<T> {
    private T value; // Node value
    private BinNode<T> left;
    private BinNode<T> right;

    /*
     * Constructor - returns a Node with "value" as value and without successesor
     * Node
     **/
    public BinNode(T value) {
        this.value = value;
    }

    /*
     * Constructor - returns a Node with "value" as value and its successesor is
     * "next"
     **/
    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    public boolean hasRight() {
        return right != null;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public boolean hasLeft() {
        return left != null;
    }

    /* Returns the Node "value" **/
    public T getValue() {
        return this.value;
    }

    /* Set the value attribute to be "value" **/
    public void setValue(T value) {
        this.value = value;
    }

    public String toString_DList() {
        return value + " <=> " + right;
    }

    /* Returns in-order string representation of the tree **/
    public String toString() {
        // if leaf avoid recursion
        if (left == null && right == null)
            return value.toString();
        return "( " + left + " " + value + " " + right + " )";
    }

    private void display(BinNode<T> node, String prefix, boolean isRight) {
        // 1. Recurse Left (Now the TOP child)
        if (node.hasLeft()) {
            // If we are currently a bottom child (isRight),
            // the vertical bar │ must continue upward.
            display(node.getLeft(), prefix + (isRight ? "│   " : "    "), false);
        }

        // 2. Print Current Node
        // Using ┌── for the top child and └── for the bottom child
        System.out.println(prefix + (isRight ? "└── " : "┌── ") + node.getValue());

        // 3. Recurse Right (Now the BOTTOM child)
        if (node.hasRight()) {
            // If we are currently a top child (!isRight),
            // the vertical bar │ must continue downward.
            display(node.getRight(), prefix + (isRight ? "    " : "│   "), true);
        }
    }

    public void display() {
        // Start by treating the root's children correctly
        if (this.hasLeft()) {
            display(this.getLeft(), "", false);
        }

        System.out.println(this.getValue());

        if (this.hasRight()) {
            display(this.getRight(), "", true);
        }
    }
}
