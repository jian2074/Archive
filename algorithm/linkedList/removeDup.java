import java.util.HashSet;

public class removeDup {
    static void remove(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(5);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(4);
        LinkedListNode node4 = new LinkedListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;
        remove(node1);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
        System.out.println(node1.next.next.next);
    }
}
