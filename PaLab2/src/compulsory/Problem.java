package compulsory;

import java.util.Arrays;

public class Problem {
    private Event[] events = new Event[30];
    private Room[] rooms = new Room[30];
    private int nrev = 0;
    private int nrro = 0;

    public void addEvent(Event x){
        boolean isAlreadyInList = false;
        for(int i = 0; i < nrev; i++)
            if(events[i].equals(x)){
                isAlreadyInList = true;
                break;
            }
        if(!isAlreadyInList){
            events[nrev] = x;
            nrev +=1;
        }
    }

    public void addRoom(Room x){
        boolean isAlreadyInList = false;
        for(int i = 0; i < nrro; i++)
            if(rooms[i].equals(x)){
                isAlreadyInList = true;
                break;
            }
        if(!isAlreadyInList){
            rooms[nrro] = x;
            nrro +=1;
        }
    }

    @Override
    public String toString() {
        return "Problem{" +
                "events=" + Arrays.toString(events) +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
