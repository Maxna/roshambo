package models;

public class JunKenPo {
    private String player1choice;
    private String player2choice;

    public JunKenPo(){

    }

    public String playJunKenPo(String player1choice, String player2choice){
        String result;
        if (player1choice.equals("Rock") && player2choice.equals("Paper") || player1choice.equals("Paper") && player2choice.equals("Scissors") || player1choice.equals("Scissors") && player2choice.equals("Rock")) {
            result = "Player 2 Wins!";
        } else if (player1choice.equals("Rock") && player2choice.equals("Scissors") || player1choice.equals("Paper") && player2choice.equals("Rock") || player1choice.equals("Scissors") && player2choice.equals("Paper")){
            result = "Player 1 Wins!";
        } else {
            result = "Draw!";
        }
        return result;
    }

}
