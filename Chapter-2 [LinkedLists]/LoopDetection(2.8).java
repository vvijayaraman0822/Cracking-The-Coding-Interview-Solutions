// 2.8 - Loop Detection 
/* Given a Linked List which might contain a loop, implement an algorithm that returns the node at the beginning of 
of the loop (if one exists)
*/

// 141. Linked List Cycle

// Using a Set. O(n) - Time & Space complexity

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode current = head;
        while (current != null) {
          if(!nodeSet.contains(current)) {
              nodeSet.add(current);
          } else {
              return current;
          }
            current = current.next;
        }
        return null;
    }
}

// Without Using any DS. O(n) - Time complexity & O(1) - Space Complexity

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
           return null; 
        }
        
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        
        while(slowPointer != fastPointer) {
            if (slowPointer == null || fastPointer == null || fastPointer.next == null) {
                return null;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        // Slow and Fast Pointer will eventually meet 
        slowPointer = head;
        while (slowPointer != fastPointer.next) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        
        return slowPointer;
    }
}
