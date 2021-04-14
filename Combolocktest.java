import java.util.Scanner;
public class Combolocktest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dial combination: ");

        int dial1 = sc.nextInt();
        int dial2 = sc.nextInt();
        int dial3 = sc.nextInt();


        Combolock lock = new Combolock(dial1, dial2, dial3);
        int c=0;
        boolean opened = false;
        boolean turnRight = true;
        while(!opened){
            if(turnRight)
                System.out.print("Right: ");
            else
                System.out.print("Left: ");
            int ticks=sc.nextInt();
            if(turnRight){
                lock.turnClockwise(ticks);
            }
            else{
                lock.turnCounterClockwise(ticks);
            }
            turnRight =! turnRight;
            opened = lock.open();
            if(c>=3)
            {
                System.out.print("The lock is blocked.");
                return;
            }
            c++;
        }
        System.out.println("The lock is opened");
    }
}