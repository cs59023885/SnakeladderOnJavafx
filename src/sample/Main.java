package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    private static final int W = 1000;
    private static final int H = 800;


    private static List<Integer> startSnakeX;
    private static List<Integer> startSnakeY;
    private static List<Integer> endSnakeX;
    private static List<Integer> endSnakeY;
    private static List<Integer> checkGridS;
    private static List<Integer> checkGridE;

    int localX1 = 0;
    int localY1 = 0;
    int localX2 = 0;
    int localY2 = 0;


    static Parent Boom(){
        Pane root = new Pane();

        Circle boom = new Circle(); //ตา2
        boom.setRadius(20);
        boom.setFill(Color.BLACK);
        boom.setTranslateY(20);
        boom.setTranslateX(20);

        Line lineF = new Line(0,0,0,10);
        lineF.setStroke(Color.BLACK);
        lineF.setStrokeWidth(3);
        lineF.setTranslateY(-10);
        lineF.setTranslateX(30);
        lineF.setRotate(20);


        Rectangle Fire = new Rectangle(10,10);
        Fire.setFill(Color.rgb(250, 20, 20, 1));
        Fire.setStroke(Color.rgb(150 ,150, 20, 1));
        Fire.setStrokeWidth(5);
        Fire.setTranslateY(-15);
        Fire.setTranslateX(26);
        Fire.setRotate(20);

        Text text = new Text();
        text.setText("BOOM");
        text.setFont(new Font("Cambria", 9));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(6);
        text.setTranslateY(22);
        root.getChildren().addAll(boom,lineF,Fire,text);
        return root;
    } //set Boom
    static Parent Boom1(){
        Pane root = new Pane();

        Circle boom = new Circle(); //ตา2
        boom.setRadius(20);
        boom.setFill(Color.BLACK);
        boom.setTranslateY(20);
        boom.setTranslateX(20);

        Line lineF = new Line(0,0,0,10);
        lineF.setStroke(Color.BLACK);
        lineF.setStrokeWidth(3);
        lineF.setTranslateY(-10);
        lineF.setTranslateX(30);
        lineF.setRotate(20);


        Rectangle Fire = new Rectangle(10,10);
        Fire.setFill(Color.rgb(250, 20, 20, 1));
        Fire.setStroke(Color.rgb(150 ,150, 20, 1));
        Fire.setStrokeWidth(5);
        Fire.setTranslateY(-15);
        Fire.setTranslateX(26);
        Fire.setRotate(20);

        Text text = new Text();
        text.setText("BOOM");
        text.setFont(new Font("Cambria", 9));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(6);
        text.setTranslateY(22);
        root.getChildren().addAll(boom,lineF,Fire,text);
        return root;
    } //set Boom
    static Parent Boom2(){
        Pane root = new Pane();

        Circle boom = new Circle(); //ตา2
        boom.setRadius(20);
        boom.setFill(Color.BLACK);
        boom.setTranslateY(20);
        boom.setTranslateX(20);

        Line lineF = new Line(0,0,0,10);
        lineF.setStroke(Color.BLACK);
        lineF.setStrokeWidth(3);
        lineF.setTranslateY(-10);
        lineF.setTranslateX(30);
        lineF.setRotate(20);


        Rectangle Fire = new Rectangle(10,10);
        Fire.setFill(Color.rgb(250, 20, 20, 1));
        Fire.setStroke(Color.rgb(150 ,150, 20, 1));
        Fire.setStrokeWidth(5);
        Fire.setTranslateY(-15);
        Fire.setTranslateX(26);
        Fire.setRotate(20);

        Text text = new Text();
        text.setText("BOOM");
        text.setFont(new Font("Cambria", 9));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(6);
        text.setTranslateY(22);
        root.getChildren().addAll(boom,lineF,Fire,text);
        return root;
    } //set Boom
    static Parent Boom3(){
        Pane root = new Pane();

        Circle boom = new Circle(); //ตา2
        boom.setRadius(20);
        boom.setFill(Color.BLACK);
        boom.setTranslateY(20);
        boom.setTranslateX(20);

        Line lineF = new Line(0,0,0,10);
        lineF.setStroke(Color.BLACK);
        lineF.setStrokeWidth(3);
        lineF.setTranslateY(-10);
        lineF.setTranslateX(30);
        lineF.setRotate(20);


        Rectangle Fire = new Rectangle(10,10);
        Fire.setFill(Color.rgb(250, 20, 20, 1));
        Fire.setStroke(Color.rgb(150 ,150, 20, 1));
        Fire.setStrokeWidth(5);
        Fire.setTranslateY(-15);
        Fire.setTranslateX(26);
        Fire.setRotate(20);

        Text text = new Text();
        text.setText("BOOM");
        text.setFont(new Font("Cambria", 9));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(6);
        text.setTranslateY(22);
        root.getChildren().addAll(boom,lineF,Fire,text);
        return root;
    } //set Boom
    static Parent Boom4(){
        Pane root = new Pane();

        Circle boom = new Circle(); //ตา2
        boom.setRadius(20);
        boom.setFill(Color.BLACK);
        boom.setTranslateY(20);
        boom.setTranslateX(20);

        Line lineF = new Line(0,0,0,10);
        lineF.setStroke(Color.BLACK);
        lineF.setStrokeWidth(3);
        lineF.setTranslateY(-10);
        lineF.setTranslateX(30);
        lineF.setRotate(20);


        Rectangle Fire = new Rectangle(10,10);
        Fire.setFill(Color.rgb(250, 20, 20, 1));
        Fire.setStroke(Color.rgb(150 ,150, 20, 1));
        Fire.setStrokeWidth(5);
        Fire.setTranslateY(-15);
        Fire.setTranslateX(26);
        Fire.setRotate(20);

        Text text = new Text();
        text.setText("BOOM");
        text.setFont(new Font("Cambria", 9));
        text.setFill(Color.LIGHTYELLOW);
        text.setTranslateX(6);
        text.setTranslateY(22);
        root.getChildren().addAll(boom,lineF,Fire,text);
        return root;
    } //set Boom


    //////////////////////////////////////////////////////////
    ///////////////////////   START  /////////////////////////
    //////////////////////////////////////////////////////////
    public void start(Stage stage) throws Exception {
        Random rand = new Random();

        //////////////////// ใช้ Class theGrid ////////////////////
        Group Grid = new Group();
        Grid.getChildren().addAll(theGrid.createContent());
        Grid.setTranslateX(230);
        Grid.setTranslateY(100);


        //////////////////// ใช้ Class Player ////////////////////
        Group PPlayer = new Group();
        Group player1 = new Group();
        player1.getChildren().addAll(Player.player1());
        player1.setTranslateX(theGrid.getNumberX(localX1) - 3);
        player1.setTranslateY(theGrid.getNumberY(localY1) - 3);
        Group player2 = new Group();
        player2.getChildren().addAll(Player.player2());
        player2.setTranslateX(theGrid.getNumberX(localX2) + 3);
        player2.setTranslateY(theGrid.getNumberY(localY2) + 3);



        /////////////// ArrayList ///////////////
        startSnakeX = new ArrayList<>();  //หัว งู
        startSnakeY = new ArrayList<>();
        endSnakeX = new ArrayList<>();    //หาง งู
        endSnakeY = new ArrayList<>();

        checkGridS = new ArrayList<>();  //ระยะห่างระหว่าง จุด และ หัวงู
        checkGridE = new ArrayList<>();  //ระยะห่างระหว่าง จุด และ หางงู


        /////////////////////   ประกาศ GROUP /////////////////////
        Pane Snake = new Pane();
        Group tilePane = new Group();
        GridPane gridPane = new GridPane();
        Parent boomM = Boom();
        Parent boomM1 = Boom1();
        Parent boomM2 = Boom2();
        Parent boomM3 = Boom3();
        Parent boomM4 = Boom4();

        //////////////////// MenuBar ////////////////////
        Menu menu1 = new Menu(" Menu : ");
        Menu menuX = new Menu(" X ");
        MenuItem menuItemX = new MenuItem("close");
        menuItemX.setOnAction((event) -> {
            stage.close();
            System.out.println("close");
        });
        Menu menuEnd = new Menu("                                                                                                                      " +
                "                                                                                                                                         ");

        /////////////////// ตัวแปรใน Button && Manu ///////////////////////
        AtomicInteger k = new AtomicInteger(); //number clear-control
        AtomicInteger o = new AtomicInteger();
        final int[] i = {0}; //นับงู
        final int[] q = {0}; //นับ array ที่งู add เข้าไป
        final int[] cBoom = {0}; //นับ ว่ากด add ระเบิดไหม ?
        cBoom[0] = 0;
        o.set(1);
        k.set(0);
        /////////////////////////////////////////////////////////////////
        Menu menu2 = new Menu("Add-Snake&Boom");
        MenuItem menuItem21 = new MenuItem("Add-Snake");
        MenuItem menuItem22 = new MenuItem("Add-Boom moving");
        MenuItem menuItem23 = new MenuItem("Add-Boom 11-30");
        MenuItem menuItem24 = new MenuItem("Add-Boom 31-50");
        MenuItem menuItem25 = new MenuItem("Add-Boom 51-70");
        MenuItem menuItem26 = new MenuItem("Add-Boom 71-90");
        Menu menu3 = new Menu("Remove");
        MenuItem menuItem32 = new MenuItem("clear all");
        menuItem32.setOnAction((event) -> {
            Snake.getChildren().clear();//clear all the nodes from an anchorPane
            System.out.println("clear all");
            k.set(0);
            i[0] = 0;
            q[0] = 0;
            checkGridS.clear();
            checkGridE.clear();
            startSnakeX.clear();
            startSnakeY.clear();
            endSnakeX.clear();
            endSnakeY.clear();
            tilePane.getChildren().removeAll(boomM,boomM1,boomM2,boomM3,boomM4);
            menu3.getItems().clear();
            menu3.getItems().addAll(menuItem32);
            menu2.getItems().addAll(menuItem22,menuItem23,menuItem24,menuItem25,menuItem26);
        });// "clear all"
        menuItem21.setOnAction((event) -> {
            //System.out.println("Add-Snake");
            createLine line = new createLine();        //new line เวลากด
            Snake.getChildren().addAll(line.controlLine1, line.controlLine2, line.curve, line.start, line.control1, line.control2, line.end);
            k.addAndGet(1);

            MenuItem menuItem31 = new MenuItem("clear-control " + k);
            menuItem31.setOnAction((event1) -> {
                k.addAndGet(-1);
                System.out.println("|");
                System.out.println("clear");
                //System.out.println("start ( X = " + line.start.getCenterX() + ": Y = " + line.start.getCenterY()
                //        + " ) \n  end ( X = " + line.end.getCenterX() + ": Y = " + line.end.getCenterY() + " )"); //ดูค่า ของ lineStart และ lineEnd
                Snake.getChildren().removeAll(line.controlLine1, line.controlLine2, line.start, line.control1, line.control2, line.end);
                menu3.getItems().remove(menuItem31);   //add menuItem clear-control

                startSnakeX.add((int) line.start.getCenterX());
                startSnakeY.add((int) line.start.getCenterY());
                endSnakeX.add((int) line.end.getCenterX());
                endSnakeY.add((int) line.end.getCenterY());

                /////////////////// Check Line on the grid (หัว) ////////////////////
                for (int j = 0; j < 100; j++) { //ในกรอบ( จุด >=  array && จุด <= array + 55 )
                    if ((theGrid.getNumberX(j) <= startSnakeX.get(i[0]) && startSnakeX.get(i[0]) <= (theGrid.getNumberX(j) + 55))
                            && (theGrid.getNumberY(j) <= startSnakeY.get(i[0]) && startSnakeY.get(i[0]) <= (theGrid.getNumberY(j) + 55))) {
                        checkGridS.add(j);
                        //System.out.println("sX : " + theGrid.getNumberX(j) +" < "+startSnakeX.get(i[0])+" < "+ (theGrid.getNumberX(j) + 55));
                        //System.out.println("sY : " + theGrid.getNumberY(j) +" < "+startSnakeY.get(i[0])+" < "+ (theGrid.getNumberY(j) + 55));
                        System.out.print("index " + q[0] + " หัว : " + checkGridS.get(q[0]));
                        break;
                    }
                    //นอกกรอบ( จุด <  array เริ่ม || จุด > array สุดท้าย + 55 )
                    if ((theGrid.getNumberX(99) > startSnakeX.get(i[0]) || startSnakeX.get(i[0]) > (theGrid.getNumberX(9) + 55))
                            || (theGrid.getNumberY(99) > startSnakeY.get(i[0]) || startSnakeY.get(i[0]) > (theGrid.getNumberY(9) + 55))) {
                        checkGridS.add(null); //ให้ array นั้น เป็น null เพราะ หัวไม่มีจุดยืน
                        //System.out.println("sX : " + theGrid.getNumberX(9) +" > "+startSnakeX.get(i[0])+" > "+ (theGrid.getNumberX(9) + 55));
                        //System.out.println("sY : " + theGrid.getNumberY(9) +" > "+startSnakeY.get(i[0])+" > "+ (theGrid.getNumberY(9) + 55));
                        System.out.print("index " + q[0] + " หัว : " + checkGridS.get(q[0]));
                        break;
                    }
                }
                /////////////////// Check Line on the grid (หาง) ////////////////////
                for (int j = 0; j < 100; j++) { //ในกรอบ( จุด >=  array && จุด <= array + 55 )
                    if ((theGrid.getNumberX(j) <= endSnakeX.get(i[0]) && endSnakeX.get(i[0]) <= (theGrid.getNumberX(j) + 55))
                            && (theGrid.getNumberY(j) <= endSnakeY.get(i[0]) && endSnakeY.get(i[0]) <= (theGrid.getNumberY(j) + 55))) {
                        checkGridE.add(j);
                        System.out.println(" หาง : " + checkGridE.get(q[0]));
                        q[0]++;
                        //System.out.println("eX : " + theGrid.getNumberX(j) +" < "+endSnakeX.get(i[0])+" < "+ (theGrid.getNumberX(j) + 55));
                        //System.out.println("eY : " + theGrid.getNumberY(j) +" < "+endSnakeY.get(i[0])+" < "+ (theGrid.getNumberY(j) + 55));
                        break;
                    }
                    //นอกกรอบ( จุด <  array เริ่ม || จุด > array สุดท้าย + 55 )
                    if ((theGrid.getNumberX(99) > endSnakeX.get(i[0]) || endSnakeX.get(i[0]) > (theGrid.getNumberX(9) + 55))
                            || (theGrid.getNumberY(99) > endSnakeY.get(i[0]) || endSnakeY.get(i[0]) > (theGrid.getNumberY(9) + 55))) {
                        checkGridE.add(null); //ให้ array นั้น เป็น null เพราะ หางไม่มีจุดยืน
                        System.out.println(" หาง : " + checkGridE.get(q[0]));
                        q[0]++;
                        //System.out.println("eX : " + theGrid.getNumberX(9) +" > "+endSnakeX.get(i[0])+" > "+ (theGrid.getNumberX(9) + 55));
                        //System.out.println("eY : " + theGrid.getNumberY(9) +" > "+endSnakeY.get(i[0])+" > "+ (theGrid.getNumberY(9) + 55));
                        break;
                    }
                }
                Circle circle = new Circle(); //หัวงู
                circle.setRadius(12);
                circle.setTranslateX(startSnakeX.get(i[0]));
                circle.setTranslateY(startSnakeY.get(i[0]));
                if(checkGridS.get(q[0]-1) > checkGridE.get(q[0]-1)){ circle.setFill(Color.TOMATO);};
                if(checkGridS.get(q[0]-1) < checkGridE.get(q[0]-1)){ circle.setFill(Color.LIGHTGREEN);};
                Circle eye1 = new Circle(); //ตา1
                eye1.setRadius(2);
                eye1.setTranslateX((startSnakeX.get(i[0]) + 5));
                eye1.setTranslateY(startSnakeY.get(i[0]));
                eye1.setFill(Color.BLACK);
                Circle eye2 = new Circle(); //ตา2
                eye2.setRadius(2);
                eye2.setTranslateX((startSnakeX.get(i[0]) - 5));
                eye2.setTranslateY(startSnakeY.get(i[0]));
                eye2.setFill(Color.BLACK);
                Line mouse = new Line((startSnakeX.get(i[0]) - 6), (startSnakeY.get(i[0]) + 5), (startSnakeX.get(i[0]) + 6), (startSnakeY.get(i[0]) + 5));
                mouse.setStrokeLineCap(StrokeLineCap.ROUND);
                mouse.setStroke(Color.BLACK);
                mouse.setStrokeWidth(1);

                Snake.getChildren().addAll(circle, eye1, eye2, mouse);
                i[0]++; // บวกเป็น array ของงูอันต่อไป
            });
            menu3.getItems().addAll(menuItem31);
        });// "Add-Snake"
        menuItem22.setOnAction((event) -> {
            int random = rand.nextInt(85)+5;
            System.out.println("Add-Boom moving");
            tilePane.getChildren().add(boomM);            //เพิ่ม  BoomM ใน tilePane
            boomM.setTranslateX(theGrid.getNumberX(random));
            boomM.setTranslateY(theGrid.getNumberY(random));
            cBoom[0] = 1; //นับว่า add boom แล้ว
            System.out.println(cBoom[0]);
            menu2.getItems().remove(menuItem22);           //กดแล้วลบออก
            MenuItem menuItem33 = new MenuItem("clear-BOOM moving");
            menuItem33.setOnAction((event1) ->{
                tilePane.getChildren().remove(boomM);       //ลบ BoomM ใน tilePane
                menu2.getItems().add(menuItem22);           //กดแล้ว add ปุ่มเพิ่ม boom
                menu3.getItems().remove(menuItem33);        //กดแล้วลบออก
            });menu3.getItems().addAll(menuItem33);         //เพิ่มปุ่มลบ BoomM
        });// "Add-Boom moving"
        menuItem23.setOnAction((event) -> {
            int random = rand.nextInt(20)+10;
            System.out.println("Add-Boom 11-30");
            tilePane.getChildren().add(boomM1);            //เพิ่ม  BoomM ใน tilePane
            boomM1.setTranslateX(theGrid.getNumberX(random));
            boomM1.setTranslateY(theGrid.getNumberY(random));
            menu2.getItems().remove(menuItem23);
            MenuItem menuItem34 = new MenuItem("clear-BOOM 11-30");
            menuItem34.setOnAction((event1) ->{
                tilePane.getChildren().remove(boomM1);
                menu2.getItems().add(menuItem23);
                menu3.getItems().remove(menuItem34);
            });menu3.getItems().addAll(menuItem34);
        });// "Add-Boom 11-30"
        menuItem24.setOnAction((event) -> {
            int random = rand.nextInt(20)+30;
            System.out.println("Add-Boom 31-50");
            tilePane.getChildren().add(boomM2);            //เพิ่ม  BoomM ใน tilePane
            boomM2.setTranslateX(theGrid.getNumberX(random));
            boomM2.setTranslateY(theGrid.getNumberY(random));
            menu2.getItems().remove(menuItem24);
            MenuItem menuItem35 = new MenuItem("clear-BOOM 31-50");
            menuItem35.setOnAction((event1) ->{
                tilePane.getChildren().remove(boomM2);
                menu2.getItems().add(menuItem24);
                menu3.getItems().remove(menuItem35);
            });menu3.getItems().addAll(menuItem35);
        });// "Add-Boom 31-50"
        menuItem25.setOnAction((event) -> {
            int random = rand.nextInt(20)+50;
            System.out.println("Add-Boom 51-70");
            tilePane.getChildren().add(boomM3);            //เพิ่ม  BoomM ใน tilePane
            boomM3.setTranslateX(theGrid.getNumberX(random));
            boomM3.setTranslateY(theGrid.getNumberY(random));
            menu2.getItems().remove(menuItem25);
            MenuItem menuItem36 = new MenuItem("clear-BOOM 51-70");
            menuItem36.setOnAction((event1) ->{
                tilePane.getChildren().remove(boomM3);
                menu2.getItems().add(menuItem25);
                menu3.getItems().remove(menuItem36);
            });menu3.getItems().addAll(menuItem36);
        });// "Add-Boom 51-70"
        menuItem26.setOnAction((event) -> {
            int random = rand.nextInt(20)+70;
            System.out.println("Add-Boom 71-90");
            tilePane.getChildren().add(boomM4);            //เพิ่ม  BoomM ใน tilePane
            boomM4.setTranslateX(theGrid.getNumberX(random));
            boomM4.setTranslateY(theGrid.getNumberY(random));
            menu2.getItems().remove(menuItem26);
            MenuItem menuItem37 = new MenuItem("clear-BOOM 71-90");
            menuItem37.setOnAction((event1) ->{
                tilePane.getChildren().remove(boomM4);
                menu2.getItems().add(menuItem26);
                menu3.getItems().remove(menuItem37);
            });menu3.getItems().addAll(menuItem37);
        });// "Add-Boom 71-90"

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1, menu2, menu3, menuEnd, menuX);

        menuX.getItems().addAll(menuItemX);
        menu2.getItems().addAll(menuItem21, menuItem22,menuItem23,menuItem24,menuItem25,menuItem26);
        menu3.getItems().addAll(menuItem32);


        ////////////////// Button ///////////////////

        Label P1random = new Label();
        Label play1 = new Label();
        AtomicInteger p1 = new AtomicInteger(1);
        Label P2random = new Label();
        Label play2 = new Label();
        AtomicInteger p2 = new AtomicInteger(1);
        Label Rand = new Label();// create a label

        Button buttonReset = new Button("  < Reset >  ");
        buttonReset.setTranslateX(W/2 - 40);
        buttonReset.setTranslateY(30);
        buttonReset.setTextFill(Color.BLUE);
            Button buttonReset2 = new Button("  < Reset >  ");
            buttonReset2.setTranslateX(W/2 - 40);
            buttonReset2.setTranslateY(30);
            buttonReset2.setTextFill(Color.BLUE);

        Button buttonRandom = new Button("   < Dice >   ");
        buttonRandom.setTextFill(Color.GREEN);
        buttonRandom.setTranslateX(W / 2 - 43);
        buttonRandom.setTranslateY(H - 100);
            Button buttonRandom2 = new Button("   < Dice >   ");
            buttonRandom2.setTextFill(Color.GREEN);
            buttonRandom2.setTranslateX(W / 2 - 43);
            buttonRandom2.setTranslateY(H - 100);

        Button buttonBackStart = new Button("  < back >  ");
        buttonBackStart.setTranslateX(0);
        buttonBackStart.setTranslateY(30);
        buttonBackStart.setTextFill(Color.RED);

        Button buttonPlayP1vsP2 = new Button("  < P1 vs P2 >  ");
        buttonPlayP1vsP2.setTextFill(Color.GREEN);
        buttonPlayP1vsP2.setTranslateX(W / 2 - 55);
        buttonPlayP1vsP2.setTranslateY(H - 100);

        Button buttonPlayP1vsCom = new Button("  < P1 vs COM >  ");
        buttonPlayP1vsCom.setTextFill(Color.GREEN);
        buttonPlayP1vsCom.setTranslateX(W / 2 - 63);
        buttonPlayP1vsCom.setTranslateY(H - 60);

        Button buttonNext = new Button("  < next >  ");
        buttonNext.setTranslateX(915);
        buttonNext.setTranslateY(30);
        buttonNext.setTextFill(Color.BLUE);

        buttonRandom.setOnAction(Event -> {
            int random = rand.nextInt(6) + 1;            // random เต๋า
            int randomBoom = rand.nextInt(4)+4;
            Rand.setText(" + " + random);
            Rand.setFont(new Font("Cambria", 40)); //set font and size
            Rand.setTextFill(Color.WHITE);
            //////////////////// โชว์ กราฟิก /////////////////////
            if (o.get() % 2 == 1) {
                p1.addAndGet(random);
                P1random.setText(": " + (p1));
                P1random.setFont(new Font("Cambria", 40));
                P1random.setTextFill(Color.WHITE);
                P1random.setTranslateX(73);
                P1random.setTranslateY(250);

                Rand.setTranslateX(65);
                Rand.setTranslateY(300);

                play1.setTextFill(Color.GRAY);
                play2.setTextFill(Color.LIGHTYELLOW);
                Rand.setTextFill(Color.rgb(200, 200, 10, 1));
            }
            if (o.get() % 2 == 0) {
                p2.addAndGet(random);
                P2random.setText(": " + (p2));
                P2random.setFont(new Font("Cambria", 40));
                P2random.setTextFill(Color.WHITE);
                P2random.setTranslateX(857);
                P2random.setTranslateY(250);

                Rand.setTranslateX(850);
                Rand.setTranslateY(300);

                play1.setTextFill(Color.LIGHTYELLOW);
                play2.setTextFill(Color.GRAY);
                Rand.setTextFill(Color.rgb(50, 150, 200, 1));

            }
            /////////////////////// สลับคนเล่น ///////////////////////
            /*
            if( o.get() % 2 == 1){

                player1.setTranslateX(theGrid.getNumberX(localX1 + random));
                player1.setTranslateY(theGrid.getNumberY(localY1 + random));
                localX1 += random;
                localY1 += random;
                System.out.println("Player 1 : " + (localY1+1));
            }

            if( o.get() % 2 == 0){

                player2.setTranslateX(theGrid.getNumberX(localX2 + random));
                player2.setTranslateY(theGrid.getNumberY(localY2 + random));
                localX2 += random;
                localY2 += random;
                System.out.println("Player 2 : " + (localY2+1));
            }*/ //การเดินแบบธรรมดา
            if (o.get() % 2 == 1) { // Player 1
                if (checkGridS.size() > 0) { // มีงูใน map จะทำอันนี้
                    for (int m = 0; m < checkGridS.size(); m++) { //วนตาม ตัวงู(มีกี่ตัว)
                        if ((localX1 + random) == checkGridS.get(m) && checkGridS.get(m) != null) { //เช็คว่า ตำแหน่งนั้น ตรงกับงูไหม ?
                            localX1 = checkGridE.get(m); // set ให้ไปอยู๋ "หาง"
                            localY1 = checkGridE.get(m);
                            translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                            p1.set(localX1+1);   //set เลขที่ player ถูกเปลี่ยนแปลง
                            P1random.setText(": " + (p1));
                            break;
                        }
                        if ((checkGridS.size() - 1) == m) { // ถ้าถึง (size of array) ตัวสุดท้ายแล้วไม่เจองู ให้ทำอันนี้
                            if (localX1 + random >= 99) {
                                translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player1);//Animetion player
                                P1random.setText("WIN");
                                P1random.setTranslateX(70);
                                p1.set(0);
                                tilePane.getChildren().remove(buttonRandom);
                                play1.setTextFill(Color.LIGHTYELLOW);
                                play2.setTextFill(Color.GRAY);
                                tilePane.getChildren().add(buttonReset);  //เพิ่ม reset ตอนเล่นจบ
                                break;
                            }
                            localX1 += random;
                            localY1 += random;
                            translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player

                            break;
                        }
                    }
                    if (player1.getTranslateX() == boomM.getTranslateX() && player1.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM);
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P1 หนึ่งตา
                    if (player1.getTranslateX() == boomM1.getTranslateX() && player1.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM1);
                    }//ถ้า local ตรงกับ BOOM1
                    if (player1.getTranslateX() == boomM2.getTranslateX() && player1.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM2);
                    }//ถ้า local ตรงกับ BOOM2
                    if (player1.getTranslateX() == boomM3.getTranslateX() && player1.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM3);
                    }//ถ้า local ตรงกับ BOOM3
                    if (player1.getTranslateX() == boomM4.getTranslateX() && player1.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM4);
                    }//ถ้า local ตรงกับ BOOM4
                } else { //ถ้าไม่มีงูเลย จะทำอันนี้
                    //////////////////////////// IF P1 WIN ////////////////////////
                    if (localX1 + random >= 99) {
                        translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player1);//Animetion player
                        P1random.setText("WIN");
                        P1random.setTranslateX(70);
                        p1.set(0);
                        tilePane.getChildren().remove(buttonRandom);
                        play1.setTextFill(Color.LIGHTYELLOW);
                        play2.setTextFill(Color.GRAY);
                        tilePane.getChildren().add(buttonReset);  //เพิ่ม reset ตอนเล่นจบ
                    }
                    localX1 += random;
                    localY1 += random;
                    translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player1
                    if (player1.getTranslateX() == boomM.getTranslateX() && player1.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM);
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P1 หนึ่งตา
                    if (player1.getTranslateX() == boomM1.getTranslateX() && player1.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM1);
                    }//ถ้า local ตรงกับ BOOM1
                    if (player1.getTranslateX() == boomM2.getTranslateX() && player1.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM2);
                    }//ถ้า local ตรงกับ BOOM2
                    if (player1.getTranslateX() == boomM3.getTranslateX() && player1.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM3);
                    }//ถ้า local ตรงกับ BOOM3
                    if (player1.getTranslateX() == boomM4.getTranslateX() && player1.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM4);
                    }//ถ้า local ตรงกับ BOOM4
                }System.out.println("Player 1 : " + (localY1 + 1) + "  ["+(localY1 + 1 - random ) +" -> "+ (localY1 + 1) + "]");
            }

            if (o.get() % 2 == 0) { // Player 2
                if (checkGridS.size() > 0) {
                    for (int m = 0; m < checkGridS.size(); m++) {
                        if ((localX2 + random) == checkGridS.get(m) && checkGridS.get(m) != null) {
                            localX2 = checkGridE.get(m);
                            localY2 = checkGridE.get(m);
                            //player2.setTranslateX(theGrid.getNumberX(localX2));
                            //player2.setTranslateY(theGrid.getNumberY(localY2));
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player

                            p2.set(localX2+1);  //set เลขที่ player ถูกเปลี่ยนแปลง
                            P2random.setText(": " + (p2));
                            break;
                        }
                        if ((checkGridS.size() - 1) == m) { // ถ้าถึง (size of array) ตัวสุดท้ายแล้วไม่เจองู ให้ทำอันนี้
                            if (localX2 + random >= 99) {
                                //player2.setTranslateX(theGrid.getNumberX(99));
                                //player2.setTranslateY(theGrid.getNumberY(99));
                                translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player2);//Animetion player
                                P2random.setText("WIN");
                                P2random.setTranslateX(860);
                                p2.set(0);
                                tilePane.getChildren().remove(buttonRandom);

                                play1.setTextFill(Color.GRAY);
                                play2.setTextFill(Color.LIGHTYELLOW);
                                tilePane.getChildren().add(buttonReset);  //เพิ่ม reset ตอนเล่นจบ
                                break;
                            }
                            localX2 += random;
                            localY2 += random;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player
                            break;
                        }
                    }
                    if (player2.getTranslateX() == boomM.getTranslateX() && player2.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P2 หนึ่งตา
                    if (player2.getTranslateX() == boomM1.getTranslateX() && player2.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM1
                    if (player2.getTranslateX() == boomM2.getTranslateX() && player2.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM2
                    if (player2.getTranslateX() == boomM3.getTranslateX() && player2.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM3
                    if (player2.getTranslateX() == boomM4.getTranslateX() && player2.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM4
                } else {
                    //////////////////////////// IF P2 WIN ////////////////////////
                    if (localX2 + random >= 99) {
                       //player2.setTranslateX(theGrid.getNumberX(99));
                        //player2.setTranslateY(theGrid.getNumberY(99));
                        translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player2);//Animetion player
                        P2random.setText("WIN");
                        P2random.setTranslateX(860);
                        p2.set(0);
                        tilePane.getChildren().remove(buttonRandom);

                        play1.setTextFill(Color.GRAY);
                        play2.setTextFill(Color.LIGHTYELLOW);
                        tilePane.getChildren().add(buttonReset);  //เพิ่ม reset ตอนเล่นจบ
                    }
                    localX2 += random;
                    localY2 += random;
                    translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player2
                    if (player2.getTranslateX() == boomM.getTranslateX() && player2.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P2 หนึ่งตา
                    if (player2.getTranslateX() == boomM1.getTranslateX() && player2.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM1
                    if (player2.getTranslateX() == boomM2.getTranslateX() && player2.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM2
                    if (player2.getTranslateX() == boomM3.getTranslateX() && player2.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM3
                    if (player2.getTranslateX() == boomM4.getTranslateX() && player2.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p2.addAndGet(-(random*2));
                        localX2 -= random*2;
                        localY2 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                        P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                    }//ถ้า local ตรงกับ BOOM4
                }System.out.println("Player 2 : " + (localY2 + 1) + "  ["+(localY2 + 1 - random ) +" -> "+ (localY2 + 1) + "]");
            }

            o.addAndGet(1); //บวก +1 สลับ

            /////////////////////// การเลื่อนระเบิด  ///////////////////////
            if (cBoom[0] == 1 && o.get() % 5 == 1  && localX1 > localY2 && localX1 < 100){
                //boomM.setTranslateX(theGrid.getNumberX(localX1 + randomBoom));
                //boomM.setTranslateY(theGrid.getNumberY(localY1 + randomBoom));
                System.out.println("Boom ; "+(localX1 + randomBoom +1));
                translateBOOM(theGrid.getNumberX(localX1 + randomBoom),theGrid.getNumberY(localY1 + randomBoom),boomM);// AnimetionBOOM
            };

            if (cBoom[0] == 1 && o.get() % 5 == 1 && localX2 > localY1 && localX2 < 100){
                //boomM.setTranslateX(theGrid.getNumberX(localX2 + randomBoom));
                //boomM.setTranslateY(theGrid.getNumberY(localY2 + randomBoom));
                System.out.println("Boom ; "+(localY2 + randomBoom +1));
                translateBOOM(theGrid.getNumberX(localX2 + randomBoom),theGrid.getNumberY(localY2 + randomBoom),boomM);// AnimetionBOOM
            };


        });     //("   < Dice >   ");
            buttonRandom2.setOnAction(Event -> {
            int random = rand.nextInt(6) + 1;            // random เต๋า
            int random2 = rand.nextInt(6) + 1;
            int randomBoom = rand.nextInt(4)+4;
            Rand.setText(" + " + random);
            Rand.setFont(new Font("Cambria", 40)); //set font and size
            Rand.setTextFill(Color.WHITE);
            //////////////////// โชว์ กราฟิก /////////////////////
                p1.addAndGet(random);
                P1random.setText(": " + (p1));
                P1random.setFont(new Font("Cambria", 40));
                P1random.setTextFill(Color.WHITE);
                P1random.setTranslateX(73);
                P1random.setTranslateY(250);

                Rand.setTranslateX(65);
                Rand.setTranslateY(300);

                play1.setTextFill(Color.GRAY);
                play2.setTextFill(Color.LIGHTYELLOW);
                Rand.setTextFill(Color.rgb(200, 200, 10, 1));

                if (checkGridS.size() > 0) { // มีงูใน map จะทำอันนี้
                    for (int m = 0; m < checkGridS.size(); m++) { //วนตาม ตัวงู(มีกี่ตัว)
                        if ((localX1 + random) == checkGridS.get(m) && checkGridS.get(m) != null) { //เช็คว่า ตำแหน่งนั้น ตรงกับงูไหม ?
                            localX1 = checkGridE.get(m); // set ให้ไปอยู๋ "หาง"
                            localY1 = checkGridE.get(m);
                            translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                            p1.set(localX1+1);   //set เลขที่ player ถูกเปลี่ยนแปลง
                            P1random.setText(": " + (p1));
                            break;
                        }
                        if ((checkGridS.size() - 1) == m) { // ถ้าถึง (size of array) ตัวสุดท้ายแล้วไม่เจองู ให้ทำอันนี้
                            if (localX1 + random >= 99) {
                                translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player1);//Animetion player
                                P1random.setText("WIN");
                                P1random.setTranslateX(70);
                                p1.set(0);
                                tilePane.getChildren().remove(buttonRandom2);
                                play1.setTextFill(Color.LIGHTYELLOW);
                                play2.setTextFill(Color.GRAY);
                                tilePane.getChildren().add(buttonReset2);  //เพิ่ม reset ตอนเล่นจบ
                                break;
                            }
                            localX1 += random;
                            localY1 += random;
                            translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player

                            break;
                        }
                    }
                    if (player1.getTranslateX() == boomM.getTranslateX() && player1.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM);
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P1 หนึ่งตา
                    if (player1.getTranslateX() == boomM1.getTranslateX() && player1.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM1);
                    }//ถ้า local ตรงกับ BOOM1
                    if (player1.getTranslateX() == boomM2.getTranslateX() && player1.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM2);
                    }//ถ้า local ตรงกับ BOOM2
                    if (player1.getTranslateX() == boomM3.getTranslateX() && player1.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM3);
                    }//ถ้า local ตรงกับ BOOM3
                    if (player1.getTranslateX() == boomM4.getTranslateX() && player1.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM4);
                    }//ถ้า local ตรงกับ BOOM4
                } else { //ถ้าไม่มีงูเลย จะทำอันนี้
                    //////////////////////////// IF P1 WIN ////////////////////////
                    if (localX1 + random >= 99) {
                        translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player1);//Animetion player
                        P1random.setText("WIN");
                        P1random.setTranslateX(70);
                        p1.set(0);
                        tilePane.getChildren().remove(buttonRandom2);
                        play1.setTextFill(Color.LIGHTYELLOW);
                        play2.setTextFill(Color.GRAY);
                        tilePane.getChildren().add(buttonReset2);  //เพิ่ม reset ตอนเล่นจบ
                    }
                    localX1 += random;
                    localY1 += random;
                    translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player1
                    if (player1.getTranslateX() == boomM.getTranslateX() && player1.getTranslateY() == boomM.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM);
                    }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P1 หนึ่งตา
                    if (player1.getTranslateX() == boomM1.getTranslateX() && player1.getTranslateY() == boomM1.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM1);
                    }//ถ้า local ตรงกับ BOOM1
                    if (player1.getTranslateX() == boomM2.getTranslateX() && player1.getTranslateY() == boomM2.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM2);
                    }//ถ้า local ตรงกับ BOOM2
                    if (player1.getTranslateX() == boomM3.getTranslateX() && player1.getTranslateY() == boomM3.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM3);
                    }//ถ้า local ตรงกับ BOOM3
                    if (player1.getTranslateX() == boomM4.getTranslateX() && player1.getTranslateY() == boomM4.getTranslateY()){
                        Rand.setText(" - " + random +"\n[BOOM]");
                        Rand.setTextFill(Color.RED);
                        p1.addAndGet(-(random*2));
                        localX1 -= random*2;
                        localY1 -= random*2;
                        translatePlayer(theGrid.getNumberX(localX1),theGrid.getNumberY(localY1),player1);//Animetion player
                        P1random.setText(": " + p1); //setเลขตำแหน่งที่ p1 อยู๋
                        //tilePane.getChildren().removeAll(boomM4);
                    }//ถ้า local ตรงกับ BOOM4
                }System.out.println("Player 1 : " + (localY1 + 1));
            // Player 1

                Circle cir = new Circle(W/2 - 20,670,10); //ทำตัว load ขั้นกลาง P1 vs COM
                cir.setFill(Color.LIGHTGREY);
                    TranslateTransition translate = new TranslateTransition();
                    translate.setByX(50);
                    translate.setDuration(Duration.millis(300));
                    translate.setCycleCount(9);
                    translate.setAutoReverse(true);
                    translate.setNode(cir);
                    translate.setOnFinished(event ->{
                        //////////////////// โชว์ กราฟิก /////////////////////
                            p2.addAndGet(random2);
                            P2random.setText(": " + (p2));
                            P2random.setFont(new Font("Cambria", 40));
                            P2random.setTextFill(Color.WHITE);
                            P2random.setTranslateX(863);
                            P2random.setTranslateY(250);

                            Rand.setTranslateX(850);
                            Rand.setTranslateY(300);

                            play1.setTextFill(Color.LIGHTYELLOW);
                            play2.setTextFill(Color.GRAY);
                            Rand.setTextFill(Color.rgb(50, 150, 200, 1));
                            Rand.setText(" + " + random2); //เช็ค random 2
                    if (checkGridS.size() > 0) {
                        for (int m = 0; m < checkGridS.size(); m++) {
                            if ((localX2 + random2) == checkGridS.get(m) && checkGridS.get(m) != null) {
                                localX2 = checkGridE.get(m);
                                localY2 = checkGridE.get(m);
                                translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player
                                p2.set(localX2+1);  //set เลขที่ player ถูกเปลี่ยนแปลง
                                P2random.setText(": " + (p2));
                                break;
                            }
                            if ((checkGridS.size() - 1) == m) { // ถ้าถึง (size of array) ตัวสุดท้ายแล้วไม่เจองู ให้ทำอันนี้
                                if (localX2 + random2 >= 99) {
                                    translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player2);//Animetion player
                                    P2random.setText("WIN");
                                    P2random.setTranslateX(860);
                                    p2.set(0);
                                    tilePane.getChildren().remove(buttonRandom2);

                                    play1.setTextFill(Color.GRAY);
                                    play2.setTextFill(Color.LIGHTYELLOW);
                                    tilePane.getChildren().add(buttonReset2);  //เพิ่ม reset ตอนเล่นจบ
                                    tilePane.getChildren().remove(cir); // remove ขั่นเวลา
                                    break;
                                }
                                localX2 += random2;
                                localY2 += random2;
                                translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player
                                break;
                            }
                        }
                        if (player2.getTranslateX() == boomM.getTranslateX() && player2.getTranslateY() == boomM.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P2 หนึ่งตา
                        if (player2.getTranslateX() == boomM1.getTranslateX() && player2.getTranslateY() == boomM1.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM1
                        if (player2.getTranslateX() == boomM2.getTranslateX() && player2.getTranslateY() == boomM2.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM2
                        if (player2.getTranslateX() == boomM3.getTranslateX() && player2.getTranslateY() == boomM3.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM3
                        if (player2.getTranslateX() == boomM4.getTranslateX() && player2.getTranslateY() == boomM4.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM4
                    } else {
                        //////////////////////////// IF COM WIN ////////////////////////
                        if (localX2 + random2 >= 99) {
                            translatePlayer(theGrid.getNumberX(99),theGrid.getNumberY(99),player2);//Animetion player
                            P2random.setText("WIN");
                            P2random.setTranslateX(860);
                            p2.set(0);
                            tilePane.getChildren().remove(buttonRandom2);

                            play1.setTextFill(Color.GRAY);
                            play2.setTextFill(Color.LIGHTYELLOW);
                            tilePane.getChildren().add(buttonReset2);  //เพิ่ม reset ตอนเล่นจบ
                            tilePane.getChildren().remove(cir); // remove ขั่นเวลา
                        }
                        localX2 += random2;
                        localY2 += random2;
                        translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);//Animetion player2
                        if (player2.getTranslateX() == boomM.getTranslateX() && player2.getTranslateY() == boomM.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ ระเบิด ให้ หยุด P2 หนึ่งตา
                        if (player2.getTranslateX() == boomM1.getTranslateX() && player2.getTranslateY() == boomM1.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM1
                        if (player2.getTranslateX() == boomM2.getTranslateX() && player2.getTranslateY() == boomM2.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM2
                        if (player2.getTranslateX() == boomM3.getTranslateX() && player2.getTranslateY() == boomM3.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM3
                        if (player2.getTranslateX() == boomM4.getTranslateX() && player2.getTranslateY() == boomM4.getTranslateY()){
                            Rand.setText(" - " + random2 +"\n[BOOM]");
                            Rand.setTextFill(Color.RED);
                            p2.addAndGet(-(random2*2));
                            localX2 -= random2*2;
                            localY2 -= random2*2;
                            translatePlayer(theGrid.getNumberX(localX2),theGrid.getNumberY(localY2),player2);
                            P2random.setText(": " + p2); //setเลขตำแหน่งที่ p2 อยู๋
                        }//ถ้า local ตรงกับ BOOM4
                    }System.out.println("Player COM : " + (localY2 + 1));
                    tilePane.getChildren().remove(cir);
                    tilePane.getChildren().add(buttonRandom2);
                }); // Player COM
                    translate.play();
                    tilePane.getChildren().add(cir); // add ขั่นเวลา
                    tilePane.getChildren().remove(buttonRandom2);

                        if (localX1 + random >= 99) {tilePane.getChildren().remove(cir);tilePane.getChildren().remove(buttonRandom2);}
                        if (localX2 + random >= 99) {tilePane.getChildren().remove(cir);tilePane.getChildren().remove(buttonRandom2);}

            /////////////////////// การเลื่อนระเบิด  ///////////////////////
            if (cBoom[0] == 1 && o.get() % 5 == 1  && localX1 > localY2 && localX1 < 100){
                //boomM.setTranslateX(theGrid.getNumberX(localX1 + randomBoom));
                //boomM.setTranslateY(theGrid.getNumberY(localY1 + randomBoom));
                System.out.println("Boom ; "+(localX1 + randomBoom +1));
                translateBOOM(theGrid.getNumberX(localX1 + randomBoom),theGrid.getNumberY(localY1 + randomBoom),boomM);// AnimetionBOOM
            };

            if (cBoom[0] == 1 && o.get() % 5 == 1 && localX2 > localY1 && localX2 < 100){
                //boomM.setTranslateX(theGrid.getNumberX(localX2 + randomBoom));
                //boomM.setTranslateY(theGrid.getNumberY(localY2 + randomBoom));
                System.out.println("Boom ; "+(localY2 + randomBoom +1));
                translateBOOM(theGrid.getNumberX(localX2 + randomBoom),theGrid.getNumberY(localY2 + randomBoom),boomM);// AnimetionBOOM
            };

            o.addAndGet(1); //บวก +1 เพือให้ Boom เลื่อน
        });     //("   < Dice 2 >   ");
        buttonPlayP1vsP2.setOnAction(Event -> {
            PPlayer.getChildren().addAll(player1, player2);
            tilePane.getChildren().add(buttonRandom);
            tilePane.getChildren().removeAll(buttonPlayP1vsP2,buttonPlayP1vsCom);

            p1.set(1);
            player1.setTranslateX(theGrid.getNumberX(0));
            player1.setTranslateY(theGrid.getNumberY(0));
            P1random.setText(": 1");
            localX1 = 0;
            localY1 = 0;

            p2.set(1);
            player2.setTranslateX(theGrid.getNumberX(0));
            player2.setTranslateY(theGrid.getNumberY(0));
            P2random.setText(": 1");
            localX2 = 0;
            localY2 = 0;

            Rand.setText(" + " + 0);
            Rand.setTextFill(Color.WHITE);

            play1.setText("P1");
            play1.setFont(new Font("Cambria", 60));
            play1.setTextFill(Color.LIGHTYELLOW);
            play1.setTranslateX(70);
            play1.setTranslateY(170);


            play2.setText("P2");
            play2.setFont(new Font("Cambria", 60));
            play2.setTextFill(Color.LIGHTYELLOW);
            play2.setTranslateX(855);
            play2.setTranslateY(170);

        });      //("  < P1 vs P2 >  ");
        buttonPlayP1vsCom.setOnAction(Event -> {
            PPlayer.getChildren().addAll(player1, player2);
            tilePane.getChildren().add(buttonRandom2);
            tilePane.getChildren().removeAll(buttonPlayP1vsCom,buttonPlayP1vsP2);

            p1.set(1);
            player1.setTranslateX(theGrid.getNumberX(0));
            player1.setTranslateY(theGrid.getNumberY(0));
            P1random.setText(": 1");
            localX1 = 0;
            localY1 = 0;

            p2.set(1);
            player2.setTranslateX(theGrid.getNumberX(0));
            player2.setTranslateY(theGrid.getNumberY(0));
            P2random.setText(": 1");
            localX2 = 0;
            localY2 = 0;

            Rand.setText(" + " + 0);
            Rand.setTextFill(Color.WHITE);

            play1.setText("P1");
            play1.setFont(new Font("Cambria", 60));
            play1.setTextFill(Color.LIGHTYELLOW);
            play1.setTranslateX(70);
            play1.setTranslateY(170);


            play2.setText("COM");
            play2.setFont(new Font("Cambria", 60));
            play2.setTextFill(Color.LIGHTYELLOW);
            play2.setTranslateX(830);
            play2.setTranslateY(170);


        });      //("  < P1 vs COM >  ");
        buttonReset.setOnAction(Event -> {
            tilePane.getChildren().addAll(buttonPlayP1vsP2,buttonPlayP1vsCom);
            tilePane.getChildren().removeAll(buttonReset,buttonReset2);
            PPlayer.getChildren().removeAll(player1, player2);

        });       //("  < Reset >  ");
        buttonReset2.setOnAction(Event -> {
            tilePane.getChildren().addAll(buttonPlayP1vsP2,buttonPlayP1vsCom);
            tilePane.getChildren().removeAll(buttonReset,buttonReset2);
            PPlayer.getChildren().removeAll(player1, player2);

        });       //("  < Reset2 >  ");
        buttonNext.setOnAction(Event -> {
            tilePane.getChildren().removeAll(gridPane, buttonNext ,buttonBackStart);
            tilePane.getChildren().addAll(buttonPlayP1vsP2,buttonPlayP1vsCom);
            buttonBackStart.setTranslateX(0);
            buttonBackStart.setTranslateY(0);
            if (cBoom[0] == 0){tilePane.getChildren().remove(boomM);};

            
        });     //("  < next >  ");


        //////////////////// Translate /////////////////////
        gridPane.setHgap(5);//ระยะห่างทางขาว ช่อง
        gridPane.setVgap(5);//ระยะห่างข้างล่าง ช่อง
        gridPane.add(menuBar, 0, 0, 1, 1); //add button ,อยู๋คอลัม?,อยู๋แถว?,..?,..?

        Group tText = new Group();
        tText.getChildren().addAll(play1, P1random, play2, P2random, Rand);
        tilePane.getChildren().addAll(buttonBackStart, buttonNext, gridPane, tText);

        ///////////////  Scene START //////////////////
             Pane root = new Pane();
                Button mapCreate = new Button(" >  MAP Create  < ");
                mapCreate.setTranslateX(W/2-70);
                mapCreate.setTranslateY(600);
                mapCreate.setTextFill(Color.GREEN);
                Button exit = new Button(" >  Exit  < ");
                exit.setOnAction(Event -> System.exit(0));
                exit.setTranslateX(W/2-43);
                exit.setTranslateY(650);
                exit.setTextFill(Color.ORANGERED);

                Label SnakeLadder1 = new Label("Snake&ladder");
                Label SnakeLadder2 = new Label("Snake&ladder");
                Label SnakeLadder3 = new Label("Snake&ladder");
                SnakeLadder1.setTextFill(Color.RED);
                SnakeLadder2.setTextFill(Color.WHITE);
                SnakeLadder3.setTextFill(Color.BLUE);
                SnakeLadder1.setTranslateX(W/2-330);
                SnakeLadder2.setTranslateX(W/2-323);
                SnakeLadder3.setTranslateX(W/2-316);
                SnakeLadder1.setFont(new Font("Cambria", 100));
                SnakeLadder2.setFont(new Font("Cambria", 100));
                SnakeLadder3.setFont(new Font("Cambria", 100));
                SnakeLadder1.setTranslateY(H/2-80);
                SnakeLadder2.setTranslateY(H/2-80);
                SnakeLadder3.setTranslateY(H/2-80);
                root.getChildren().addAll(mapCreate,exit,SnakeLadder3,SnakeLadder2,SnakeLadder1);



        //////////////////// แสดงใน Windows /////////////////////

        stage.setTitle("Game : Snake&ladder");
        Scene StartMain = new Scene(new Group(root), W, H, Color.grayRgb(51));
        Scene ROOM = new Scene(new Group(Grid, Snake, PPlayer, tilePane), W, H, Color.grayRgb(51)); // สร้างเกม
        mapCreate.setOnAction(Event -> { stage.setScene(ROOM); });

        buttonBackStart.setOnAction(Event -> {stage.setScene(StartMain); mapCreate.setText(" >  Play continue  < ");mapCreate.setTranslateX(W/2-70);});
        stage.setScene(StartMain);//ดูุด้วย add ก่อนหลัง
        stage.setResizable(false);//fixed size Window Scene
        stage.show();
    }

    ////////////////ใช้ Class Line//////////////////
    static class createLine {
        CubicCurve curve = LineCurve.createStartingCurve();
        javafx.scene.shape.Line controlLine1 = new LineCurve.BoundLine(curve.controlX1Property(), curve.controlY1Property(), curve.startXProperty(), curve.startYProperty());
        javafx.scene.shape.Line controlLine2 = new LineCurve.BoundLine(curve.controlX2Property(), curve.controlY2Property(), curve.endXProperty(), curve.endYProperty());

        sample.LineCurve.Anchor start = new LineCurve.Anchor(Color.TOMATO, curve.startXProperty(), curve.startYProperty());//สีวงกลม-
        sample.LineCurve.Anchor control1 = new LineCurve.Anchor(Color.GOLD, curve.controlX1Property(), curve.controlY1Property());
        sample.LineCurve.Anchor control2 = new LineCurve.Anchor(Color.GOLDENROD, curve.controlX2Property(), curve.controlY2Property());
        sample.LineCurve.Anchor end = new LineCurve.Anchor(new Color(0, 0, 0, 0), curve.endXProperty(), curve.endYProperty());
    };
    private void translateBOOM( int x, int y, Parent b){
        TranslateTransition animate = new TranslateTransition(Duration.millis(1000), b);
        animate.setToX(x);
        animate.setToY(y);
        //animate.setCycleCount(900); //ทำวน
        animate.setAutoReverse(false);
        animate.play();
    }//animetion BOOM
    private void translatePlayer( int x, int y, Group b){
        TranslateTransition animate = new TranslateTransition(Duration.millis(1000), b);
        animate.setToX(x);
        animate.setToY(y);
        animate.setAutoReverse(false);
        animate.play();
    }//animetion Player


}

