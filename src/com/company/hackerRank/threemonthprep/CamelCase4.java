package com.company.hackerRank.threemonthprep;
// TODO: 9/24/2022 not working 
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
/* Enter your code here.
Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
method and variable names likeThis.
class names LikeThis.
methods must end with () unless split then () must be removed.
S or C split or combine followed by ;
M C or V method class variable followed by ;
if S make sure the first letter is lowercase and split at the camel               cased letter.
if C the words will be lowercase, space seperated and need to be                  combined with the second word capitalized.
Output must be exact (exact spaces and casing).
*/
        Scanner scanner = new Scanner(System.in);
        StringBuilder newFormatStr = new StringBuilder();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] cleanInput = input.split(";");

            String operator = cleanInput[0];
            String type = cleanInput[1];
            String strInput = cleanInput[2];

            // System.out.println(Arrays.toString(cleanInput));
            // System.out.println(operator);
            // System.out.println(type);
            // System.out.println(strInput);
            if (operator.equals("S")) {
                if (type.equals("V")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase() + " ");
                    }

                }

                if (type.equals("M")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase().replaceAll("[()]", "") + " ");
                    }

                }

                if (type.equals("C")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase() + " ");
                    }

                }


                // System.out.println("split at Upper and tolower this");
            }
//             System.out.println(newFormatStr);

            if (operator.equals("C")) {
                if (type.equals("V")) {
                    char[] chStrInput = strInput.toCharArray();
                    for (int i = 0; i < chStrInput.length; i++) {
                        if (i == 0) {
                            chStrInput[i] = Character.toLowerCase(chStrInput[i]);
                        }

                        if (chStrInput[i] == ' ') {
                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            String newVal = String.valueOf(chStrInput);
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
                        }
                    }


                }

                if (type.equals("M")) {
                    char[] chStrInput = strInput.toCharArray();
                    for (int i = 0; i < chStrInput.length; i++) {
                        if (i == 0) {
                            chStrInput[i] = Character.toLowerCase(chStrInput[i]);

                        }

                        if (chStrInput[i] == ' ') {
                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            String newVal = String.valueOf(chStrInput);
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
                            newFormatStr.append("()");
                            break;
                        }
                    }

                }

                if (type.equals("C")) {
                    char[] chStrInput = strInput.toCharArray();
                    for (int i = 0; i < chStrInput.length; i++) {
                        chStrInput[0] = Character.toUpperCase(chStrInput[0]);
                        if (chStrInput[i] == ' ') {

                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            String newVal = String.valueOf(chStrInput);
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
                            break;
                        }
                    }

                }



                // System.out.println("combine, if var camelCase, if class pascale, if method camelCase and add ()");
            }
//            System.out.println(newFormatStr);


            // System.out.println(input);

        }
        System.out.println(newFormatStr);
        scanner.close();

    }
//    S;V;iPad
//            C;M;mouse pad
//    C;C;code swarm
//
//    S;C;OrangeHighlighter
}
