package htl.grieskirchen.POS.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester{

    private NumberTest oddTester;
    private NumberTest palindromeTester;
    private NumberTest primeTester;
    private final String fileName;

    public NumberTester(String fileName){this.fileName = fileName;}

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }
    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        for (int[] i : readFile()) {
            switch (i[0]) {
                case 1:
                    System.out.println(oddTester.testNumber(i[1]) ? "EVEN" : "ODD");
                    break;
                case 2:
                    System.out.println(primeTester.testNumber(i[1]) ? "PRIME" : "NOT PRIME");
                    break;
                case 3:
                    System.out.println(palindromeTester.testNumber(i[1]) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
    }

    public int[][] readFile() {
        int[][] testCases = null;
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(fileName));
            testCases = new int[Integer.parseInt(in.readLine())][2];

            for (int i = 0; in.ready(); i++) {
                String[] line = in.readLine().split(" ");
                testCases[i][0] = Integer.parseInt(line[0]);
                testCases[i][1] = Integer.parseInt(line[1]);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testCases;
    }
}
