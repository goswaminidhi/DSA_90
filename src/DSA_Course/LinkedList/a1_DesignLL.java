package DSA_Course.LinkedList;

public class a1_DesignLL {
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;

        }
    }
    Node head;
    int size;

    public a1_DesignLL() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        int count = 0;
        Node node = head;
        while(count != index){
            node = node.next;
            count++;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            size++;
            return ;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node node = head;
        while(node.next != null){
            node = node.next;

        }
        node.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        Node newNode = new Node(val);
        if(index == 0){
            addAtHead(val);

        }
        else if(index == size){
            addAtTail(val);

        }else{
            Node node = head;
            int count = 0;
            while(count != index -1){
                node = node.next;
                count++;
            }
            newNode.next = node.next;
            node.next = newNode;
            size++;
        }

    }


    public void deleteAtIndex(int index) {

        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node node = head;
        int count = 0;
        while(count != index - 1){
            node = node.next;
            count++;
        }
        node.next = node.next.next;
        size--;
    }
}
