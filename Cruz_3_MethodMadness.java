package cruz_3_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Cruz_3_MethodMAdness extends Application {

public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Drawing Operations Test");
Group root = new Group();
Canvas canvas = new Canvas(500, 500);
GraphicsContext gc = canvas.getGraphicsContext2D();
drawCircle1(gc);
drawCircle2(gc);
drawCircle3(gc);
drawCircle4(gc);
drawCircle5(gc);
drawStar(gc);
root.getChildren().add(canvas);
primaryStage.setScene(new Scene(root));
primaryStage.show();
}

private void drawCircle1(GraphicsContext gc) {

    gc.setFill(Color.GOLD);
    gc.fillRoundRect(210, 90, 75, 70, 150, 170);
    gc.setStroke(Color.GOLD);
private void drawStar(GraphicsContext gc)  {
    gc.setFill(Color.GOLD);
    gc.fillPolygon(new double[]{250,200,150,200,150,250,350,300,350,300},
            new double[]{150,200,200,250,300,275,300,250,200,200}, 10);
    gc.setStroke(Color.GOLD);
    }
 private void drawCircle2(GraphicsContext gc) {
gc.setFill(Color.GOLD);
    gc.fillRoundRect(100, 170, 75, 70, 150, 170);
    gc.setStroke(Color.GOLD);
    }
private void drawCircle3(GraphicsContext gc) {
 gc.setFill(Color.GOLD);
    gc.fillRoundRect(120, 275, 75, 70, 150, 170);
    gc.setStroke(Color.GOLD);
    }
private void drawCircle4(GraphicsContext gc) {
 gc.setFill(Color.GOLD);
    gc.fillRoundRect(300, 275, 75, 70, 150, 170);
    gc.setStroke(Color.GOLD);
    }
private void drawCircle5(GraphicsContext gc) {
 gc.setFill(Color.GOLD);
    gc.fillRoundRect(325, 170, 75, 70, 150, 170);
    gc.setStroke(Color.GOLD);
}
}
}
