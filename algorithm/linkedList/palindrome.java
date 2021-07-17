public class palindrome {
    static boolean compare(LinkedListNode node) {
        LinkedListNode clone = reverseAndClone(node);
        return isEqual(node, clone);
    }

    static LinkedListNode reverseAndClone(LinkedListNode node) {
        LinkedListNode head = null;
        while (node != null) {
            LinkedListNode n = new LinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    static boolean isEqual(LinkedListNode l1, LinkedListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.data != l2.data) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
