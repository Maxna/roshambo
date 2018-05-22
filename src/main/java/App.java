import models.JunKenPo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){


        System.out.println("Play Jun Ken Po. Player one, make your choice: Rock, Paper, or Scissors.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String player1Input = bufferedReader.readLine();
            System.out.println("Player 2, make your choice.");
            String player2Input = bufferedReader.readLine();
            JunKenPo game = new JunKenPo();
            System.out.println(game.playJunKenPo(player1Input, player2Input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
