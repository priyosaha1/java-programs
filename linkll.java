import java.util.Scanner;

public class linkll {
    static class node{
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
        }
        node head=null;
    public void create() {
        int data;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("data de bal");
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {

                new_node.next = head;
                head = new_node;

            }
            System.out.println("1 de aro dewar jonno");
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
        linkll rr= new linkll();
        rr.create();
        rr.traverser();
    }


        }

