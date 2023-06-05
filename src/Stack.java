public class Stack<T>{
    private Node<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        
        if (size == 0) {
            head = newNode;
        } 
        else {
            newNode.setNext(head);
            head=newNode;
        }
        size++;
    }

    public T pop() throws Exception{
        if (size == 0) {
            throw new Exception("Algo deu errado!");
        } 
        else {
            T value = head.getValue();
            head = head.getNext();
            size--;

            return value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } 
        else {
            return false;
        }    
    }

    public T top() {
        T first = head.getValue();
        return first;
    }

    public void display() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}