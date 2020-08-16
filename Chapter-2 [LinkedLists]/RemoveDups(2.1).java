  // Chapter 2 - 2.1 - Remove Dups
  
  /*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
  
  
  // With temporary Buffer
  public void removeDuplicates(Node head) {
     if (head == null) {
      return;
    }
    Set<Integer> dataSet = new HashSet<>();
    Node current = head;
    while (current.next != null) {
        if (dataSet.contains(current.next.data)) {
          current.next = current.next.next;
        } else {
          dataSet.add(current.data);
          current = current.next;
		}
    }
  }
  
  // Without temporary buffer 
   public void removeDuplicates(Node head) {
     if (head == null) {
      return;
    }
	 Node current = head;
    while(current != null) {
       Node second = current;
      while(second.next != null) {
        if(current.data == second.next.data) {
          second.next = second.next.next;
        } else {
          second = second.next;
        }
      }
      current = current.next;
    }
  }
	