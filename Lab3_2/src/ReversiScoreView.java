import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by hussainbalasem on 2016-12-15.
 */
public class ReversiScoreView  extends JComponent implements PropertyChangeListener {

    ReversiModel model;

    public ReversiScoreView(ReversiModel model) {
        this.model = model;

    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
        System.out.println("Black: "+model.getBlackScore()+ " White: "+model.getWhiteScore());


    }


    /**
     * Consults the model to paint the game matrix. If model is null, draws a
     * default text.
     */
    @Override
    public void paintComponent(final Graphics g) {
        g.setColor(Color.cyan);

        g.drawString("black "+model.getBlackScore(),1000,100);
        g.drawString("white "+model.getWhiteScore(),1000,200);

    }
}