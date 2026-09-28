public class MainNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // Outputnya bakalan kayak gini harusnya: 10 -> 20 -> 30 -> null

        list.delete(20); // ini dicoba kalau di delete yang data 20
        list.print(); // Inikan udah dihapus data 20, jadi Outputnya harusnya gini: 10 -> 30 -> null
    }
}