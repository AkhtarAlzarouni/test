
import java.util.Scanner;

public class R_P_S_2playr {
    public static void main(String[] args) {
    int userChoice, computerChoice, rock, paper, scissors;

    Scanner input = new Scanner (System.in);



    rock = 0;
    paper = 1;
    scissors = 2;


        System.out.println("ROCK - PAPER - SCISSORRS GAME");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
    userChoice = input.nextInt();
        while (userChoice > 2) {
        System.out.println("give number between 0 and 2");
        userChoice = input.nextInt();
    }

        if (userChoice == rock)
    {
        System.out.println("player1 chose ROCK");
    }
        else
    {
        if(userChoice== paper)
        {
            System.out.println("player1 chose PAPER");
        }
        else
        {
            System.out.println("player1 chose SCISSORS");
        }
    }

        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        computerChoice = input.nextInt();


        if(computerChoice == rock)
    {
        System.out.println("player2 chose ROCK");
    }
        else
    {
        if(computerChoice == paper)
        {
            System.out.println("player2 chose PAPER");
        }
        else
        {
            System.out.println("player2 chose SCISSORS");
        }
    }



    //Draw
        while (userChoice == computerChoice) {
        System.out.println(" try again");


        userChoice = input.nextInt();
        while (userChoice > 2) {
            System.out.println("give number between 0 and 2");
            userChoice = input.nextInt();
        }

        if (userChoice == rock)
        {
            System.out.println("player1 chose ROCK");
        }
        else
        {
            if(userChoice== paper)
            {
                System.out.println("player1 chose PAPER");
            }
            else
            {
                System.out.println("player1 chose SCISSORS");
            }
        }

        if(computerChoice == rock)
        {
            System.out.println("player2 chose ROCK");
        }
        else
        {
            if(computerChoice == paper)
            {
                System.out.println("player2 chose PAPER");
            }
            else
            {
                System.out.println("player2 chose SCISSORS");
            }
        }
    }


        if (computerChoice==rock)
    {
        if (userChoice==paper)
        {
            System.out.println("player1 wins!");
        }
        else
        {
            System.out.println("player2 Wins");
        }
    }
        else if (computerChoice==paper)
    {
        if (userChoice==rock)
        {
            System.out.println("player2 wins");
        }
        else
        {
            System.out.println("player1 Wins!");
        }
    }
        else if (userChoice==rock)
    {
        System.out.println("player1 Wins");
    }
        else
    {
        System.out.println("player2 Wins");
    }
}

}

