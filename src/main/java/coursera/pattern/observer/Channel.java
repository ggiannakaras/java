package coursera.pattern.observer;

import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.status = status;
        this.channelName = channelName;
    }

    @Override
    public void registerObserver(Observer obsever) {
        if (observers == null)
            observers = new ArrayList<>();
        this.observers.add(obsever);
    }

    @Override
    public void removeObserver(Observer obsever) {
        this.observers.remove(obsever);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(status);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
