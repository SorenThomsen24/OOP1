package Task2;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Room room = new Room(2, 5, 4);
        Room room1 = new Room(3, 2, 3);
        Room room2 = new Room(1, 3, 2);

        ArrayList<Room> Rooms = new ArrayList<Room>();
        Rooms.add(room);
        Rooms.add(room1);
        Rooms.add(room2);

        Building building = new Building(new ArrayList<>(), 2, 2, false);

    }
    private static int countLampsInBuilding(Building building)
    {
        int sum= 0;
        ArrayList<Room> rooms = building.getRooms();
        for (Room r: rooms)
        {
            sum += r.getNumberOfLamps();
        }
        return sum;
    }
    private static boolean isNormal(Building building)
    {
        if (building.getNumberOfFloors() > building.getRooms().size())
        {
            return true;
        }
        else
            System.out.println("This is an odd building");
        return false;

    }

}
