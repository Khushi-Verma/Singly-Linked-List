//implementation of ListNode in singly linked list 
public class Main{
    //intance variable
    private ListNode head;
    //ListNode class
    private static  class ListNode{
        private int data; //this data can be off generic type
        private ListNode next;// next will be pointing to the next NoClassDefFoundError
        //constructor will contain data part
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    //method to display elements of list
    public void display(){
        ListNode current=head;//current point to head of ListNode
       
        while(current!=null){//if current is  equal to null we know we traverse the list completely
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("NULL");
    }
    //method to return length of singly linked ListNode
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;//current point to head
        while(current!=null){
            count++;//increase by 1
            current=current.next;//current to next node
        }
        return count;
    }
    //method to insert a node at the begining
    public void insertFirst(int value){
        //when list is empty head points to null which means we have to create list node first then insert the elements
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    //
     public static void main(String[] args){
        Main sll = new Main();//initialization of singly linked ListNode
        sll.head=new ListNode(10);//assigning values 
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        //Now we have four nodes now we will  them together to form a chain
        sll.head.next= second;//10->1
        second.next=third;//10->1->8
        third.next=fourth;//10->1->8->11-->null
         System.out.println("Here is your singly linked List-->");
        sll.display();
        System.out.println();
        System.out.println("The length of sll is: "+sll.length());
        sll.insertFirst(11);
        System.out.println("the fist node we add is");
        sll.display();
    }
}
