/*
Chapter 2, 2.4 - Partition
Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
Example

Input:

[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

Partition around 9

Output:

8 7 6 5 4 3 2 1 0 9 10 

*/

public void partition(Node head, int partition) {
  Node smallNode = new Node(0); // at the end, this will be at the end of small LinkedList
  Node startSmallNode = smallNode; // this will be at the beginning of small LinkedList
  Node bigNode = new Node(0); // this will be at the end of big LinkedList
  Node startBigNode = bigNode; // this will be at the beginning of big LinkedList
  Node current = head;

    while (current != null) {
     /* If node is smaller then partition, Insert to smallNode */
          if (current.data < partition) {
           smallNode.next = current;
           smallNode = smallNode.next;
          } else {
     /* If node is smaller then partition, Insert to bigNode */
            bigNode.next = current;
            bigNode = bigNode.next;
		}
        current = current.next;
          }
         bigNode.next = null;
         smallNode.next = startBigNode.next;
         head = startSmallNode.next;       
      }
