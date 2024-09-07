import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ll {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    node head = null;

    public void creation() {
        int data;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter data");
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("enter 1 to conntinue");
            n= sc.nextInt();
        }
        while (n==1);
        }
        public void display()
            {
                node temp=head;
                if (head==null){
                    System.out.println("ll does not exist ");

                }
                else {
                    while(temp!=null){
                        System.out.println(temp.data);
                        temp=temp.next;
                    }
                }
            }

    public static void main(String[] args) {
        ll ll=new ll();
        ll.creation();
        ll.display();

    }

}
