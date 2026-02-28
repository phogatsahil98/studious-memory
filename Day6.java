import java.awt.*;

public class Day6 {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Day6 buildBox(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Day6 buildBox(Point topLeft, Point bottomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }

    Day6 buildBox(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;

        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }

    void printBox(){
        System.out.println("Box : <"+x1 + " , "+y1 + " , "+ x2 + " , "+y2 + ">");
    }

    public static void main(String[] args){
        Day6 rect = new Day6();

        System.out.println("Calling Build Box with : "+ "Coordinates(25,25) and (50,50) :");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("Calling Build Box with : "+"Points (10,10) and (20,20) : ");
        rect.buildBox(new Point(10,10), new Point(20,20));
        rect.printBox();

        System.out.println("Calling Build Box with : "+"Point (10,10), width 50 and height 50 : ");
        rect.buildBox(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}
