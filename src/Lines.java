public class Lines {

    public double distance(Line line) {
        double distance;
        return Math.sqrt((line.getP1().x - line.getP2().x) * (line.getP1().x - line.getP2().x) + (line.getP1().y - line.getP2().y) * (line.getP1().y - line.getP2().y));

    }

    Line longerLine(Line l1, Line l2) {

        if (distance(l1) > distance(l2)) {
            return l1;
        } else {
            return l2;
        }
    }
}