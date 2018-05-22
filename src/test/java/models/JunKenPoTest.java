package models;

import org.junit.Test;

import java.awt.print.Paper;

import static org.junit.Assert.*;

public class JunKenPoTest {

    @Test
    public void playJunKenPo_Player1RockPlayer2Paper_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 2 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Rock", "Paper"));
    }

    @Test
    public void playJunKenPo_Player1ScissorsPlayer2Rock_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 2 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Scissors", "Rock"));
    }

    @Test
    public void playJunKenPo_Player1PaperPlayer2Scissors_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 2 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Paper", "Scissors"));
    }

    @Test
    public void playJunKenPo_Player1PaperPlayer2Rock_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 1 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Paper", "Rock"));
    }

    @Test
    public void playJunKenPo_Player1ScissorsPlayer2Paper_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 1 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Scissors", "Paper"));
    }

    @Test
    public void playJunKenPo_Player1RockPlayer2Scissors_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Player 1 Wins!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Rock", "Scissors"));
    }

    @Test
    public void playJunKenPo_SameChoices_String() {
        JunKenPo testJunKenPo = new JunKenPo();
        String expected = "Draw!";
        assertEquals(expected, testJunKenPo.playJunKenPo("Rock", "Rock"));
    }
}