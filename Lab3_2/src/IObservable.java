import java.beans.PropertyChangeListener;

/**
 * Created by Kraft on 2016-12-15.
 */
public interface IObservable {


    void addObserver(PropertyChangeListener observer);

    void removeObserver(PropertyChangeListener observer);

}
