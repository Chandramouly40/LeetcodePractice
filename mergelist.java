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
    int finsize=100;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int arr[]=new int [100];
        Arrays.fill(arr,202);
        int last_index=0;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null)
        {
            arr[last_index++]=temp1.val;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            arr[last_index++]=temp2.val;
            temp2=temp2.next;
        }

        ListNode ans=null,temp=null;
        Arrays.sort(arr);
        for(int i=0;i<last_index;i++)
        {
            ListNode newnode=new ListNode(arr[i]);
            if(i==0)
            {
                ans=newnode;
                temp=ans;
               
            }
            else
            {
                temp.next=newnode;
                temp=temp.next;
            }  
        }
        return ans;
        
    }
}
