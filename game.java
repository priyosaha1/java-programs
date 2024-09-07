import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a[] = {1, 2, 3};
        System.out.println("1=Rock,2=paper,3=scissor");
        System.out.println("enter ur choice : ");
        int h = sc.nextInt();
        int ran =random.nextInt(3);
        int s=a[ran];
        System.out.println("comp :"+s);
        System.out.println("human :"+h);
        if(s==h){
            System.out.println("tie");
        } 
        else if (s==1 && h==2) {
            System.out.println("human wins");
        }
        else if(s==2 && h==1){
            System.out.println("ccomputer wins");
        } else if (s==1 && h==3) {
            System.out.println("comp wins");
            
        } else if (s==3 && h==1) {
            System.out.println("human wins");}
        else if (s==2&&h==3) {
            System.out.println("human wins");

        }
        else if (s==3&&h==2) {
            System.out.println("computer wins wins");

        }
        else {
            System.out.println("invalid");
        }



    }
}
