package my_list.linked_list;

import my_list.MyList;


public class AgiStringLinkedListImpl implements MyList {
    private Node head;
    private Node tail;
    private int length;

    @Override
    public int size() {
        return length;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isNotEmpty() {
        return !isEmpty();
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

    @Override
    public boolean add(String s) {
        Node newNode = new Node(s);
        tail.setNext(newNode);
        tail = newNode;

        return true;
    }

    @Override
    public boolean put(String s, int index) {
        return false;
    }

    @Override
    public boolean remove(String s) {
        Node n = head;
        while (!(n.getValue().equals(s))) {
            n.next();
        }
        if (n.getValue().equals(s)) {
            n.setValue(null);
        }
        return false;
    }

    @Override
    public boolean contain(String s) {
        Node n = head;
        while (!n.getValue().equals(s)) {
            n.next();
        }

        if (n.getValue() == s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containAll(String[] arr) {
        Node n = head;
        for (int i = 0; i < arr.length; i++) {
            while (!n.getValue().equals(arr[i])) {
                n.next();
            }
            if (n.getValue().equals(arr[i])) {
                break;
            }
            if (n == tail) {
                return false;
            }
        }
        return true;

    }

    @Override
    public boolean containAll(MyList list) {
        return false;
    }

    @Override
    public boolean addAll(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.setNext(newNode);
            tail = newNode;
        }
        return true;
    }

    @Override
    public boolean addAll(MyList list) {
        return false;
    }

    @Override
    public int indexOf(String s) {
        Node n = head;
        int licznikNode = 1;
        while (!n.getValue().equals(s)) {
            n.next();
            licznikNode++;
        }
        return licznikNode;
    }

    @Override
    public String get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n.next();
        }
       return n.getValue();

    }

    @Override
    public int lastIndexOf(String s) {
        return 0;
    }

    @Override
    public MyList sublist(int fromIndex, int toIndex) {
        return null;
    }
}
