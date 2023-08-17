package com.afs.tdd;

public class MarsRover {

    private  Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        Direction newDirection = null;
        if(givenCommand == Command.MOVE) {
            move();
        }
        if (givenCommand == Command.TURN_LEFT) {
            newDirection = turnLeft();
        }
    }

    private void move(){
            int x = location.getX();
            int y = location.getY();
            Direction direction = location.getDirection();

            switch (direction) {
                case NORTH:
                    y++;
                    break;
                case EAST:
                    x++;
                    break;
                case SOUTH:
                    y--;
                    break;
                case WEST:
                    x--;
                    break;
            }

            location = new Location(x, y, direction);
    }

    private Direction turnLeft() {
        Direction currentDirection = location.getDirection();
        Direction newDirection = null;


        return newDirection;
    }

    public Location getCurrentLocation() {
        return location;
    }
}
