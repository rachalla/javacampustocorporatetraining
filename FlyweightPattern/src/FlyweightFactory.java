
// Purpose.  Flyweight design pattern

// 1. Identify shareable state (intrinsic) and non-shareable state (extrinsic)
// 2. Create a Factory that can return an existing object or a new object
// 3. The client must use the Factory instead of "new" to request objects
// 4. The client (or a third party) must compute the extrinsic state

import java.awt.*;
import java.awt.event.*;

public class FlyweightFactory {
   private static java.util.Hashtable ht = new java.util.Hashtable();
   private static ButtonListener bl = new ButtonListener();
   public static Button makeButton( String num ) {
      if (ht.containsValue( num ))
         return (Button) ht.get( num );        // 2. Return an existing object
      Button btn = new Button( num );          // 1. Identify intrinsic state
      btn.addActionListener( bl );
      ht.put( num, btn );
      return btn;                              // 2. Return a new object
   }
   public static void report() {
      System.out.print( "size=" + ht.size() + "   " );
      for (java.util.Enumeration e = ht.keys(); e.hasMoreElements(); )
         System.out.print( e.nextElement() + " " );
      System.out.println();
}  }
