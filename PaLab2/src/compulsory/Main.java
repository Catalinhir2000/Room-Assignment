package compulsory;

public class Main {

    public static void main(String[] args) {

        Problem pb = new Problem();

        // Event objects
        Event e1 = new Event("C1", 100, 8, 10);
        Event e2 = new Event("C2", 100, 10, 12);
        Event e3 = new Event("L1", 30, 8, 10);
        Event e4 = new Event("L2", 30, 8, 10);
        Event e5 = new Event("L3", 30, 10, 12);




        pb.addEvent(e1);
        pb.addEvent(e2);
        pb.addEvent(e3);
        pb.addEvent(e4);
        pb.addEvent(e5);


        // Room objects
        Room r1 = new Room("401", Types.LAB, 30);
        Room r2 = new Room("403", Types.LAB, 30);
        Room r3 = new Room("405", Types.LAB, 30);
        Room r4 = new Room("309", Types.LECTUREHALL, 100);
        Room r5 = new Room("309", Types.LECTUREHALL, 100);
        Room r6 = new Room("309", Types.LECTUREHALL, 100);

        pb.addRoom(r1);
        pb.addRoom(r2);
        pb.addRoom(r3);
        pb.addRoom(r4);
        pb.addRoom(r5);
        pb.addRoom(r6);

        System.out.println(pb);

        //printing the examples
//        System.out.println(e1.toString());
//        System.out.println(e2.toString());
//        System.out.println(e3.toString());
//        System.out.println(e4.toString());
//        System.out.println(e5.toString());
//
//        System.out.println(r1.toString());
//        System.out.println(r2.toString());
//        System.out.println(r3.toString());
//        System.out.println(r4.toString());


    }
}
