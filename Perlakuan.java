public abstract class Perlakuan {
    protected Node head;    

    public abstract void add (int value);
    public abstract void delete (int value);

    public void print() {
        for (Node curr = head; curr != null; curr = curr.getNext()) {
            System.out.print(curr.getValue() + " -> ");
        }
        System.out.println("null");
    }
}