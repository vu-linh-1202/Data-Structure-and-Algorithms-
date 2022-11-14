package DataStructureAlgorilsm.linked_list;

public class LinkedList {

    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);// gia tri cua Node hien tai
                temp = temp.next;
                if (temp != null) {
                    System.out.printf("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode==null){
            return newNode;
        }
        else {
            //b1: Xac dinh LastNode(lastNode==null)
            Node lastNode= headNode;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            // B2: gan next cho lastNode = newNode
            lastNode.next=newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index){
        if (index==0){
          return addToHead(headNode, value);
        }
        else {
            //B1: find index need to add
            Node newNode= new Node(value);
            Node curNode= headNode;
            int count=0;
            while (curNode!=null){
                count++;
                if (count==index){
                    // Thuc hien add
                    newNode.next=curNode.next;
                    curNode.next=newNode;
                    break;
                }
                curNode=curNode.next;
            }
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        n1= addToHead(n1, 0);
        n1 = addToTail(n1, 4);
        printLinkedList(n1);
    }
}
