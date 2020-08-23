// Chapter 2 - 2.3 - Delete Middle Node
// Implement an algorithm to delete a node in the middle (i.e., any node but first and last node, not necessarily the exact
// middle Node. 
// Example 1->2->3->4, Output = 1->2->4 or 1->3->4

// Given access to head
 public void deleteMiddleNode(Node head) {
    Node current = head;
    Node runner = head;
    
    int sum = 0;
    while(current != null) {
      current = current.next;
      sum++;
    }
    if (sum <= 2) {
      return;
    } else {
      runner.next = runner.next.next;
    }
  }
  
  // Given access to only the Node that needs to be deleted
  public void deleteMiddleNode(Node someNode) {
	  if(someNode == null || someNode.next == null)
		  return;
	  
	 Node newNode = someNode.next;
	 someNode.data = newNode.data;
	 someNode.next = newNode.next;
	 return;
  }
