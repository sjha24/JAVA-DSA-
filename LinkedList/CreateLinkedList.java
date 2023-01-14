import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
}
public class CreateLinkedList{ 
    static ListNode head = null, tail = null;//Linked List(Collection of node);
    public static void addNode(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    public static void displayNode(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            int val = scn.nextInt();
            addNode(val);
        }
        displayNode();
    }
}