public class LinkedList {
    Node head;

    // Tambah data di akhir
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = new Node(value);
    }

    // Hapus data berdasarkan nilai
    public void delete(int value) {
        if (head == null) return;
        if (head.value == value) { 
            head = head.next; 
            return; 
        }

        Node curr = head;
        while (curr.next != null && curr.next.value != value) {
            curr = curr.next;
        }
        if (curr.next != null) curr.next = curr.next.next;
    }

    // Cetak list
    public void print() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.value + " -> ");
        }
        System.out.println("null");
    }
}