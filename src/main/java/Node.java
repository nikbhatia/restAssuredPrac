
public class Node {

    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    static class LinkedList{
        int size = 0;

        Node head ;
        public Node insertAtAnyPosition(int value,int pos){
            Node temp = head;
            if(pos == 1 && size <= 0){
               Node node = new Node(value);
               head = node;
               size++;
               return head;
            }
            else if(pos ==1 && size >0){
                Node node = new Node(value);
                node.next = head;
                head = node;
                size++;
                return head;
            }
            else {
                for (int i = 1; i < size && i <pos; i++) {
                  temp = temp.next;
                }
                Node node = new Node(value);
                Node temp1= temp.next;
                temp.next = node;
                node.next = temp1;
                size++;
            }
            return head;
        }

        public int sizeCount(LinkedList list){
            Node temp = head;
            if(temp == null){
                return 0;
            }
            else{
               while(temp!=null){
                   size++;
                   temp = temp.next;
               }
            }
            return size;

        }
        public void traverseLinkedList(LinkedList list){
            Node temp = head;
            if(temp==null){
                System.out.println("empty");
            }
            else{
                while(temp.next!=null) {
                    System.out.println(temp.value);
                    temp = temp.next;
                }
            }

        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insertAtAnyPosition(1,1);
            list.insertAtAnyPosition(1,2);
            list.insertAtAnyPosition(1,3);
            list.insertAtAnyPosition(2,2);
            list.traverseLinkedList(list);

        }

    }
}
