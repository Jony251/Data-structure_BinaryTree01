import unit4.collectionsLib.BinNode;

public class createBinNodeFrom1ToNum {
    public static void main(String[] args) {
        BinNode<Integer> head = createBinNode(10);
        printAllBinNodeVal(head);
        printReversBinNodeVal(head);
    }

    /**
     * Creates a binary tree where each node contains an integer value from 1 to {@code num}.
     * The tree is constructed as a doubly linked chain using left and right child pointers.
     *
     * @param num the number of nodes to create in the binary tree.
     * If {@code num} is 0 or negative, the function returns {@code null}.
     * @return the head (root) node of the created binary tree.
     */
    public static BinNode<Integer> createBinNode(int num) {
        BinNode<Integer> h = null;
        if (num > 0) {

            BinNode<Integer> tmp = null;
            BinNode<Integer> p = null;
            for (int i = 1; i <= num; i++) {
                if (h == null) {
                    h = new BinNode<Integer>(i);
                    tmp = h;
                } else {
                    p = new BinNode<Integer>(i);
                    tmp.setRight(p);
                    p.setLeft(tmp);
                    tmp = p;
                }
            }
        }
        return h;
    }

    /**
     * Prints a binary tree where each node contains an integer
     *
     * @param head the pointer to the first element
     */
    public static void printAllBinNodeVal(BinNode<Integer> head) {
        if (head != null) {
            BinNode<Integer> tmp = head;

            for (; tmp != null; tmp = tmp.getRight())
                System.out.print("" + tmp.getValue() + ", ");
            System.out.println();
        } else System.out.print("The node list is empty!");
    }

    /**
     * Prints a binary tree in reverse order where each node contains an integer
     *
     * @param head the pointer to the first element
     */
    public static void printReversBinNodeVal(BinNode<Integer> head) {
        if (head != null) {
            BinNode<Integer> tmp = head;
            while (tmp.hasRight())
                tmp = tmp.getRight();

            for (; tmp != null; tmp = tmp.getLeft())
                System.out.print("" + tmp.getValue() + ", ");
            System.out.println();
        } else System.out.print("The node list is empty!");
    }

    public static BinNode<Integer> addNumToBinNode(BinNode<Integer> head, BinNode<Integer> point, int num) {
        BinNode<Integer> tpm = null;
        BinNode<Integer> cur = null;

        if(head==null) head = new BinNode<Integer>(num);
        else {
            if(point==null){
                point=new BinNode<Integer>(num);
                point.setRight(head);
                head.setLeft(point);
                head=point;
            }
            else
            {

            }

        }
        return head;
    }
}
