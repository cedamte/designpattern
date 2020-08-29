import biscuit.Biscuit;
import factory.BiscuitFactory;
import factory.RichTeaFactory;
import factory.ShortBreadFactory;

import java.util.Scanner;

enum BiscuitType {
    RichTea("Rich Tea"),
    ShortBread("Short Bread");

    BiscuitType(String type) {
        this.type = type;
    }

    private final String type;

    public String getType() {
        return type;
    }
}

public class Demo {
    public static BiscuitFactory biscuitFactory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the biscuit would you like:\n" +
                "[1] RichTea\n" +
                "[2] ShortBread\n:");
        try {
            configure(scanner.nextInt());
            description();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void description() {
        biscuitFactory.description();
    }

    private static void configure(int biscuitType) {
        switch (biscuitType) {
            case 1:
                biscuitFactory = new RichTeaFactory();
                break;
            case 2:
                biscuitFactory = new ShortBreadFactory();
                break;
            default:
                throw new IllegalArgumentException("You entered an incorrect value");
        }
    }
}
