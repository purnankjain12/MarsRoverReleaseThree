package com.marsRover.three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldMoveUpWhenNorth() {
        Rover rover = new Rover(0, 0, 0);

        assertEquals("0, 1, N", rover.move());
    }

    @Test
    public void shouldMoveDownWhenSouth() {
        Rover rover = new Rover(0, 1, 2);

        assertEquals("0, 0, N", rover.move());
    }

    @Test
    public void shouldMoveLeftWhenWest() {
        Rover rover = new Rover(1, 1, 1);

        assertEquals("0, 1, N", rover.move());
    }

    @Test
    public void shouldMoveRightWhenWest() {
        Rover rover = new Rover(1, 1, 3);

        assertEquals("2, 1, N", rover.move());
    }
}