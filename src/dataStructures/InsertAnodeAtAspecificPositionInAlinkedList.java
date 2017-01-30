package dataStructures;

/**
 * Created by senuna on 30.01.17.
 */
public class InsertAnodeAtAspecificPositionInAlinkedList {
    /*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

//        Output Format
//        Insert the new node at the desired position and return the head of the updated linked list. Do NOT print anything to stdout/console.
//
//                Sample Input
//
//        NULL, data = 3, position = 0
//        3 --> NULL, data = 4, position = 0
//
//        Sample Output
//
//        3 --> NULL
//        4 --> 3 --> NULL

        //region solution 1
        Node temp = new Node();
        temp.data = data;

        Node current = head;

        if (head == null) {
            return temp;
        } else {
            if(position == 0){
                temp.next = current;
                return temp;
            } else {
                int count = 1;
                Node var = new Node();
                var = head;

                while (position > count) {
                    var = var.next;
                    count++;
                }
                temp.next = var.next;
                var.next = temp;
                return head;
            }

        }
        //endregion

        //region solution clean
        Node dummy = new Node();
        dummy.next = head;

        Node runner = dummy;
        for (int i = 0; i < position; ++i) {
            runner = runner.next;
        }

        Node node = new Node();
        node.data = data;
        node.next = runner.next;
        runner.next = node;

        return dummy.next;
        //endregion

}
