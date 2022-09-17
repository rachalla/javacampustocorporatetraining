import java.awt.*;
import java.awt.event.*;

public class FlyweightDemo {
   public static void main( String[] args ) {
      Frame frame = new Frame( "Flyweight Demo" );
      frame.setLayout( new GridLayout( 10, 10 ) );
      for (int i=0; i < 10; i++)
         for (int j=0; j < 10; j++)
            // 3. The client must use the Factory to request objects
            frame.add( FlyweightFactory.makeButton( 
               Integer.toString( (int)(Math.random()*25) ) ) );
      frame.pack();
      frame.setVisible( true );
      FlyweightFactory.report();
}  }

// size=25   24 23 22 21 20 19 18 17 16 9 15 8 14 13 7 12 6 5 11 10 4 3 2 1 0
// label-23  x-0  y-0
// label-7  x-0  y-1
// label-21  x-1  y-1
// label-21  x-4  y-6
// label-7  x-9  y-9