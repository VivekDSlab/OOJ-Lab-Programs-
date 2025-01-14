public class TreeString {
    private final String value; 
    private final TreeString left; 
    private final TreeString right;
    private final int length;
    private TreeString(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.length = value.length();
    }
    private TreeString(TreeString left, TreeString right) {
        this.value = null;
        this.left = left;
        this.right = right;
        this.length = left.length + right.length;
    }
    public static TreeString fromString(String s) {
        return new TreeString(s);
    }
    public TreeString concat(TreeString other) {
        return new TreeString(this, other);
    }
    public int length() {
        return this.length;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(sb);
        return sb.toString();
    }
    private void buildString(StringBuilder sb) {
        if (value != null) { 
            sb.append(value);
        } else { 
            if (left != null) left.buildString(sb);
            if (right != null) right.buildString(sb);
        }
    }
    public static void main(String[] args) {
        TreeString t1 = TreeString.fromString("Hello");
        TreeString t2 = TreeString.fromString(" ");
        TreeString t3 = TreeString.fromString("World");
        TreeString t4 = TreeString.fromString("!");

        TreeString concatenated = t1.concat(t2).concat(t3).concat(t4);
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Length: " + concatenated.length());
    }
}
