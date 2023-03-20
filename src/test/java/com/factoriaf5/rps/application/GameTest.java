package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;


public class GameTest {

    @Test
    public void test_game_rock_beats_scissors() {
        /*
         * el jugador 1 elige rock
         * el jugador 2 elige tijeras
         * rock gana tijeras (resultado)
         */
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);

        Figure rock = game.getPlayer1().choose("Rock");
        Figure scissors = game.getPlayer2().choose("Scissors");
        String result = game.checkWinner();

        assertTrue(rock instanceof Rock);
        assertTrue(scissors instanceof Scissors);
        assertEquals("Rock", rock.getType());
        assertEquals("Scissors", scissors.getType());
        assertEquals("Rock beats Scissors", result);
    }

    @Test
    public void test_game_scissors_beats_paper() {
        
        //El juegador 1 elige scissors.
        //El juegador 2 elige paper.
        // tijeras gana papel (resultado)

        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);

        Figure scissors = game.getPlayer1().choose("Scissors");
        Figure paper = game.getPlayer1().choose("Paper");
        String result = game.checkWinner();

        assertTrue(scissors instanceof Scissors);
        assertTrue(paper instanceof Paper);
        assertEquals("Scissors" , scissors.getType());
        assertEquals("Paper", paper.getType());
        assertEquals("Scissors beats Paper", result);

    }

    @Test
    public void test_game_paper_beats_rock() {

        //El juegador 1 elige paper.
        //El juegador 2 elige rock.
        // papel gana rock (resultado)

        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);

        Figure paper = game.getPlayer1().choose("Paper");
        Figure rock = game.getPlayer2().choose("Rock");
        String result = game.checkWinner();

        assertTrue(paper instanceof Paper);
        assertTrue(rock instanceof Rock);
        assertEquals("Paper", paper.getType());
        assertEquals("Scissors", scissors.getType);
        assertEquals("Paper beats Scissors", result);



        
    }






    
}
