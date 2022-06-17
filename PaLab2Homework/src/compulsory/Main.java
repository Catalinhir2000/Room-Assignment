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


        ComputerLab r1 = new ComputerLab("401", 30, "windows");
        ComputerLab r2 = new ComputerLab("403", 30, "windows");
        ComputerLab r3 = new ComputerLab("405", 30, "MAC");
        LectureHall r4 = new LectureHall("309", 100, true);
        LectureHall r5 = new LectureHall("309", 100, false);
        LectureHall r6 = new LectureHall("309", 100, true);


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
