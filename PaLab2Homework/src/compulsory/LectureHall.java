package compulsory;

public class LectureHall extends Room{
    private boolean video;


    public LectureHall(String name, int capacity, boolean video) {
        super(name, capacity);
        this.video = video;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}
