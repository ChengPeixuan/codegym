// java scanner class

import java.util.Scanner;

public class codegym11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
                "How charged with punishments the scroll,\n" +
                "I am the master of my fate,\n" +
                "I am the captain of my soul");
        String s = scanner.nextLine();
        System.out.println(s);
    }
}

// nextLine()
class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
                "How charged with punishments the scroll,\n" +
                "I am the master of my fate,\n" +
                "I am the captain of my soul");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
    }
}

// nextInt
class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = sc.nextInt();

        System.out.println("Thanks! You entered the number " + number);

    }
}

class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = sc.nextInt();

        System.out.println("Thanks! You entered the number " + number);

    }
}

// hasNextInt() hasNextLine()
class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Thanks! You entered the number " + number);
        } else {
            System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
        }

    }
}

// useDelimiter()
class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner("On a withered branch'" +
                "A crow has alighted.'" +
                "Nightfall in autumn." +
                "''***''" +
                "Such a moon above,'" +
                "Like a tree cut at the root:'" +
                "he fresh cut is white." +
                "''***''" +
                "How the river floods!'" +
                "A heron wanders on short legs,'" +
                "Knee-deep in the water.");

        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
    }
}

// close
class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = sc.nextInt();

        System.out.println("Thanks! You entered the number " + number);

        sc.close(); // Now we've done everything right!

    }
}