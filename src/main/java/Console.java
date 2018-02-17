import java.util.Arrays;
import java.util.Scanner;

public class Console {

    Scanner input = new Scanner(System.in);

    String commands = input.nextLine();

    public String[] parseInput(){

        String inventory[] = commands.split(" ");

        System.out.println(Arrays.toString(inventory));
        System.out.println(inventory[2]);

        return inventory;
    }

    public String parsedCommand(){
        String commandDirection = "";

        switch (commandDirection){


        }
    }


}

