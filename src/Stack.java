public interface Stack<T> {


    boolean isEmpty(); // it checks whether stack is empty or not

    void push(T data);

    T pop();

    T peek();

    int size();

    String toString();
}
