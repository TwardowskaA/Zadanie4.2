public class Line {

    Point p1;
    Point p2;

    Line(int x1, int y1, int x2, int y2) {

        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);

    }

    public Point getP1() {
        return p1;
    }


    public Point getP2() {
        return p2;
    }



}