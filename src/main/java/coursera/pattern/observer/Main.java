package coursera.pattern.observer;

public class Main {

    public static void main(String[] args) {
        Channel myChannel = new Channel("x-channel", "active");
        Follower follower = new Follower("John");
        Follower follower2 = new Follower("Hannah");
        myChannel.registerObserver(follower);
        myChannel.registerObserver(follower2);
        myChannel.notifyObservers();
        myChannel.setStatus("inactive");
        myChannel.removeObserver(follower2);
        myChannel.notifyObservers();
    }
}
