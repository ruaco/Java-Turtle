package turtle;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeType;

import static sample.Utils.*;

public class TurtleImpl implements Turtle {

    private double positionX;
    private double positionY;
    private int angle;
    private boolean down;
    private Group group;

    TurtleImpl(Scene scene) {
        this.positionX = scene.getWidth() / 2;
        this.positionY = scene.getHeight() / 2;
        this.angle = 0;
        this.group = new Group();
        this.down = true;
    }

    @Override
    public void pendown() {
        this.down = true;
    }

    @Override
    public void penup() {
        this.down = false;
    }

    @Override
    public void forward(int distance) {
        double tempX = this.positionX;
        double tempY = this.positionY;
        double projectionX = distance * Math.cos(angle2radian(angle));
        double projectionY = distance * Math.sin(angle2radian(angle));
        this.positionX += projectionX;
        this.positionY += projectionY;
        if(down) {
            line(tempX, tempY, this.positionX, this.positionY);
        }
    }

    @Override
    public void backward(int distance) {
        this.forward(-distance);
    }

    @Override
    public void left(double angle) {
        this.angle -= angle;
    }

    @Override
    public void right(double angle) {
        this.angle += angle;
    }

    @Override
    public void jump(double x, double y) {
        double tempX = this.positionX;
        double tempY = this.positionY;

        this.positionX = x;
        this.positionY = y;
        if(down) {
            line(tempX, tempY, this.positionX, this.positionY);
        }
    }

    @Override
    public void circle(int r) {
        // log(this.positionX, this.positionY);

        Circle circle = new Circle(r, Color.web("white", 0));
        circle.setStrokeType(StrokeType.OUTSIDE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(1);
        circle.setCenterX(this.positionX);
        circle.setCenterY(this.positionY);
        //
        this.group.getChildren().add(circle);
    }

    @Override
    public double getX() {
        return this.positionX;
    }

    @Override
    public double getY() {
        return this.positionY;
    }

    @Override
    public Group draw() {
        return this.group;
    }

    private void line(double startX, double startY, double endX, double endY) {
        Line line = new Line(startX, startY, endX, endY);
        //
        this.group.getChildren().add(line);
    }
}
