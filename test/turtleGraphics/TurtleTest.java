package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle turtle;
    @BeforeEach
    void startAllTestsWithThis(){
        pen = new Pen();
        secondPen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void turtleHasAPenTest(){
        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(secondPen, turtle.getPen());
    }
    @Test
    void turtleCanMovePen(){
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightWhileFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingWest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingNorth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingNorth(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingWest(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingSouth(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveDownwardFacingSouth(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,4), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveBackwardFacingWest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(4,0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveUpwardFacingNorth() {
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingEast(){
        turtle.movePenDown();
        SketchPad sketchpad = new SketchPad(20,20);
        turtle.writeOn(sketchpad, 5);
        int numberOfSteps = 5;
        int counter = 0;
        var floor = sketchpad.getFloor()[0][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingSouth(){
        turtle.movePenDown();
        SketchPad sketchpad = new SketchPad(20,20);
        turtle.writeOn(sketchpad, 5);
        int numberOfSteps = 5;
        int counter = 0;
        var floor = sketchpad.getFloor()[0][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[counter][4];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        assertEquals(new Position(4,4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingWest(){
        turtle.movePenDown();
        SketchPad sketchpad = new SketchPad(20,20);
        turtle.writeOn(sketchpad, 5);
        int numberOfSteps = 5;
        int counter = 0;
        var floor = sketchpad.getFloor()[0][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[counter][4];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[4][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        assertEquals(new Position(4,0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingNorth(){
        turtle.movePenDown();
        SketchPad sketchpad = new SketchPad(20,20);
        turtle.writeOn(sketchpad, 5);
        int numberOfSteps = 5;
        int counter = 0;
        var floor = sketchpad.getFloor()[0][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[counter][4];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[4][counter];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchpad, 5);
        counter = 0;
        floor = sketchpad.getFloor()[counter][0];
        while (counter < numberOfSteps){
            assertEquals(1, floor);
            counter++;
        }
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }

}
