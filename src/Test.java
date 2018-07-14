import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Wprowadź współrzęde punktu p1 lini 1:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Wprowadź współrzędne punktu p2 lini 1:");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.println("Wprowadź współrzędne punktu p1 lini 2:");
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        System.out.println("Wprowadź współrzędne punktu p2 lini 2:");
        int a2 = input.nextInt();
        int b2 = input.nextInt();

        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(a1, b1, a2, b2);

        Lines lines = new Lines();
        double dlugoscLine1 = lines.distance(line1);
        double dlugoscLine2 = lines.distance(line2);

        Line longer = lines.longerLine(line1, line2);
        if (longer == line1) {
            System.out.println("Linia 1 jest dłuższa");
            System.out.println("Współrzędne początku to:" + " " + line1.p1.x + ',' + line1.p1.y);
            System.out.println("Współrzędne końca to:" + " " + line1.p2.x + ',' + line1.p2.y);
            System.out.println("Długość lini wynosi:" + " " + lines.distance(line1));
        } else {
            System.out.println("Linia 2 jest dłuższa");
            System.out.println("Współrzędne początku to:" + " " + line2.p1.x + ',' + line2.p1.y);
            System.out.println("Współrzędne końca to:" + " " + line2.p2.x + ',' + line2.p2.y);
            System.out.println("Długość lini wynosi:" + " " + lines.distance(line2));


        }
    }
}


