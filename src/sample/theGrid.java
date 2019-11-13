package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class theGrid {
    private static final int NUM_OF_PAIRS = 100;
    private static final int NUM_PER_ROW = 10;
    private static ArrayList<Tile> tiles;
    private static List<Integer> LocalX;
    private static List<Integer> LocalY;

    static Parent createContent() {
        Pane root = new Pane();
        /////////////// ArrayList ///////////////
        tiles = new ArrayList<>();
        LocalX = new ArrayList<>();
        LocalY = new ArrayList<>();


        for (int i = 0; i < 99; i++) {
            LocalX.add(null);//add local x
            LocalY.add(null);//add local y
        }
        /// 0 >> - >> 9
        LocalY.add(0,600);LocalX.add(0,235);
        LocalY.add(1,600);LocalX.add(1,290);
        LocalY.add(2,600);LocalX.add(2,345);
        LocalY.add(3,600);LocalX.add(3,400);
        LocalY.add(4,600);LocalX.add(4,455);
        LocalY.add(5,600);LocalX.add(5,510);
        LocalY.add(6,600);LocalX.add(6,565);
        LocalY.add(7,600);LocalX.add(7,620);
        LocalY.add(8,600);LocalX.add(8,675);
        LocalY.add(9,600);LocalX.add(9,730);

        /// 19 << - << 10
        LocalY.add(10,545);LocalX.add(10,730);
        LocalY.add(11,545);LocalX.add(11,675);
        LocalY.add(12,545);LocalX.add(12,620);
        LocalY.add(13,545);LocalX.add(13,565);
        LocalY.add(14,545);LocalX.add(14,510);
        LocalY.add(15,545);LocalX.add(15,455);
        LocalY.add(16,545);LocalX.add(16,400);
        LocalY.add(17,545);LocalX.add(17,345);
        LocalY.add(18,545);LocalX.add(18,290);
        LocalY.add(19,545);LocalX.add(19,235);

        /// 20 >> - >> 29
        LocalY.add(20,490);LocalX.add(20,235);
        LocalY.add(21,490);LocalX.add(21,290);
        LocalY.add(22,490);LocalX.add(22,345);
        LocalY.add(23,490);LocalX.add(23,400);
        LocalY.add(24,490);LocalX.add(24,455);
        LocalY.add(25,490);LocalX.add(25,510);
        LocalY.add(26,490);LocalX.add(26,565);
        LocalY.add(27,490);LocalX.add(27,620);
        LocalY.add(28,490);LocalX.add(28,675);
        LocalY.add(29,490);LocalX.add(29,730);

        /// 39 << - << 30
        LocalY.add(30,435);LocalX.add(30,730);
        LocalY.add(31,435);LocalX.add(31,675);
        LocalY.add(32,435);LocalX.add(32,620);
        LocalY.add(33,435);LocalX.add(33,565);
        LocalY.add(34,435);LocalX.add(34,510);
        LocalY.add(35,435);LocalX.add(35,455);
        LocalY.add(36,435);LocalX.add(36,400);
        LocalY.add(37,435);LocalX.add(37,345);
        LocalY.add(38,435);LocalX.add(38,290);
        LocalY.add(39,435);LocalX.add(39,235);

        /// 40 >> - >> 49
        LocalY.add(40,380);LocalX.add(40,235);
        LocalY.add(41,380);LocalX.add(41,290);
        LocalY.add(42,380);LocalX.add(42,345);
        LocalY.add(43,380);LocalX.add(43,400);
        LocalY.add(44,380);LocalX.add(44,455);
        LocalY.add(45,380);LocalX.add(45,510);
        LocalY.add(46,380);LocalX.add(46,565);
        LocalY.add(47,380);LocalX.add(47,620);
        LocalY.add(48,380);LocalX.add(48,675);
        LocalY.add(49,380);LocalX.add(49,730);

        /// 59 << - << 50
        LocalY.add(50,325);LocalX.add(50,730);
        LocalY.add(51,325);LocalX.add(51,675);
        LocalY.add(52,325);LocalX.add(52,620);
        LocalY.add(53,325);LocalX.add(53,565);
        LocalY.add(54,325);LocalX.add(54,510);
        LocalY.add(55,325);LocalX.add(55,455);
        LocalY.add(56,325);LocalX.add(56,400);
        LocalY.add(57,325);LocalX.add(57,345);
        LocalY.add(58,325);LocalX.add(58,290);
        LocalY.add(59,325);LocalX.add(59,235);

        /// 60 >> - >> 69
        LocalY.add(60,270);LocalX.add(60,235);
        LocalY.add(61,270);LocalX.add(61,290);
        LocalY.add(62,270);LocalX.add(62,345);
        LocalY.add(63,270);LocalX.add(63,400);
        LocalY.add(64,270);LocalX.add(64,455);
        LocalY.add(65,270);LocalX.add(65,510);
        LocalY.add(66,270);LocalX.add(66,565);
        LocalY.add(67,270);LocalX.add(67,620);
        LocalY.add(68,270);LocalX.add(68,675);
        LocalY.add(69,270);LocalX.add(69,730);

        /// 79 << - << 70
        LocalY.add(70,215);LocalX.add(70,730);
        LocalY.add(71,215);LocalX.add(71,675);
        LocalY.add(72,215);LocalX.add(72,620);
        LocalY.add(73,215);LocalX.add(73,565);
        LocalY.add(74,215);LocalX.add(74,510);
        LocalY.add(75,215);LocalX.add(75,455);
        LocalY.add(76,215);LocalX.add(76,400);
        LocalY.add(77,215);LocalX.add(77,345);
        LocalY.add(78,215);LocalX.add(78,290);
        LocalY.add(79,215);LocalX.add(79,235);

        /// 80 >> - >> 89
        LocalY.add(80,160);LocalX.add(80,235);
        LocalY.add(81,160);LocalX.add(81,290);
        LocalY.add(82,160);LocalX.add(82,345);
        LocalY.add(83,160);LocalX.add(83,400);
        LocalY.add(84,160);LocalX.add(84,455);
        LocalY.add(85,160);LocalX.add(85,510);
        LocalY.add(86,160);LocalX.add(86,565);
        LocalY.add(87,160);LocalX.add(87,620);
        LocalY.add(88,160);LocalX.add(88,675);
        LocalY.add(89,160);LocalX.add(89,730);

        /// 99 << - << 90
        LocalY.add(90,105);LocalX.add(90,730);
        LocalY.add(91,105);LocalX.add(91,675);
        LocalY.add(92,105);LocalX.add(92,620);
        LocalY.add(93,105);LocalX.add(93,565);
        LocalY.add(94,105);LocalX.add(94,510);
        LocalY.add(95,105);LocalX.add(95,455);
        LocalY.add(96,105);LocalX.add(96,400);
        LocalY.add(97,105);LocalX.add(97,345);
        LocalY.add(98,105);LocalX.add(98,290);
        LocalY.add(99,105);LocalX.add(99,235);
        /////////////// สลับแถวตาราง ////////////////
        System.out.println("Is the LocalX list empty? : " + LocalX.isEmpty()+"\n"+"Is the LocalY list empty? : " + LocalY.isEmpty());
        int a = 100;
        int lo = 0;
        for (int i = 0 ; i < 10 ; i++) {
                if ( i % 2 == 0){
                    for (int k = 10; k > 0; k--) {
                        tiles.add(new Tile(String.valueOf(a)));
                        //LocalX.add(a-1 ,55 * (lo % NUM_PER_ROW) +230 +5);//รัน เอา local X
                        //LocalY.add(a-1,55 * (lo / NUM_PER_ROW) +100 +5);//รัน เอา local Y
                        //System.out.print("LocalY.add("+(a-1)+","+LocalY.get(a-1)+");");
                        //System.out.println("LocalX.add("+(a-1)+","+LocalX.get(a-1)+");");

                        lo++;
                        a--;
                    }}

               if (i % 2 == 1) {
                    a -= 9;
                    for (int l = 0; l < 10; l++) {
                        tiles.add(new Tile(String.valueOf(a)));
                        //LocalX.add(a-1 ,55 * (lo % NUM_PER_ROW) +230 +5);//รัน เอา local X
                        //LocalY.add(a-1,55 * (lo / NUM_PER_ROW) +100 +5);//รัน เอา local Y
                        //System.out.print("LocalY.add("+(a-1)+","+LocalY.get(a-1)+");");
                        //System.out.println("LocalX.add("+(a-1)+","+LocalX.get(a-1)+");");

                        lo++;
                        a++;
                    }a -= 11;}
        }


        int b= 100;
        for (int i = 0; i < tiles.size(); i++) { //กำหนดตำแหน่งตารางแต่ละช่อง
            Tile tile = tiles.get(i);
            tile.setTranslateX(55 * (i % NUM_PER_ROW));
            tile.setTranslateY(55 * (i / NUM_PER_ROW));
            Rectangle border = new Rectangle(10,10);
                border.setFill(Color.LIGHTGRAY);
                border.setStroke(Color.rgb(225, 225, 225, 1));
                border.setTranslateX(55 * (i % NUM_PER_ROW));
                border.setTranslateY(55 * (i / NUM_PER_ROW));
            root.getChildren().addAll(tile,border);
            //System.out.println("index "+(b)+" : - "+LocalX.get(i) + " : "+LocalY.get(i));
            b--;
        }
        return root;
    }
    public static int getNumberX(int pos) //return LocalX ที่อยู่ใน array
    {
        return LocalX.get(pos);}
    public static int getNumberY(int pos) //return LocalY ที่อยู่ใน array
    {
        return LocalY.get(pos);}

    private static class Tile extends StackPane{
        public  Tile(String value){
            Rectangle border = new Rectangle(50,50);
                border.setFill(Color.rgb(200, 200, 200, 0.9));
                border.setStroke(Color.rgb(225, 225, 225, 1));
            Text text = new Text();
            text.setText(value);
            text.setFont(Font.font(20));
            text.setFill(Color.rgb(5, 5, 5, 0.5));

            setAlignment(Pos.CENTER);
            getChildren().addAll(border, text);
        }
    }





}
