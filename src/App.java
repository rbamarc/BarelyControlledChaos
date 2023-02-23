import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String color = colorRng() ; //call color method here
        String animal = animalRng() ; //call animal method here
        String colorAgain = colorRng() ; //call color again here
        double weight = numbers(5, 200) ; // call number method here
        //range between 5 - 200
        double distance = numbers( 10, 20) ; // call number method
        // range between 10 - 20
        double number = numbers(10000, 20000) ; // call number method
        // range between 10000 - 20000
        double time =  numbers( 2, 6); // call number method
        // range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", " + weight + "lb miniature " + animal + " for over " + distance + " miles!");
        
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");

        System.out.println("\nIt was quite the experience, let me tell you! ");

    }

    public static String colorRng(){
        Random rng = new Random();
        
        String[] colors = new String[] {"Blue" , "Green" , "Red" , "Orange" , "Purple"};
        int randomIndex = rng.nextInt(colors.length);
        String randomColor = colors[randomIndex];
        return randomColor;
    }

    public static String animalRng(){
        Random rng = new Random();

        String[] animals = new String [] {"Dog" , "Cat" , "Penguine" , "Rabbit" , "Lizard"};
        int randomIndex = rng.nextInt(animals.length);
        String randomAnimal = animals[randomIndex];
        return randomAnimal;
    }

    public static double numbers(double min, double max){
        Random rng = new Random();

        double randomNumberInRange = rng.nextDouble() * (max - min) + min;
        return randomNumberInRange;
        
    }
}
