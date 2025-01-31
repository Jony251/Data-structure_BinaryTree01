import unit4.collectionsLib.BinNode;

public class printBinNodeVal_andReverePrint {
    public static void main(String[] args) {
        //BinNode<Integer> head = createBinNode(10);
        //printAllBinNodeVal(head);
        //printReversBinNodeVal(head);
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

}
