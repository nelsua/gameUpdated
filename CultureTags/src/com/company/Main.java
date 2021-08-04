package com.company;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  SQLException {

        long millis=System.currentTimeMillis();
        Date date=new java.sql.Date(millis);
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic();
        MySql connect  = new MySql();
        int round = 1;
        int position = 0;
        String key ="";

        //Instructions. Reading from text file
        Instruction instruction = new Instruction();
        System.out.println("Press any key for starting the program");
        key = sc.nextLine();
        if(key!=null)
        instruction.readInstructions();

        //Adding players Team  A and B
        logic.textPlayersA();
        int amountOfPlayersA = sc.nextInt();
        int amountA = logic.amountOfPlayersA(amountOfPlayersA);
        TeamA tA = new TeamA(amountA);
        logic.enterPlayerName();
        String playersNameA = sc.nextLine();
        logic.addPlayerA(playersNameA, tA, amountOfPlayersA);

        //////////////////////////////////
        logic.textPlayersB();
        int amountOfPlayersB = sc.nextInt();
        int amountB = logic.amountOfPlayersB(amountOfPlayersB);
        TeamB tB = new TeamB(amountB);
        logic.enterPlayerName();
        String playersNameB = sc.nextLine();
        logic.addPlayerB(playersNameB, tB, amountOfPlayersB);

        //getting both team players printed
        tA.getPlayers();
        tB.getPlayers();
        System.out.println("________________________________________________");

        // checking that teams  are even regardless the amount of space in memory
        //if not even the progam ends
        int totalPlayersA = tA.amountOfPlayers();
        int totalPlayersB = tB.amountOfPlayers();
        logic.compareAmountOfmembers(totalPlayersA, totalPlayersB);

        //who start guessing, the team with biggest number start choosing
        System.out.println("________________________________________________");
        int b = tA.startGuessing();
        int c = tB.startGuessing();
        logic.biggerNumberStart(b, c);

        //fid out who is guessing
        String guesser=logic.guesserToMySql(b,c);

        // card with the letters and hint is assingned
        // the other team start guessing each =one have one op
        //System.out.println("________________________________________________");
                String playerA = tA.AssingCardsPlayer1(position);
                logic.assignCardsToLettersA(b, c, playerA, tA, amountOfPlayersA);
        System.out.println("\nROUND:\t"+round++);
        System.out.println("-------------------------------------------------");
                logic.assignCardsToLettersA(b, c, playerA, tA, amountOfPlayersA);
                       position++;
                       if(b>c){
                           connect.db("lose", "win","NOT FOUND", guesser, (java.sql.Date) date);
                           System.exit(1);
                       }

                 String playerB = tB.AssingCardsPlayer1(position);
                 logic.assignCardsToLettersB(b, c, playerB, tB, amountOfPlayersB);
        System.out.println("\nROUND:\t"+round++);
        System.out.println("-------------------------------------------------");
                 logic.assignCardsToLettersB(b, c, playerB, tB, amountOfPlayersB);
                         position++;
                        if(position == 2){
                            connect.db("winner", "loser","NOT FOUND", guesser, (java.sql.Date) date);
                            System.exit(1);
                }
        }
}





