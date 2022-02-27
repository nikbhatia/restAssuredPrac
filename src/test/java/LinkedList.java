//
//class LinkedList {
//
//    int value;
//    LinkedList next;
//
//    public LinkedList(int value) {
//        value = this.value;
//    }
//}
//
//    class LinkedListUtlities {
//        public LinkedList insert(int value, LinkedList head) {
//            if (head == null) {
//                LinkedList linkedlist = new LinkedList(value);
//                head = linkedlist;
//            } else {
//                while (head != null) {
//                    head = head.next;
//                }
//                head.next = new LinkedList(value);
//
//            }
//            return head;
//        }
//
//        public void printLinkedList(LinkedList head) {
//            if (head.next == null) {
//                System.out.println("Linked List is empty");
//            }
//            while (head.next != null) {
//                System.out.println("Linked List values " + head.value);
//                head = head.next;
//            }
//        }
//
//
//        public static void main(String[] args) {
////            LinkedListUtlitie
////            LinkedList list = new LinkedList(1);
////            list.insert(1, list);
////            list.printLinkedList(list);
//        }
//    }
// 1-2-3-4-5-6-7-8-9-10  next value
// count = 10/2; = 5
// first
//
//}