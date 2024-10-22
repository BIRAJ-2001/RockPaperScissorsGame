import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        int a=1,w=0,c,i,uc=0,cc=0;
        for(i=1;i<6;i++)
        {
        while(a>0 && a<4)
        {
            System.out.println("Enter your choice:\n1.Rock\n2.Paper\n3.Scissors");
            a=sc.nextInt();
            if(a<1 || a>3)
            {
                a=1;    
                System.out.println("wrong option");
            }
            else
            break;
        }
        c=rand.nextInt(1,4);
        
        if(c==1 && a==2){
        w=1;System.out.println("user is winner");
        uc++;
        } 
        else if(c==2 && a==3){
            w=1;System.out.println("user is winner");
            uc++;
        } 
        else if(c==3 && a==1){
            w=1;System.out.println("user is winner");
            uc++;
        } 
        else if(c==1 && a==3){
            w=2;System.out.println("computer is winner");
            cc++;
        }
        else if(c==2 && a==1){
            w=2;System.out.println("computer is winner");
            cc++;
        } 
        else if(c==3 && a==2){
            w=2;System.out.println("computer is winner");
            cc++;
        } 
        else{
        w=0;System.out.println("draw");
        i--;
        }
        System.out.println("computer chose: "+c);
    }
    if(uc>cc)
    System.out.println("Final winner is user with "+uc+" rounds");
    else
    System.out.println("final winner is computer with "+cc+" rounds");
    }
}
