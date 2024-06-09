import Rooms.*;
import Player.*;
import Utils.*;
import java.util.Scanner;
import Player.PlayerActions;
public class Main {

    public static void main(String[] args) {
        RoomManager roomManager = new RoomManager();
        StartRoom startRoom = new StartRoom();
        PlayerActions playerActions = new PlayerActions();
        Scanner scanner = new Scanner(System.in);
        PlayerLocation playerLocation = new PlayerLocation(roomManager);
        StartRoomMenu startRoomMenu = new StartRoomMenu(playerLocation, scanner, startRoom, playerActions);
       // for(Room room : roomManager.getRooms()) {
       //     System.out.println(room.getRoomName());
       // }

        System.out.println(startRoom.getRoomDescription());
        startRoomMenu.displayMenu();



    }
}
