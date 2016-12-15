import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by hussainbalasem on 2016-12-15.
 */
public class ReversiScoreView  extends JComponent implements PropertyChangeListener {


    public ReversiScoreView() {

    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();

        if (evt.getSource().getClass() == ReversiModel.class && evt.getPropertyName() == "Score Update"){
            ReversiModel reversi = (ReversiModel) evt.getSource();
            System.out.println("Black: "+reversi.getBlackScore()+ " White: "+reversi.getWhiteScore());
        }


    }


    /**
     * Consults the model to paint the game matrix. If model is null, draws a
     * default text.
     */
    @Override
    public void paintComponent(final Graphics g) {

    }
}