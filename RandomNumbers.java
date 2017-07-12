public class RandomNumbers {
	public static void main( String [] args ) {
		int a, b, c, d;
		double r, rps;
		
		rps = Math.random();
		if ( rps < 0.3333333 ) {
			System.out.println( "Rock" );
		}
		else if ( rps < 0.666667 ) {
			System.out.println( "Paper" );
		}
		else {
			System.out.println( "Scissors" );
		}
		
		//pick 4 random num
		a = 1 + (int)( 10*Math.random() );
		b = 1 + (int)( 10*Math.random() );
		c = 1 + (int)( 10*Math.random() );
		d = 1 + (int)( 10*Math.random() );
		System.out.println( "1-10: \t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		//pick 4 random num
		a = 1 + (int)(6*Math.random() );
		b = 1 + (int)(6*Math.random() );
		c = 1 + (int)(6*Math.random() );
		d = 1 + (int)(6*Math.random() );
		System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );
	
		//pick 1 num
		a = 1 + (int)( 100*Math.random() );
		System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a );
		
		// pick four random integers, each 1-100
a = 1 + (int)( 100*Math.random() );
b = 1 + (int)( 100*Math.random() );
c = 1 + (int)( 100*Math.random() );
d = 1 + (int)( 100*Math.random() );
System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );
// pick four random integers, each 0-99
a = 0 + (int)( 100*Math.random() );
b = 0 + (int)( 100*Math.random() );
c = (int)( 100*Math.random() );
d = (int)( 100*Math.random() );
System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d );
// pick four random integers, each 10-20
a = 10 + (int)( 11*Math.random() );
b = 10 + (int)( 11*Math.random() );
c = 10 + (int)( 11*Math.random() );
d = 10 + (int)( 11*Math.random() );
System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );
}
}
