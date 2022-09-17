import java.awt.*;
import java.awt.event.*;

public class ButtonListener implements ActionListener {
   public void actionPerformed( ActionEvent e) {
      Button      btn  = (Button) e.getSource();
      Component[] btns = btn.getParent().getComponents();
      int i = 0;
      for ( ; i < btns.length; i++)
         if (btn == btns[i]) break;
      // 4. A third party must compute the extrinsic state (x and y)
      //    (the Button label is intrinsic state)
      System.out.println( "label-" + e.getActionCommand()
         + "  x-" + i/10   + "  y-" + i%10 );  // 1. Identify extrinsic state
}  }