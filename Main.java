import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static String[][] layout = {{" "," "," "},
                                {" "," "," "},
                                {" "," "," "}};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int turns = 1;

       while(turns < 6){
           System.out.println("Your turn: ");
        while(true){

            int input = s.nextInt();
            user(input);
            int row = (int) user(input).get(0), column = (int) user(input).get(1);
            if (layout[row][column] != " ") {
                System.out.println("this has been taken Please pick another location: ");

            }else {
                layout[row][column] = "x";
                break;
            }
        }

           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.print(layout[i][j] + "|");
               }
               System.out.println();
           }

           if (checkWin()){
               break;
           } else if (turns == 5) {
               System.out.println("It's a tie -_-");
               break;
           }

           System.out.println("Computer turn: ");
        while (true) {
                int in = rand.nextInt(9) + 1;
            int row1 = (int) com(in).get(0), column1 = (int) com(in).get(1);
            if (layout[row1][column1] == " ") {
                System.out.println("Computer chose " + in);
                layout[row1][column1] = "o";
                break;
            }
        }

           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.print(layout[i][j] + "|");
               }
               System.out.println();
           }

           if (checkWin()){
               break;
           }
           turns++;
       }


    }



    public static ArrayList user(int input){
       // Scanner s = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int row = 0, column = 0;
       // int input = s.nextInt();
        switch (input){
            case 1:
                list.add(0);
                list.add(0);
                break;
            case 2:
                list.add(0);
                list.add(1);
                break;
            case 3:
                list.add(0);
                list.add(2);
                break;
            case 4:
                list.add(1);
                list.add(0);
                break;
            case 5:
                list.add(1);
                list.add(1);
                break;
            case 6:
                list.add(1);
                list.add(2);
                break;
            case 7:
                list.add(2);
                list.add(0);
                break;
            case 8:
                list.add(2);
                list.add(1);
                break;
            case 9:
                list.add(2);
                list.add(2);
                break;
            default:
                System.out.println("please Enter from 1-9:");


        }
        return list;
    }

    public static ArrayList com(int input){
//        Scanner s = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int row = 0, column = 0;
        switch (input){
            case 1:
                list.add(0);
                list.add(0);
                break;
            case 2:
                list.add(0);
                list.add(1);
                break;
            case 3:
                list.add(0);
                list.add(2);
                break;
            case 4:
                list.add(1);
                list.add(0);
                break;
            case 5:
                list.add(1);
                list.add(1);
                break;
            case 6:
                list.add(1);
                list.add(2);
                break;
            case 7:
                list.add(2);
                list.add(0);
                break;
            case 8:
                list.add(2);
                list.add(1);
                break;
            case 9:
                list.add(2);
                list.add(2);
                break;
            default:
                System.out.println("please Enter from 1-9:");


        }
        return list;

    }
    public static boolean checkWin(){
        // check row
        for (int i = 0; i < 3; i++){
            if ((layout[i][0] == "x" && layout[i][1] == "x") && layout[i][2] == "x"){
                System.out.println("YOU WIN!!!");
                return true;
            }
            if ((layout[i][0] == "o" && layout[i][1] == "o") && layout[i][2] == "o"){
                System.out.println("Computer WON :(");
                return true;
            }
        }

        // check column
        for (int j = 0; j < 3; j++){
            if ((layout[0][j] == "x" && layout[1][j] == "x") && layout[2][j] == "x"){
                System.out.println("YOU WIN!!!");
                return true;
            }
            if ((layout[0][j] == "o" && layout[1][j] == "o") && layout[2][j] == "o"){
                System.out.println("Computer WON :(");
                return true;
            }
        }

        // check diagonal
        if ((layout[0][0] == "x" && layout[1][1] == "x") && layout[2][2] == "x"){
            System.out.println("YOU WIN!!!");
            return true;
        }
        if ((layout[0][0] == "o" && layout[1][1] == "o") && layout[2][2] == "o"){
            System.out.println("Computer WON :(");
            return true;
        }
        if ((layout[0][2] == "x" && layout[1][1] == "x") && layout[2][0] == "x"){
            System.out.println("Computer WIN!!!");
            return true;
        }
        if ((layout[0][2] == "o" && layout[1][1] == "o") && layout[2][0] == "o"){
            System.out.println("Computer WON :(");
            return true;
        }

        return false;
    }



}
