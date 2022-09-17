
public class BridgePattern {
	   public static void main( String[] args ) {
		      Stack[] stacks = { new Stack("java"), new Stack("mine"), 
		         new StackHanoi("java"), new StackHanoi("mine") };
		      for (int i=0, num; i < 20; i++) {
		         num = (int) (Math.random() * 1000) % 40;
		         for (int j=0; j < stacks.length; j++) stacks[j].push( num );
		      }
		      for (int i=0, num; i < stacks.length; i++) {
		         while ( ! stacks[i].isEmpty())
		            System.out.print( stacks[i].pop() + "  " );
		         System.out.println();
		      }
		      System.out.println( "total rejected is "
		         + ((StackHanoi)stacks[3]).reportRejected() );
		}  }

		// 30  3  6  10  0  14  23  39  2  5  30  20  13  31  9  4  30  11  15  36
		// 30  3  6  10  0  14  23  39  2  5  30  20  13  31  9  4  30  11  15  36
		// 0  2  4  11  15  36
		// 0  2  4  11  15  36
		// total rejected is 14