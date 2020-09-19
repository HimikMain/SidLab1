public class List {
    private Node head;
    private Node tail;

    private int size = 0;

    public List(){
        head = null;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void add(int data1, int data2){
        Node cur = head;

        boolean check = true;

        if (head != null) {
            check = false;

            while (cur.coef != data1) {
                cur = cur.next;

                if (cur == null) {
                    check = true;
                    break;
                }
            }
        }

        if (data2 != 0) {
            if (check) {
                Node temp = new Node();

                temp.coef = data1;
                temp.index = data2;

                if (isEmpty()) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            } else {
                cur.index += data2;
            }
        }

        size++;
    }
}