// Guess the letter gane

class Power {
    public static void main(String agrs[]) 
        throws java.io.IOException {
            char ch, answer = 'K';
            do {
                System.out.println("I'm thinking of a letter between A and Z.");
                System.out.print("Can you guess it: ");
                // read a letter, but skip cr/lf
                do {
                    ch = (char) System.in.read(); // get a char
                } while(ch == '\n' | ch == '\r');
                
                if(ch == answer) System.out.println("** Right **");
                else {
                    System.out.print("...Sorry, you're ");
                    if(ch < answer) System.out.println("too low");
                    else System.out.println("too high");
                    System.out.println("Try again!\n");
                }
            } while(answer != ch);
        }
}
/* Here is why this loop is needed: As explained earlier, System.in is line buffered—you have to
press ENTER before characters are sent. Pressing ENTER causes a carriage return and a line feed
character to be generated. These characters are left pending in the input buffer. This loop
discards those characters by continuing to 
read input until neither is present.
*/



