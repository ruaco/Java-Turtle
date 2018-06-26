package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


/**
 * {@link "https://docs.oracle.com/javafx/2/canvas/jfxpub-canvas.htm"}
 * */
public class Window extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        int width = 800;
        int height = 600;
        Group root = new Group();
        stage.setTitle("Turtle");
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // 绘图部分
        Controller controller = new Controller();
        controller.draw(gc);

        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
        canvas.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
