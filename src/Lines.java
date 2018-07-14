public class Lines {

    public double distance(Line line) {
        double distance;
        return Math.sqrt((line.p1.x - line.p2.x) * (line.p1.x - line.p2.x) + (line.p1.y - line.p2.y) * (line.p1.y - line.p2.y));

    }

    Line longerLine(Line l1, Line l2) {

        if (distance(l1) > distance(l2)) {
            return l1;
        } else {
            return l2;
        }
    }
}