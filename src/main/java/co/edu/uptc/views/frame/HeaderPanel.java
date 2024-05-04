package co.edu.uptc.views.frame;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.views.Global;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class HeaderPanel extends JPanel {

     
    public HeaderPanel() {
        initPanel();
        createTitle();        
        redimentionWindow();
        
    }
    
    private void initPanel() {
        this.setBackground(Global.HEADER_BACKGROUND);
        this.setForeground(Global.HEADER_FOREGROUND);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(0, 100));
    }

  

    private void createTitle() {
       JLabel title1 = new JLabel("UNIVERSIDAD PEDAGÓGICA Y TECNOLÓGICA DE COLOMBIA ");
        title1.setBounds(20, 10, 400, 30);
        title1.setForeground(this.getForeground());
        this.add(title1);
     
        JLabel  title2 = new JLabel("FACULTAD DE INGENIERÍA");
         title2.setBounds(20, 30, 300, 30);
         title2.setForeground(this.getForeground());
         this.add(title2);

          JLabel title3 = new JLabel("INGENIERÍA DE SISTEMAS Y COMPUTACIÓN");
         title3.setBounds(20, 50, 300, 30);
         title3.setForeground(this.getForeground());
         this.add(title3);       
    }

  
 

   public void centerElements(){
        Object [] components = this.getComponents();
        for (Object component : components) {
            if (component instanceof JComponent) {
                if (component instanceof JButton) {
                  centerElement((JComponent)component, ((JButton)component).getText());
                } else if (component instanceof JLabel) {
                centerElement((JComponent)component, ((JLabel)component).getText());
                }
            }
         }   
   }

   public void centerElement(JComponent element,String text){
    Font font = element.getFont();
    FontMetrics metrics = element.getGraphics().getFontMetrics(font);
     int width = metrics.stringWidth(text);
    int x = (this.getSize().width/2)-(width/2);
    element.setLocation(x,element.getY());
   }


   private void redimentionWindow(){
    this.addComponentListener(new ComponentListener() {

        @Override
        public void componentResized(ComponentEvent e) {
            centerElements();
        }

        @Override
        public void componentMoved(ComponentEvent e) {}

        @Override
        public void componentShown(ComponentEvent e) {}

        @Override
        public void componentHidden(ComponentEvent e) {  }
        
    });
}

}
