import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreesIsThisBinaryTreeTest {

    /**
     *      4
     *    2   6
     *   1 3 5 7
     */
    @Test
    public void basic() {
        Node value1 = new Node(1, null, null);
        Node value3 = new Node(3, null, null);
        Node value2 = new Node(2, value1, value3);

        Node value5 = new Node(5, null, null);
        Node value7 = new Node(7, null, null);
        Node value6 = new Node(6, value5, value7);

        Node value4 = new Node(4, value2, value6);

        assertTrue(TreesIsThisBinaryTree.checkBST(value4));
    }

    /**
     *      4
     *    2   6
     *   1 3 7 5 (* reverse)
     */
    @Test
    public void wrongTree() {
        Node value1 = new Node(1, null, null);
        Node value3 = new Node(3, null, null);
        Node value2 = new Node(2, value1, value3);

        Node value5 = new Node(5, null, null);
        Node value7 = new Node(7, null, null);
        // This is the difference
        Node value6 = new Node(6, value7, value5);

        Node value4 = new Node(4, value2, value6);

        assertFalse(TreesIsThisBinaryTree.checkBST(value4));
    }

    /**
     *      4
     *    2   6
     *   1 3 5 (* missing)
     */
    @Test
    public void goodTreeButNotFull() {
        Node value1 = new Node(1, null, null);
        Node value3 = new Node(3, null, null);
        Node value2 = new Node(2, value1, value3);

        Node value5 = new Node(5, null, null);
        Node value6 = new Node(6, value5, null);

        Node value4 = new Node(4, value2, value6);

        assertTrue(TreesIsThisBinaryTree.checkBST(value4));
    }

    /**
     *      4
     *    2   6
     *   1   7 5 (* reverse, and not full)
     */
    @Test
    public void badTreeButNotFull() {
        Node value1 = new Node(1, null, null);
        Node value2 = new Node(2, value1, null);

        Node value5 = new Node(5, null, null);
        Node value7 = new Node(7, null, null);
        Node value6 = new Node(6, value7, value5);

        Node value4 = new Node(4, value2, value6);

        assertFalse(TreesIsThisBinaryTree.checkBST(value4));
    }


    /**
     *      4
     *    2   6
     *   1 5 5 7
     *     ^ > 4!
     */
    @Test
    public void treeWhereALeftSubValueIsGreaterThanRoot() {
        Node value1 = new Node(1, null, null);
        Node value5 = new Node(3, null, null);
        Node value2 = new Node(2, value1, value5);

        Node value7 = new Node(7, null, null);
        Node value6 = new Node(6, value5, value7);

        Node value4 = new Node(4, value2, value6);

        assertFalse(TreesIsThisBinaryTree.checkBST(value4));
    }
}
