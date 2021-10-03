/**
 * @author Hassan Wael
 */
public class LinkedList {

    Node head;
    Node tail;

    public static LinkedList appendData(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
            list.tail = newNode;
        } else {
            Node lastNode = list.tail;
            lastNode.next = newNode;
            list.tail = newNode;
        }
        return list;
    }

    public static void deleteLastElement(LinkedList list) {
        if (list.head == null) {
            System.out.println("no nodes to be deleted");
        } else if (list.head != list.tail) {
            Node current = list.head;
            while (current.next != list.tail) {
                current = current.next;
            }
            list.tail = current;
            list.tail.next = null;
        } else {
            list.head = list.tail = null;
        }
    }

    public static void insertElemet(LinkedList list, Node prev_position, int data){// 1 2 3 5
        if(prev_position == null){
            System.out.println("node position is null");
        } else {
            Node newNode = new Node(data);
            if (list.head == null) {
                list.head = newNode;
                list.tail = newNode;
            } else {
               newNode.next = prev_position.next;
               prev_position.next = newNode;
            }
        }
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
