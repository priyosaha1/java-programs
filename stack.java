import java.util.Scanner;

class stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int t;
        do {
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to display");
            int d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.push();
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("enter 1 to go back to the menu or press any key");
            t = sc.nextInt();
        } while (t == 1);
        if(t==1){
            System.out.println("stack memory given ");
        }
        else {
            System.out.println("not given to you sala");
        }

    }

    void push() {
        if (top == (n - 1)) {
            System.out.println("overflow"); // when the stack is full
        } else {
            System.out.println("enter data");
            int i = sc.nextInt();
            top = top + 1;
            a[top] = i;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("underflow"); // when the stack is empty
        } else {
            top = top - 1;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Items are ");
            for (int j = top; j >= 0; j--) {
                System.out.println(a[j]);
            }
        }
    }
}
