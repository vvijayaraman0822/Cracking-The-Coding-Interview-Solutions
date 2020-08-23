// 2.8 - Loop Detection 
/* Given a Linked List which might contain a loop, implement an algorithm that returns the node at the beginning of 
of the loop (if one exists)
*/

// 141. Linked List Cycle

// Using a Set. O(n) - Time & Space complexity

    public ListNode hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode current = head;
        while (current != null) {
          if(!nodeSet.contains(current)) {
              nodeSet.add(current);
          } else {
              return ListNode;
          }
            current = current.next;
        }
        return null;
    }
}

// Without Using any DS. O(n) - Time complexity & O(1) - Space Complexity

    public ListNode hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
