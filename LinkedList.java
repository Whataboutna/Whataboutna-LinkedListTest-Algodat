public class LinkedList extends Perlakuan {

    // Tambah data di akhir
    @Override 
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(new Node(value));
    }

    // Hapus data berdasarkan nilai
    @Override 
    public void delete(int value) {
        if (head == null) return;
        if (head.getValue() == value) { 
            head = head.getNext(); 
            return; 
        }

        Node curr = head;
        while (curr.getNext() != null && curr.getNext().getValue() != value) {
            curr = curr.getNext();
        }
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext());
        }
    }

    // Menyalin isi LinkedList ke objek baru untuk pengujian adil
    public LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node curr = this.head;
        while (curr != null) {
            newList.add(curr.getValue());
            curr = curr.getNext();
        }
        return newList;
    }
}