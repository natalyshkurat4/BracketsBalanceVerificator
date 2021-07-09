import java.util.Scanner;

public class BalanceVerificator {

    public static void main(String[] args) {
        BalanceVerificator n = new BalanceVerificator();
        n.balanceVerificator();
    }

    String bracketsStr;
    boolean mark;

    public void balanceVerificator() {

        Scanner in = new Scanner(System.in);

        /* Data check. Data string shouldn't be null*/

        boolean flag = false;

           while (flag == false) {
               bracketsStr = in.nextLine();
               if (bracketsStr == null || bracketsStr.length() == 0) {
                   System.out.println("Put a string of brackets");
                   flag = false;
               } else {
                   flag = true;
               }
               flag = flag;
           }

           char[] bracketsArray = bracketsStr.toCharArray();

        /* Data check. Data string should have only brackets */

            for (int i = 0; i < bracketsArray.length; i++) {
                if (bracketsArray[i] != '}' & bracketsArray[i] != '{' & bracketsArray[i] != '(' & bracketsArray[i] != ')' &
                        bracketsArray[i] != '[' & bracketsArray[i] != ']') {
                    System.out.println("Put brackets only");
                   balanceVerificator();
                  break;
                }
          }

        /* Checking a right pair for a left bracket. The sequences is { {, }, (, ), [, ] }.
        If not find return NOT BALANCED(i). "i" is a number of symbol in the input string (from 0).
         The subset of brackets enclosed within the confines of a matched pair of brackets is
        also a matched pair of brackets. if all of brackets matched with own pair return BALANCED(-1) */

            boolean mark = false;

            for (int i = 0; i < bracketsArray.length ; i++) {
                int j = bracketsArray.length - i - 1;

                switch (bracketsArray[i]) {

                    case '{':
                        if (bracketsArray[j] == '}') {
                            mark = false;
                            break;
                        }
                            mark = true;
                            break;

                    case '(':
                        if (bracketsArray[j] == ')') {
                            mark=false;
                            break;
                        }
                            mark = true;
                            break;

                    case '[':
                        if (bracketsArray[j] == ']') {
                            mark = false;
                            break;
                        }
                            mark = true;
                            break;

                    default:
                            break;
                }
                mark = mark;
                if (mark == true) {
                    System.out.println("NOT BALANCED" + "(" + i + ")");
                    break;
                }
            } if (mark == false) {
            System.out.println("BALANCED (-1)");
          }
    }
    }






