public static void howOdd() {
 Scanner ape = new Scanner(System.in);
 System.out.println("Type a number, then press enter.");
 int input = ape.nextInt( );
 int sum = 0;

 System.out.println("You entered " + input);
 for( int i = 0; i < input; i = i + 1) {
 System.out.println((i + (i + 1)));
 sum += i;
 }
 }
Submission 
