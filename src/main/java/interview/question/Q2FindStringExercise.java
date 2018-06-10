package interview.question;

public class Q2FindStringExercise {

    public static int findStringInSeq(char[] seq, String string) {
        int retVal =0;
        if ( seq.length == 0 || string.length() == 0 ) {
            return retVal;
        }
        else if ( string.length() > seq.length) {
            return retVal;
        }
        else {
            int i=0;
            int j=0;

            while ( i < seq.length ) {
                if( seq[i] == string.charAt(j) ) {

                   i++;
                   j++;
                   if( j == string.length()) {
                      return i-string.length();
                   }
                }
                else {
                   i++;
                   j=0;
                }
            }
            //retVal = iPos;
        }
        return retVal;
    }

    public static void main(String[] args) {
        final char[] chars = new char[]{'t','t','a','a','c','a','a','a','t','a','t','t','t','c','c','c','a','t','t','c','t','a','t','a','c','a','a','c','c','t'};
        final String string = "cat";

        System.out.println(String.format("The string %s occurs at position %d", string, findStringInSeq(chars, string)));
    }
}
