package Utils;
import Player.PlayerLocation;
import Player.PlayerActions;
import java.util.Objects;
import java.util.Scanner;
import Rooms.StartRoom;

public class StartRoomMenu extends Menu {
    private final StartRoom startRoom;
    private final PlayerActions playerActions;

    public StartRoomMenu(PlayerLocation playerLocation, Scanner scanner, StartRoom startRoom, PlayerActions playerActions) {
        super(playerLocation, scanner);
        this.startRoom = startRoom;
        this.playerActions = playerActions;
    }

    public void displayMenu() {
        while (playerLocation.getCurrentPlayerIndex() == 4 && Objects.equals(startRoom.getRoomState(), "Start")) {
            System.out.println("What would you like to do?");
            System.out.println("1. Examine your surroundings ");
            System.out.println("2. Try to remember ");
            System.out.println("3. Travel down the alleyway (right) ");
            System.out.println("4. Enter the cave (left) ");
            System.out.println("5. Exit game ");

            int playerChoice = scanner.nextInt();

            switch (playerChoice) {
                case 1:
                    System.out.println("description of surroundings ");
                    break;
                case 2:
                    playerActions.remember();
                    break;
                case 3:
                    playerLocation.moveRight();
                    break;
                case 4:
                    playerLocation.moveLeft();
                    break;
                case 5:
                    GameState.quit();
                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}
