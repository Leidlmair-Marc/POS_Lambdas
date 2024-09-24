package htl.grieskirchen.POS.Task3;

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
}
