package com.safarandras.RockPaperScissors.models;

import com.safarandras.RockPaperScissors.util.RandomUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {


    private final RandomUtil randomMock = mock(RandomUtil.class);
    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;

    @Test
    void gameConstructor_badString_throwIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> new Game("foobar", randomMock));
    }

    @Test
    void gameConstructor_stringAllCaps_returnCorrectHand(){
        Hand expected = Hand.ROCK;

        Game game = new Game("ROCK", randomMock);

        assertEquals(expected, game.getPlayerHand());
    }
    @Test
    void gameConstructor_stringSomeCaps_returnCorrectHand(){
        Hand expected = Hand.PAPER;

        Game game = new Game("pApER", randomMock);

        assertEquals(expected, game.getPlayerHand());
    }
    @Test
    void gameConstructor_stringNoCaps_returnCorrectHand(){
        Hand expected = Hand.SCISSORS;

        Game game = new Game("scissors", randomMock);

        assertEquals(expected, game.getPlayerHand());
    }

    @Test
    void hasPlayerWon_paperBeatsRock_returnTrue(){
        when(randomMock.nextInt(anyInt())).thenReturn(ROCK);

        Game game = new Game(Hand.PAPER.getLabel(), randomMock);

        assertTrue(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_paperBeatsRock_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(PAPER);

        Game game = new Game(Hand.ROCK.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_scissorsBeatPaper_returnTrue(){
        when(randomMock.nextInt(anyInt())).thenReturn(PAPER);

        Game game = new Game(Hand.SCISSORS.getLabel(), randomMock);

        assertTrue(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_scissorsBeatPaper_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(SCISSORS);

        Game game = new Game(Hand.PAPER.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_rockBeatsScissors_returnTrue(){
        when(randomMock.nextInt(anyInt())).thenReturn(SCISSORS);

        Game game = new Game(Hand.ROCK.getLabel(), randomMock);

        assertTrue(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_rockBeatsScissors_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(ROCK);

        Game game = new Game(Hand.SCISSORS.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_paperTiesPaper_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(PAPER);

        Game game = new Game(Hand.PAPER.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_scissorsTiesScissors_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(SCISSORS);

        Game game = new Game(Hand.SCISSORS.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }
    @Test
    void hasPlayerWon_rockTiesRock_returnFalse(){
        when(randomMock.nextInt(anyInt())).thenReturn(ROCK);

        Game game = new Game(Hand.ROCK.getLabel(), randomMock);

        assertFalse(game.hasPlayerWon());
    }

}
