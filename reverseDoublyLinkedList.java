import unit4.collectionsLib.BinNode;

public class reverseDoublyLinkedList {
    public static void main(String[] args) {
        createReverseList(5);
        printList(createReverseList(5));
        printRightList(createReverseList(5));
    }

    /**
     * Constructs and returns a doubly linked list containing integers from `n`
     * to `1` in reverse order.
     * @param n A positive integer. The function generates a doubly linked list with values from `n` to `1`.
     * @return The head of the doubly linked list.
     * Complexity: O(n)
     */
    public static BinNode<Integer> createReverseList(int n) {
        BinNode<Integer> head = null;
        BinNode<Integer> current = null;

        for (int i = 1; i <= n; i++) {
            BinNode<Integer> newNode = new BinNode<>(i);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.setRight(newNode);
                newNode.setLeft(current);
                current = newNode;
            }
        }
        return head;
    }

    /**
     * Prints the doubly linked list from the head to the end in left-to-right order.
     *
     * @param head The head of the doubly linked list to be printed.
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
     * Prints the doubly linked list in reverse order (right-to-left), starting from the last node.
     *
     * @param head The head of the doubly linked list to be printed.
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
