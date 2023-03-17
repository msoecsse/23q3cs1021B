package week2;

public class TwoDimensionArrayDriver {

    public static void main(String[] args) {

        String[][] ticTacToe = new String[3][3];

        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                ticTacToe[i][j] = "0";
            }
        }

        System.out.println(ticTacToe[0][0] + "|" + ticTacToe[0][1] + "|" + ticTacToe[0][2]);


    }


}
