import unit4.collectionsLib.BinNode;

public class ifDoublyLinkedList_Palindrome {
    public static void main(String[] args) {
        BinNode<Character> head = createCharList("radar");

        System.out.println("radar"+(isPalindrome(head) ? " --> is palindrom - TRUE" : " --> is palindrom - FALSE"));
        head = createCharList("hello");
        System.out.println("hello"+(isPalindrome(head) ? " --> is palindrom - TRUE" : " --> is palindrom - FALSE"));
    }

    /**
     * Checks if the given doubly linked list forms a palindrome
     * @param head The head of the doubly linked list
     * @return `true` if the list is a palindrome, `false` otherwise
     * Complexity O(n)
     */
    public static boolean isPalindrome(BinNode<Character> head) {
        if (head == null || head.getRight() == null) {
            return true;
        }

        BinNode<Character> left = head;
        BinNode<Character> right = head;
        while (right.getRight() != null) {
            right = right.getRight();
        }

        while (left != right && left.getLeft() != right) {
            if (!left.getValue().equals(right.getValue())) {
                return false;
            }
            left = left.getRight();
            right = right.getLeft();
        }

        return true;
    }

    /**
     * Helper method to create a doubly linked list from a string
     *
     * @param str The string to convert into a doubly linked list of characters
     * @return The head of the doubly linked list
     */
    public static BinNode<Character> createCharList(String str) {
        BinNode<Character> head = null;
        BinNode<Character> current = null;

        for (char c : str.toCharArray()) {
            BinNode<Character> newNode = new BinNode<>(c);
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
}
