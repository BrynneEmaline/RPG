package Utils;
import Player.PlayerLocation;
import java.util.Scanner;


/*
Menu as the super class
 subclasses for each different menu
 ex: Start Room menus. Will handle all menus associated with the start room,
 will take into consideration the game state to give the right menu
 Why does it need playerLocation and scanner variables?
 - playerLocation: to track location of player to know which menu to display
 - scanner: to take in user input to make menu choices
 */

public abstract class Menu {

    protected final PlayerLocation playerLocation;
    protected final Scanner scanner;

    public Menu(PlayerLocation playerLocation, Scanner scanner) {
        this.playerLocation = playerLocation;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
    }
}
 /*
public class Menu {
     access the currentRoomIndex, and display a menu that corresponds with the room

1. examine location
    2. remember
    3. go right
    4. go left
} */
