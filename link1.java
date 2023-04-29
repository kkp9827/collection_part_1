
public class link1 {
       Node head;
       
       class Node{
              String data;
              Node next;
          
              Node(String data)
          {
              this.data = data;
              this.next = null;
          }

       }

       // add - first 
        public void addfirst(String data){
              Node newNode = new Node(data);
              if(head == null)
              {
                     head = newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;
        }
        // add last
        public void addLast(String data){
              Node newNode = new Node(data);
              if(head == null)
              {
                     head = newNode;
                     return;
              }
             Node currNode =head;
             while(currNode.next != null){
                 currNode=currNode.next;
             }
            currNode.next = newNode;
       }

       // print the list 
       public void printlist()
       {
              if(head == null) {
                     System.out.println("list is empty");
                     return;
              }
              Node currNode =head;
              while(currNode!= null){
                   
                   System.out.print(currNode.data +" -> ");
                  currNode=currNode.next;
              }
              System.out.println("NULL");

       }

       // delete first 
       public void deletefirst()
       {
              if(head==null)
              {
                     System.out.println("list is empyt");
                     return;
              }
              head= head.next;
       }

       // delete last
       public void deleteLast()
       {
              if(head==null)
              {
                     System.out.println("list is empyt");
                     return;
              }
              
             
       }

       public static void main(String[] args)
       {
              link1 list = new link1();
              list.addfirst("a");
              list.addfirst("is");
              list.printlist();

              list.addLast("list");


       }
}
