import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// import java.util.ArrayList;
// import java.util.List;

class JavaLoopsExample {
    // static class Framework {
    //     String name;
    //     String type;
    //     int gitStars;
    // }

    public static void main(String[] args) {
        // String[] animals = { "Lion", "Elephant", "Fox", "Eagle" };

        // for (int i = 0; i < animals.length; i++) {
        //     System.out.println(animals[i]);
        // }

        // for (int i = 1, j = 10; i < j; i++, j--) {
        //     System.out.println(i + ", " + j);
        // }

        // for (int x = 0, y = 10, z = 1; z < y; z++)
        //    System.out.println("X: " + x + ",Y: "+ y + ", Z: " + z);

        // List<Framework> frameworks = new ArrayList<>();
        // Framework framework1 = new Framework();
        // framework1.name = "Spring";
        // framework1.type = "Java";
        // framework1.gitStars = 32000;
        // frameworks.add(framework1);
        // Framework framework2 = new Framework();
        // framework2.name = "Flask";
        // framework2.type = "Python";
        // framework2.gitStars = 10000;
        // frameworks.add(framework2);
        // Framework framework3 = new Framework();
        // framework3.name = "Quarkus";
        // framework3.type = "Java";
        // framework3.gitStars = 50000;
        // frameworks.add(framework3);

        // for (Framework framework: frameworks) {
        //     System.out.println(framework.name + " (" + framework.type + ") -> " + framework.gitStars);
        // }

        // String[] carNameArray = { "BMW", "Mercedez Benz", "Volvo" };

        // for (String car: carNameArray) {
        //     System.out.println(car);
        // }

        // Map<String, Integer> cars = new HashMap<>();
        // cars.put("BMW", 45000);
        // cars.put("Mercedez Benz", 44000);
        // cars.put("Volvo", 30000);

        // for (Map.Entry<String, Integer> car :
        //      cars.entrySet()) {
        //     System.out.print(car.getKey() + ":");
        //     System.out.println(car.getValue());
        // }

        // for(;;) {
        //     System.out.println(new Date());
        // }

        // do {
        //     System.out.println(new Date());
        // } while (true);

        // while (true) {
        //     System.out.println(new Date());
        // }

        // String[] cars = { "BMW", "Mercedez Benz", "Volvo" };
        // int x = 0;

        // while ( x < cars.length ) {
        //     System.out.println(cars[x]);
        //     x++;
        // }

        // do {
        //     System.out.println(cars[x]);
        //     x++;
        // } while(cars.length > x);

        // int x, y;

        // parent loop
        // for(x = 0; x < 7; x++) { 
        //     // child loop
        //     for(y = 0; y <= x; y++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for (int x = 0; x < 7; x++) {
            for (int y = 7 - x; y > 1; y--)
            {
                System.out.print(" ");
            }

            for (int y = 0; y <= x; y++ )
            {
                System.out.print("* ");
            }
   
            System.out.println();
        }
    }
}