public class LinkedBasedGenericStack<T> implements Stack<T>{
    private Node <T> head;
    private int size=0;
    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void push(T data) {
        Node <T> node = new Node<>(data);
        node.setNext(head);
        head=node;
        size++;

    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        T data = head.getData();
        head=head.getNext();
        return data;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        return head.getData();
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        Node <T> walk = head;
        StringBuilder str= new StringBuilder();
        while (walk!=null){
            str.append(walk.getData()).append(" ");
            walk=walk.getNext();
        }
        return str.toString();
    }
}
