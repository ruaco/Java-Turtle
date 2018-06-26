package turtle;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

public interface Turtle {

    static Turtle getInstance(GraphicsContext gc) {
        return new TurtleImpl(gc);
    }

    void pendown();

    void penup();

    void forward(int distance);

    void backward(int distance);

    void left(double angle);

    void right(double angle);

    void jump(double x, double y);

    void circle(int r);

    double getX();

    double getY();
}
