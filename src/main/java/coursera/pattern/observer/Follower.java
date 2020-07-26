package coursera.pattern.observer;

public class Follower implements Observer {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public void play() { }

    @Override
    public void update(String status) {
        System.out.println("Updating [" + followerName + "] with status [" + status + "]");
    }
}
