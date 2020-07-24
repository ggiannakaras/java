package coursera.pattern.observer;

/**
 *  Youtube allows users to follow their favorite Youtube stars
 *  so that they will be notified when the channel is live.
 *  This is commonly done using the observer pattern.
 *  Complete the provided code and use the following UML class diagram as a guide:
 */
public interface Subject {

    void registerObserver(Observer obsever);

    void removeObserver(Observer obsever);

    void notifyObservers();
}
