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
        while (curr.getNext() != null && curr.getNext().getValue() != value)  { //curr.next.value != value) ini tuh maksudnya dia ngecek kalo value selajutnya value yang dicari atau bukan, kalo sama dengan yang dicari maka berarti while stop, terus kalo nggak sama maka lanjut nyari lagi bray
            curr = curr.getNext();
        }
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext()) ;
        }
    }
}