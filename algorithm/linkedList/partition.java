public class partition {
    static LinkedListNode part(LinkedListNode node, int value) {
        LinkedListNode head = node;
        LinkedListNode tail = node;
        while (node != null) {
            LinkedListNode next = node.next;
            if (node.data < value) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        return head;
    }
}
