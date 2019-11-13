package sample;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Player {

    static Parent player1(){
        Pane root = new Pane();

        Rectangle P1 = new Rectangle(40,40);
        P1.setFill(Color.rgb(200, 200, 10, 1));
        P1.setStroke(Color.rgb(200 ,200, 150, 1));
        P1.setStrokeWidth(5);
        Text text = new Text();
        text.setText("P1");
        text.setFont(new Font("Cambria", 14));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(12);
        text.setTranslateY(25);
        root.getChildren().addAll(P1,text);
        return root;
        }
    static Parent player2(){
        Pane root = new Pane();

        Rectangle P2 = new Rectangle(40,40);
        P2.setFill(Color.rgb(10, 20, 200, 1));
        P2.setStroke(Color.rgb(150 ,20, 150, 1));
        P2.setStrokeWidth(5);
        Text text = new Text();
        text.setText("P2");
        text.setFont(new Font("Cambria", 14));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(12);
        text.setTranslateY(25);
        root.getChildren().addAll(P2,text);
        return root;
    }
}