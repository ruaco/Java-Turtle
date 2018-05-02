package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import turtle.Turtle;

public class Controller {

    private Scene rootScene;

    public Controller(Scene scene) {
        this.rootScene = scene;
    }

    public Group draw() {
        Group scene = new Group();
        Turtle pen = Turtle.getInstance(rootScene);

        for (int i = 0; i < 4; i++) {
            pen.forward(100);
            pen.left(90);
        }
        pen.circle(150);

        pen.right(90);
        pen.backward(-20);

        pen.left(90);
        pen.forward(100);
        pen.right(90);
        pen.penup();
        pen.forward(20);
        pen.pendown();
        pen.left(90);
        pen.backward(200);


        scene.getChildren().add(pen.draw());
        return scene;
    }

}
