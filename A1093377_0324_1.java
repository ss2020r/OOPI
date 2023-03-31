import java.util.Scanner;

public class A1093377_0324_1 {

    public static void main(String[] args) {
        animal[] animals = { new animal(), new animal(), new animal(), new animal() };

        animals[0].name = "snowman";
        animals[0].height = 1.1;
        animals[0].weight = 52;
        animals[0].speed = 100;
        System.out.println("name:" + animals[0].name + " height:" + animals[0].height + " weight:" + animals[0].weight);

        animals[1].name = "donkey";
        animals[1].height = 1.5;
        animals[1].weight = 99;
        animals[1].speed = 200;
        System.out.println("name:" + animals[1].name + " height:" + animals[1].height + " weight:" + animals[1].weight);

        animals[2].name = "aisha";
        animals[2].height = 1.5;
        animals[2].weight = 99;
        animals[2].speed = 200;
        System.out.println("name:" + animals[2].name + " height:" + animals[2].height + " weight:" + animals[2].weight);

        animals[3].name = "anna";
        animals[3].height = 1.5;
        animals[3].weight = 99;
        animals[3].speed = 200;
        System.out.println("name:" + animals[3].name + " height:" + animals[3].height + " weight:" + animals[3].weight);

        Scanner scanner = new Scanner(System.in);

        for (animal animal : animals) {
            System.out.print("Enter time for " + animal.name + ": ");
            double time = scanner.nextDouble();
            System.out.print("Enter acceleration for " + animal.name + ": ");
            double acceleration = scanner.nextDouble();
            double distance = animal.distance(time, acceleration);
            System.out.println(animal.name + " ran " + distance + " meters.");
            System.out.println();
        }

    }

}

class animal {
    String name;
    double height;
    int weight;
    int speed;

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " m/min");
    }

    public double distance(double time, double acceleration) {
        return time * acceleration * speed;
    }

    public double distance(double time) {
        return time * speed;
    }
}
