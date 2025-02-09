import unit4.collectionsLib.BinNode;

public class insertToEndBNlist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 4};

        BinNode<Integer> bnList = createList(arr);
        printList(createList(arr));

        insertEndBNlist(bnList, 333);
        printList(bnList);
    }

    /**
     * Inserts a new integer node as the head of a doubly linked list
     * Updates the existing head to be linked as the next node with its value preserved
     *
     * @param head the current head of the linked list
     * @param num the integer value to be inserted as the new head
     * Complexity: O(n)
     */
    public static void insertEndBNlist(BinNode<Integer> head, int num) {
        if (head == null) {
            System.out.println("The list cannot be empty.");
            return;
        }

        BinNode<Integer> current =  head;

        while (current.hasRight()){
            current = current.getRight();
        }

        BinNode<Integer> temp = new BinNode<>(num);
        current.setRight(temp);
        temp.setLeft(current);
    }

    /**
     * Creates a doubly linked list of integers from an array
     * @param values an array of integers to be converted into a linked list
     * @return the head node of the created linked list
     * Complexity: O(n) (where n is the size of the input array; each element is processed once)
     */
    public static BinNode<Integer> createList(int[] values) {
        BinNode<Integer> head = null;
        BinNode<Integer> current = null;

        for (int bafer : values) {
            BinNode<Integer> newBinNode = new BinNode<>(bafer);
            if (head == null) {
                head = newBinNode;
                current = head;
            } else {
                current.setRight(newBinNode);
                newBinNode.setLeft(current);
                current = newBinNode;
            }
        }
        return head;
    }

    /**
     * Prints the linked list from the given head node to the end of the list
     * Each node value is printed in order, separated by <->
     *
     * @param head the head node of the linked list to be printed
     *
     * Complexity: O(n) (where n is the number of nodes in the list; each node is visited once)
     */
    public static void printList(BinNode<Integer> head) {
        BinNode<Integer> current = head;
        while (current != null) {
            System.out.print(current.getValue());
            if (current.getRight() != null) {
                System.out.print(" <-> ");
            }
            current = current.getRight();
        }
        System.out.println();
    }

    /**
     * Prints a doubly linked list in reverse, starting from the last node and ending at the head
     * The list is printed in reverse order, with values separated by <->
     *
     * @param head the head node of the linked list from which traversal starts
     *
     * Complexity: O(n) (where n is the number of nodes in the list; first traversal to the end, then reversed)
     */
    public static void printRightList(BinNode<Integer> head) {
        BinNode<Integer> current = head;

        while (current.getRight() != null) {
            current = current.getRight();
        }

        while (current != null) {
            System.out.print(current.getValue());
            if (current.getLeft() != null) {
                System.out.print(" <-> ");
            }
            current = current.getLeft();
        }
        System.out.println();
    }
}
