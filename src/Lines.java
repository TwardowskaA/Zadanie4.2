public class Lines {

    public double distance(Line line) {
        double distance;
        return Math.sqrt((line.p1.x - line.p2.x) * (line.p1.x - line.p2.x) + (line.p1.y - line.p2.y) * (line.p1.y - line.p2.y));

    }

    String longerLine(Line line1, Line line2) {

        if (distance(line1) > distance(line2)) {
            System.out.println("Linia 1 jest dłuższa");
            System.out.println("Współrzędne początku to:" + " " + line1.p1.x + ',' + line1.p1.y);
            System.out.println("Współrzędne końca to:" + " " + line1.p2.x + ',' + line1.p2.y);
            System.out.println("Długość lini wynosi:" + " " + distance(line1));
        } else {
            System.out.println("Linia 2 jest dłuższa");
            System.out.println("Współrzędne początku to:" + " " + line2.p1.x + ',' + line2.p1.y);
            System.out.println("Współrzędne końca to:" + " " + line2.p2.x + ',' + line2.p2.y);
            System.out.println("Długość lini wynosi:" + " " + distance(line2));

        }

        return null;
    }
}













