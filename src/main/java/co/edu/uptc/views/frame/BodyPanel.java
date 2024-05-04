package co.edu.uptc.views.frame;

import javax.swing.JPanel;
import co.edu.uptc.views.Global;

public class BodyPanel extends JPanel {
    
    public BodyPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Global.BODY_BACKGROUND);
        this.setForeground(Global.BODY_FOREGROUND);
        this.setLayout(null);        
        
    }   

}
