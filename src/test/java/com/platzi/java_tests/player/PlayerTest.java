package com.platzi.java_tests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loseWhenDiceNumberIsTooLow() {
        // Dice dice = new Dice(6); with Mockito:
        Dice dice = Mockito.mock(Dice.class);
        // When the run dice.roll() return 2
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void winsWhenDiceeNumberIsTooBig() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }

}