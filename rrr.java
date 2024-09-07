import java.util.Random;
import java.util.Scanner;

public class rrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int r[] = {1, 2, 3};
        int s[]={4,5,6};
        int p[]={7,8,9};
        System.out.println("r=Rock,s=paper,p=secisior");
        System.out.println("enter ur choice : ");
        int h = sc.nextInt();
        int ran =random.nextInt(9);
        int c=r[ran];
        c=s[ran];
        c=p[ran];
        System.out.println("comp :"+c);
        System.out.println("human :"+h);
        if(c==h){
            System.out.println("tie");
        }
        else if (c==1 && h==2) {
            System.out.println("human wins");
        }
        else if(c==2 && h==1){
            System.out.println("ccomputer wins");
        } else if (c==1 && h==3) {
            System.out.println("comp wins");

        } else if (c==3 && h==1) {
            System.out.println("human wins");}
        else if (c==2&&h==3) {
            System.out.println("human wins");

        }
        else if (c==3&&h==2) {
            System.out.println("computer wins wins");

        }
        else {
            System.out.println("invalid");
        }
    }
}
