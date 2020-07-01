package tas_promt.demo.Create_List;

public class LinkedList {

    class Node{
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Integer getData() {
            return data;
        }
        public void setData(Integer data) {
            this.data = data;
        }
    }

private int size = 0;
private Node header;
private Node tail;

public LinkedList() {

}

public void add(Integer data) {
    //PUT YOUR CODE HERE
    Node node = new Node();
    node.setData(data);
    if (tail == null) {
        header = node;
        tail = node;
    } else {
        tail.next = node;
        tail = node;
    }
    size++;
    //PUT YOUR CODE HERE
}


public Integer get(int index) {
    //PUT YOUR CODE HERE
    if (size() == 0 || index > size()-1) {
        return null;
    }
    Node t = header;
    int i = 0;
    while (i < index) {
        t = t.next;
        i++;
    }
    return t.getData();
    //PUT YOUR CODE HERE
}

public boolean delete(int index) {
    //PUT YOUR CODE HERE
    if (size() == 0 || index > size()-1) {
        return false;
    }

    if (index == 0) {
        header = header.next;
        size--;
        return true;
    }
    if(index<0){
        return false;
    }
    Node t = header;
    int i = 0;
    while (i < index-1) {
        t = t.next;
        i++;
    }
    if (tail == t.next) {
        tail = t;
    }
    t.next = t.next.next;
   // t.setNext(t.getNext().getNext());
    size--;
    return true;
    //PUT YOUR CODE HERE
}

public int size() {
    //PUT YOUR CODE HERE
    return this.size;
    //PUT YOUR CODE HERE
}


}