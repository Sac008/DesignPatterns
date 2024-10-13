package ObserverPattern_second.BestCode;

import ObserverPattern_second.BestCode.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
