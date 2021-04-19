package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen turtlePen) {
        pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
    private void changeCurrentDirectionTo(Direction newDirection){
        currentDirection = newDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case NORTH -> changeCurrentDirectionTo(EAST);
        }
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> changeCurrentDirectionTo(NORTH);
            case NORTH -> changeCurrentDirectionTo(WEST);
            case WEST -> changeCurrentDirectionTo(SOUTH);
            case SOUTH -> changeCurrentDirectionTo(EAST);
        }
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps - 1;
        switch (currentDirection) {
            case EAST ->  currentPosition.increaseColumnPositionBy(numberOfSteps);
            case SOUTH -> currentPosition.increaseRowPositionBy(numberOfSteps);
            case WEST -> currentPosition.decreaseColumnPositionBy(numberOfSteps);
            case NORTH -> currentPosition.decreaseRowPositionBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void writeOn(SketchPad sketchpad, int numberOfSteps) {
        if(!isPenUp()){
            int counter = 0;
            int rowPosition = currentPosition.getRowPosition();
            int columnPosition = currentPosition.getColumnPosition();
            switch (currentDirection){
                case EAST -> {
                    while (counter<numberOfSteps){
                        sketchpad.getFloor()[rowPosition][columnPosition+counter] = 1;
                        counter++;
                    }
                }
                case SOUTH -> {
                    while (counter<numberOfSteps){
                        sketchpad.getFloor()[rowPosition+counter][columnPosition] = 1;
                        counter++;
                    }
                }
                case WEST -> {
                    while (counter<numberOfSteps){
                        sketchpad.getFloor()[rowPosition][columnPosition-counter] = 1;
                        counter++;
                    }
                }
                case NORTH -> {
                    while (counter<numberOfSteps){
                        sketchpad.getFloor()[rowPosition-counter][columnPosition] = 1;
                        counter++;
                    }
                }
            }
        }
        moveForwardBy(numberOfSteps);
    }
}
