/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(-1);
        ListNode cur=dum;
        ListNode tem1=l1;
        ListNode tem2=l2;
        int carry=0;
        while(tem1!=null || tem2!=null){
            int sum=carry;
            if(tem1!=null)sum+=tem1.val;
            if(tem2!=null)sum+=tem2.val;

           ListNode n=new ListNode(sum%10);
           carry=sum/10;

           cur.next=n;
           cur=cur.next;

           if(tem1!=null) tem1=tem1.next;
           if(tem2!=null) tem2=tem2.next;
        }
        if(carry>0){
          //  ListNode n=new ListNode(carry);
            cur.next=new ListNode(carry);

        }
        return dum.next;
    }

}