/*
Chapter 2, 2.5 - Sum Lists
You have two numbers represented by a LinkedList, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list. 

Example 
Input: (7->1->6) + (5->9->2) 
Output: 2->1->9 

*/
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalNode = new ListNode(0);
        ListNode finalHead = finalNode;
        int carry = 0;
        int sum = 0;
        
        while (l1 != null || l2 != null) {
          int l1Val = l1 != null ? l1.val :0;
          int l2Val = l2 != null ? l2.val :0;
          sum = l1Val + l2Val + carry;
            if (sum > 9) {
                carry = sum / 10;
                finalNode.next = new ListNode(sum % 10);
            } else {
                finalNode.next = new ListNode(sum % 10);
                carry = 0;
            }
            finalNode = finalNode.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }     
        
        if (carry > 0) {
            finalNode.next = new ListNode(carry);
        }
        return finalHead.next;      
        
    }