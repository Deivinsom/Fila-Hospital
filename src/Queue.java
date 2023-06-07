public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(T element) {
        Node<T> current = new Node<>(element);

        if (head == null) {
            head = current;
            head.setNext(tail);
            size++;
        } 
        else {
            Node<T> value = head;

            do {
                if (value.getNext() != tail) {
                    value = value.getNext();
                }
                else {
                    value.setNext(current);
                    current.setNext(tail);
                    size++;
                    return;
                }
            } while (value.getNext() != tail);
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
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

    public T front() {
        T first = head.getValue();
        return first;
    }

    public void display() {
        Node<T> current = head;

        while (current != tail) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}