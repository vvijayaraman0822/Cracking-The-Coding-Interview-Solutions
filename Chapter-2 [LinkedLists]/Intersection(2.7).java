//2 - 2.7 - Intersection
/*
* Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting Node.
* Note that the intersection is defined based on reference, not value. That is, if the kth node of the first
* node of the first Linked list is the exact same node (by reference) as the jth node of the second linked
* list, then they are intersecting

*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        Set<ListNode> set = new HashSet<>();
        
        while(first != null) {
            set.add(first);
            first = first.next;
        }
        
        ListNode second = headB;
        while(second != null) {
            if(set.contains(second)) {
                return second;
            }
            second = second.next;
        }
        return null;
    }
    
}