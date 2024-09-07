import java.util.Scanner;

public class singly_list {
    static class node{
        int data;
         node next;
         node(int data){
             this.data=data;
             this.next=null;

         }
    }
    node head=null;
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data : ");
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Enter 1 to continue ");
            n = sc.nextInt();

        }
        while (n == 1);
    }
        public void traverser(){
            node temp = head;
            if(head==null){
                System.out.println("ll does not exist");

            }
            else {
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }

                }

    public static void main(String[] args) {
        singly_list ll=new singly_list();
        ll.creation();
        ll.traverser();
    }
            }


