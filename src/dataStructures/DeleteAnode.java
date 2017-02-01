package dataStructures;
import dataStructures.Node;
/**
 * Created by senuna on 01.02.17.
 */
public class DeleteAnode {
    /*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.

    Node Delete(Node head, int position) {
        // Complete this method

        if (position == 0){
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < (position -1); i++){
                curr = curr.next;
            }
            curr.next = curr.next.next; //neat!
            // Node temp=curr.next;
            //curr.next=temp.next;
        }
        return head;
    }
}
