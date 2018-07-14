public class Lines {

    public double distance(Line line) {
        double distance;
        return Math.sqrt((line.getP1().getX() - line.getP2().getX()) * (line.getP1().getX() - line.getP2().getX()) + (line.getP1().getY() - line.getP2().getY()) * (line.getP1().getY() - line.getP2().getY()));

    }

    Line longerLine(Line l1, Line l2) {

        if (distance(l1) > distance(l2)) {
            return l1;
        } else {
            return l2;
        }
    }
}