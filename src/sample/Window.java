package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Window extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        int width = 800;
        int height = 600;
        Group root = new Group();
        stage.setTitle("Turtle");
        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);

        // 绘图部分
        Controller controller = new Controller(scene);
        Group turtles = controller.draw();

        root.getChildren().add(turtles);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
