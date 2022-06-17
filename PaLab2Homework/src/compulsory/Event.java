package compulsory;

import java.util.Objects;

public class Event {
    private String name;
    private int size;
    private int startTime;
    private int endTime;

    public Event() {
    }
    //ctor
    public Event(String name, int size, int startTime, int endTime) {
        this.name = name;
        this.size = size;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * returns the name of the event
     * @return returns the name of the event
     */
    public String getName() {
        return name;
    }

    /**
     * setter for event' s name
     * @param name : numele evenimentului
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the size of the event
     * @return the size in int
     */
    public int getSize() {
        return size;
    }

    /**
     * setter for the size of the event
     * @param size int
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * gets the start time of the event
     * @return the start time of the event as int
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * sets the start time of the event
     * @param startTime as int
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     * gets the end time of the event
     * @return the end time of the event as int
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * sets the end time of the event
     * @param endTime as int
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * tostring method of the class
     * @return
     */
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    /**
     * verifies the equality of the objects
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return name.equals(event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
