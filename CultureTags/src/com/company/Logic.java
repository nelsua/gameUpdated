package com.company;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Logic {
    long millis=System.currentTimeMillis();
    Date date=new java.sql.Date(millis);
    private String win = "loser";
    private String lose = "winner";

    MySql connect  = new MySql();
    DealCards cardMeaning = new DealCards();
    Guess guess = new Guess();

    //complete meaning of the cards is storaged here
    private String wth = cardMeaning.wth(); String lalaland = cardMeaning.lalaland(); String mma = cardMeaning.mma();
            String ww2 = cardMeaning.ww2();String rt = cardMeaning.rt(); String ftp = cardMeaning.ftp();
            String nasa = cardMeaning.nasa(); String asap =cardMeaning.asap(); String dob = cardMeaning.dob();
            String idk = cardMeaning.idk(); String bff = cardMeaning.bff(); String mia = cardMeaning.mia();

            //methods use in main
            public String guesserToMySql(int b, int c){
                String guesser = (b>c) ? "A" : "B";
                return guesser;
            }
            public void textPlayersA(){
                System.out.println("enter amount of players for team A");
            }
            public void textPlayersB(){
                System.out.println("enter amount of players for team B");
            }
            public void enterPlayerName(){System.out.println("enter players name"+"\n---------------------------------------------------------");}
            public int amountOfPlayersA (int players){
                return players;
            }
            public int amountOfPlayersB(int players){
                return players;
            }
            public void compareAmountOfmembers(int x, int y){
                if (x != y){
                    System.out.println("teams are not even");
                    System.out.println("try again");
                    System.exit(0);
                }
                System.out.println("Team A have\t"+x+"\tmembers");
                System.out.println("Team B have\t"+y+"\tmembers");
            }
            public void biggerNumberStart(int x, int y){
                System.out.println("generating random numbers biggest start\nTeam A: "+x+"\tTeam B: "+y);
                if(x==y){
                    System.out.println("TRY AGAIN, SAME NUMBERS");
                    System.exit(1);
                }
                String winnerNumber = (x>y) ? "Team A has the highest number\t"+x : "Team B has the highest number\t"+y;
                System.out.println(winnerNumber);
            }
            public void addPlayerA(String player, TeamA tA, int amountOfpPlayers){
                Scanner sc =new Scanner(System.in);
                int count=0;
                do{
                    System.out.println("insert players");
                    player = sc.nextLine();
                    tA.addPlayer(player.toUpperCase(Locale.ROOT));
                    count++;
                }while(count < amountOfpPlayers);

            }
            public void addPlayerB(String player, TeamB tB, int amountOfpPlayers){
                Scanner sc =new Scanner(System.in);
                int count=0;
                do{
                    System.out.println("insert players");
                    player = sc.nextLine();
                    tB.addPlayer(player.toUpperCase(Locale.ROOT));
                    count++;
                }while(count < amountOfpPlayers);

            }
            public void assignCardsToLettersA(int b, int c, String playerA, TeamA tA, int amountOfPlayersA) throws  SQLException {
                int counter = 0;
                String hint ="";
                if(b>c){
                    playerA = tA.AssingCardsPlayer1(0);
                    String assignedCard = tA.assignedCard();
                        if (assignedCard =="# WW2"){
                            assignedCard= ww2;
                            hint = "war";
                        }
                        if (assignedCard =="# MMA"){
                            assignedCard= mma;
                            hint = "fight";
                        }
                        if (assignedCard == "# LALALAND"){
                            assignedCard= lalaland;
                            hint = "movie";
                        }
                        if (assignedCard == "# RT"){
                            assignedCard= rt;
                            hint = "broadcasting";
                        }
                        if (assignedCard == "# WTH"){
                            assignedCard=wth;
                            hint = "slang";
                        }
                        if (assignedCard == "# FTP"){
                            assignedCard= ftp;
                            hint = "networking";
                        }
                        if (assignedCard == "# NASA"){
                            assignedCard= nasa;
                            hint = "rocket";
                        }
                        if (assignedCard == "# ASAP"){
                            assignedCard= asap;
                            hint = "fast";
                        }
                        if (assignedCard == "# IDK") {
                                assignedCard = idk;
                                hint =" lack of knowledge";
                            }
                        if (assignedCard == "# DOB"){
                            assignedCard= dob;
                            hint = "celebration";
                        }
                        if (assignedCard == "# BFF"){
                            assignedCard= bff;
                            hint = "friendship";
                        }
                        if (assignedCard == "# MIA"){
                            assignedCard= mia;
                            hint = "not coming back";
                        }
                                        System.out.println("Guesser is\t"+playerA);
                                        System.out.println("assigned card is\t"+tA.assignedCard());
                                        System.out.println("hint: "+hint);
                                        System.out.println("________________________________________________");
                                        algoA(counter, amountOfPlayersA, tA, assignedCard,b,c);
                }
            }
            public void assignCardsToLettersB(int b, int c, String playerB, TeamB tB, int amountOfPlayersB) throws  SQLException {
                    int counter = 0;
                    String hint = "";
                    if(b<c){
                        playerB = tB.AssingCardsPlayer1(0);
                        String assignedCard = tB.assignedCard();
                        if (assignedCard =="# WW2"){
                            assignedCard= ww2;
                            hint = "war";
                        }
                        if (assignedCard =="# MMA"){
                            assignedCard= mma;
                            hint = "fight";
                        }
                        if (assignedCard == "# LALALAND"){
                            assignedCard= lalaland;
                            hint = "movie";
                        }
                        if (assignedCard == "# RT"){
                            assignedCard= rt;
                            hint = "broadcasting";
                        }
                        if (assignedCard == "# WTH"){
                            assignedCard=wth;
                            hint = "slang";
                        }
                        if (assignedCard == "# FTP"){
                            assignedCard= ftp;
                            hint = "networking";
                        }
                        if (assignedCard == "# NASA"){
                            assignedCard= nasa;
                            hint = "rocket";
                        }
                        if (assignedCard == "# ASAP"){
                            assignedCard= asap;
                            hint = "fast";
                        }
                        if (assignedCard == "# IDK") {
                            assignedCard = idk;
                            hint =" lack of knowledge";
                        }
                        if (assignedCard == "# DOB"){
                            assignedCard= dob;
                            hint = "celebration";
                        }
                        if (assignedCard == "# BFF"){
                            assignedCard= bff;
                            hint = "friendship";
                        }
                        if (assignedCard == "# MIA"){
                            assignedCard= mia;
                            hint = "not coming back";
                        }
                                        System.out.println("Guesser is\t"+playerB);
                                        System.out.println("assigned card is\t"+tB.assignedCard());
                                        System.out.println("hint: "+hint);
                                        System.out.println("________________________________________________");
                                        algoB(counter, amountOfPlayersB, tB, assignedCard, b, c);
                    }
            }
            public void algoA(int counter, int amountOfPlayersA,TeamA tA, String assignedCard,int b , int c) throws SQLException {
                    if (counter < amountOfPlayersA) {
                        String playerName = tA.playerTurn(counter);
                        System.out.println(playerName + "\tis guessing");
                        System.out.println("enter your word");
                        String myWord = "";
                        String word = guess.myScanner();
                        myWord = guess.myGuess(word);
                        if (myWord != assignedCard) {
                                    System.out.println("_____________________________________"); }
                                if (myWord.equals(assignedCard)) {
                                    win = "winner";
                                    lose = "loser";
                                    System.out.println("YOU WON");
                                    connect.db( win, lose, assignedCard, guesserToMySql(b,c), (java.sql.Date) date);System.exit(1);
                                }
                                counter++;
                                    algoA( counter,  amountOfPlayersA, tA,  assignedCard, b,c);
        }
}
            public void algoB(int counter, int amountOfPlayersB,TeamB tB, String assignedCard, int b, int c) throws  SQLException {
                    if (counter < amountOfPlayersB) {
                        String playerName = tB.playerTurn(counter);
                        System.out.println(playerName + "\tis guessing");
                        System.out.println("enter your word");
                        String myWord = "";
                        String word = guess.myScanner();
                        myWord = guess.myGuess(word);
                                if (myWord != assignedCard) {
                                    System.out.println("___________________________________"); }
                                        if (myWord.equals(assignedCard)) {
                                            win = "winner";
                                            lose = "loser";
                                            System.out.println("you won team B");
                 connect.db(lose, win, assignedCard, guesserToMySql(b,c), (java.sql.Date) date);System.exit(1);
                                }
                                counter++;
                                     algoB(counter, amountOfPlayersB, tB, assignedCard, b, c);
               }
        }
}


