import java.util.LinkedList;

public class returnKth {
    static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode a_pointer = head;
        LinkedListNode b_pointer = head;

        // Move a_pointer for k steps
        for (int i = 0; i < k; i++) {
            if (a_pointer == null)
                return null;
            a_pointer = a_pointer.next;
        }

        while (a_pointer != null) {
            a_pointer = a_pointer.next;
            b_pointer = b_pointer.next;
        }

        return b_pointer;
    }

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(4);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(6);
        LinkedListNode node5 = new LinkedListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(nthToLast(node1, 2));
        System.out.println(node4);
    }
}
