class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Linked_List2 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Inserting nodes at the beginning
        list.insertAtBeginning(3);
        list.insertAtBeginning(7);
        list.insertAtBeginning(10);
        list.insertAtBeginning(1);

        // Displaying the linked list
        System.out.println("Linked List after insertion at the beginning:");
        list.display();
    }
}
