/**
 * Classname Main
 * <p>
 * Version info 1
 * <p>
 * Copyright Alyona Sviridova NTU KhPI
 */

package AboutMyself;

public class Main {

    public static void main(String[] args) {

        byte age = 22;
        short yearOfBirth = 1998;
        float height = 176.5f;
        double weight = 61.4;
        boolean married = false;
        char averageRating = 'B';
        int amountStepsPerDay = 31457;
        long kilomitersFromMeToSun = 149600000;

        String aboutMyself = "My name is Alyona. I'm "
                + age + " y.o." + " I was born in "
                + yearOfBirth + ". My height " + height + ". My weight "
                + weight+ ". Married " + married + ". Average rating by ECTS "
                + averageRating + ". Average amount of steps per day "
                + amountStepsPerDay + ". " + kilomitersFromMeToSun
                + " kilometers from me to Sun.";

        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());
    }
}