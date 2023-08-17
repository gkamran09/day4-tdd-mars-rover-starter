package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_negative1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(-1 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }

    @Test
    void should_move_to_location_negative1_0_West_when_executeCommand_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_move_to_location_1_0_East_when_executeCommand_given_0_0_East_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_direction_to_West_when_executeCommand_given_initial_direction_North_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_direction_to_East_when_executeCommand_given_initial_direction_South_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_stay_in_same_direction_when_executeCommand_given_initial_direction_West_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_stay_in_same_direction_when_executeCommand_given_initial_direction_East_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_direction_to_East_when_executeCommand_given_initial_direction_North_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_direction_to_South_when_executeCommand_given_initial_direction_East_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_direction_to_West_when_executeCommand_given_initial_direction_South_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        // Then
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }
}
