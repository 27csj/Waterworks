import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StageManager extends Application {

    public void start(Stage stg) {
        Stage stage = new Stage();
        stage.setTitle("Waterworks");

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 1000, 750, Color.WHITE);

        Canvas canvas = new Canvas(1000, 750);
        root.getChildren().add(canvas);

        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        SplashScreen s = new SplashScreen(stage);
        s.display();
        stage.showAndWait();

        Menu m = new Menu(stage);
        int c = 0;
        try {
            c = m.getChoice();
        } catch (Exception e) { e.printStackTrace(); }

        if (c == 1) {
            Game g = new Game(stage);
            g.display();
            stage.showAndWait();
        }
    }

}
