package com.afs.tdd;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        Direction newDirection = null;
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){
                location.setY(location.getY() + 1);
            }
            if (location.getDirection() == Direction.SOUTH) {
                location.setY(location.getY() - 1);
            }
            if (location.getDirection() == Direction.WEST) {
                location.setX(location.getX() - 1);
            }
            if (location.getDirection() == Direction.EAST) {
                location.setX(location.getX() + 1);
            }
        }
        if (givenCommand == Command.TURN_LEFT) {
            newDirection = turnLeft();
        }
    }

    private Direction turnLeft() {
        Direction currentDirection = location.getDirection();
        Direction newDirection = null;

        if (currentDirection == Direction.NORTH) {
            newDirection = Direction.WEST;
        } else if (currentDirection == Direction.EAST) {
            newDirection = Direction.NORTH;
        } else if (currentDirection == Direction.SOUTH) {
            newDirection = Direction.EAST;
        } else if (currentDirection == Direction.WEST) {
            newDirection = Direction.SOUTH;
        }

        return newDirection;
    }

    public Location getCurrentLocation() {
        return location;
    }
}
