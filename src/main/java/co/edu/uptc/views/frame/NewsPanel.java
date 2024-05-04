package co.edu.uptc.views.frame;

import javax.swing.JPanel;
import co.edu.uptc.views.Global;
import java.awt.Dimension;

public class NewsPanel extends JPanel{

    public NewsPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Global.NEWS_BACKGROUND);
        this.setForeground(Global.NEWS_FOREGROUND);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(60, 0));
    }
    
}
