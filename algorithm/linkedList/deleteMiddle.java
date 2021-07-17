public class deleteMiddle {
    static boolean deleteNode(LinkedListNode n) {
        LinkedListNode next = n.next;
        if (n == null || n.next == null)
            return false;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
