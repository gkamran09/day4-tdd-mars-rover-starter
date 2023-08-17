package com.afs.tdd;

public class MarsRover {

    private  Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            move();
        }
        if (givenCommand == Command.TURN_LEFT) {
             turnLeft();
        }
        if (givenCommand == Command.TURN_RIGHT) {
            turnRight();
        }
    }



    private void move(){
            int x = location.getX();
            int y = location.getY();
            Direction direction = location.getDirection();

            switch (direction) {
                case NORTH: y++;
                break;
                case EAST: x++;
                break;
                case SOUTH: y--;
                break;
                case WEST: x--;
                break;
            }

            location = new Location(x, y, direction);
    }

    private void turnLeft() {
        Direction currentDirection = location.getDirection();
        Direction newDirection = null;

        if (currentDirection == Direction.NORTH) {
            newDirection = Direction.WEST;
        }
        if (currentDirection == Direction.SOUTH) {
            newDirection = Direction.EAST;
        }
        if (currentDirection == Direction.WEST) {
            newDirection = Direction.SOUTH;
        }
        if (currentDirection == Direction.EAST) {
            newDirection = Direction.NORTH;
        }

        location = new Location(location.getX(), location.getY(), newDirection);
    }
    private void turnRight() {
        Direction currentDirection = location.getDirection();
        Direction newDirection = null;

        if (currentDirection == Direction.NORTH) {
            newDirection = Direction.EAST;
        }
        if (currentDirection == Direction.EAST) {
            newDirection = Direction.SOUTH;
        }

        location = new Location(location.getX(), location.getY(), newDirection);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
