package patterns.Singleton;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    Scanner s = new Scanner(System.in);
    public int Score = 0;
    private int YourNumber;
    private int generateNumber;
    private int i=0;
    private static Game Instance = new Game();

    private Game() {

    }
    public static Game getInstance()
    {
        return Instance;
    }
    protected Object readResolve(){
        return getInstance();
    }
    public void gameStart()
    {
        while(i<=9)
        {
            generateNumber = ThreadLocalRandom.current().nextInt(0,10);
            System.out.println("Select your number from range 0-9");
            YourNumber = s.nextInt();
            if(YourNumber == generateNumber)
            {
                System.out.println("Yess");
                Score++;
            }else{
                System.out.println("You missed. Try again. My number is "+generateNumber);
            }
            i++;
        }
        System.out.println("Your score " + Score);
    }

}
