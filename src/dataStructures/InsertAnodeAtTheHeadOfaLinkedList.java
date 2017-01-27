package dataStructures;

/**
 * Created by senuna on 27.01.17.
 */

/*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

public class InsertAnodeAtTheHeadOfaLinkedList {


    Node Insert(Node head,int x) {

        if (head == null){
            head = new Node();
            head.data = data;
        }
        else {
            Node node = head;
            node.next = new Node();
            node.next.data = head.data;
            head.data = x;
        }
        return head;

    }



    }


}
