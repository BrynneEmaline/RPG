import Rooms.Room;
import Rooms.RoomManager;
import Rooms.Player;

public class Main {

    public static void main(String[] args) {
        RoomManager roomManager = new RoomManager();
        Player player = new Player(roomManager);
        for(Room room : roomManager.getRooms()) {
            System.out.println(room.getRoomName());

        }

    }
}
