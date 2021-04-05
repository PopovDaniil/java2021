public class Task2 {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 0; i < 9; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public static void main2(String[] args) {
        Node head = null; 
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}