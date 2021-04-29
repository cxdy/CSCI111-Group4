 import java.util.Random;

    public class GameFunctions {

        private String computerChoice;


        public GameFunctions()
        {
            computerChoice = "";
        }

        public void choose()
        {
            int pick=1;
for(pick=1; pick<=3; pick++) {
    if (pick == 1)
        computerChoice = "rock";
    else if (pick == 2)
        computerChoice = "paper";
    else if (pick == 3)
        computerChoice = "scissors";
}
            System.out.println("The computer choose " + computerChoice + ".");
        }

        public String whoWon(String userChoice)
        {
            String result = "";
            switch(computerChoice)
            {
                case "rock":
                {
                    if(userChoice.equalsIgnoreCase("rock"))
                        result = "tie";
                    else if(userChoice.equalsIgnoreCase("paper"))
                        result = "user";
                    else

                        result = "computer";
                    break;
                }
                case "paper":
                {
                    if(userChoice.equalsIgnoreCase("rock"))
                        result = "computer";
                    else if(userChoice.equalsIgnoreCase("paper"))
                        result = "tie";
                    else

                        result = "user";
                    break;
                }
                case "scissors":
                {
                    if(userChoice.equalsIgnoreCase("rock"))
                        result = "user";
                    else if(userChoice.equalsIgnoreCase("paper"))
                        result = "computer";
                    else

                        result = "tie";
                    break;
                }
            }
            return result;
        }
    }

