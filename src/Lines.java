public class Lines {

    Line line1 = new Line(4,5,4,7);

    public double distance1() {
        return Math.sqrt((line1.p1.x - line2.p2.x) * (line1.p1.x - line2.p2.x) + (line1.p1.y - line2.p2.y) * (line1.p1.y - line2.p2.y));
    }

    Line line2 = new Line(2,6,2,11);

    public double distance2() {
        return Math.sqrt((line1.p1.x - line2.p2.x) * (line1.p1.x - line2.p2.x) + (line1.p1.y - line2.p2.y) * (line1.p1.y - line2.p2.y));

    }

}


