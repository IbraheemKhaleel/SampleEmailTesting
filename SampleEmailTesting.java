import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailTesting
{
    public void emailValidation()
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter any email ");
        String email = input.nextLine();
        String regex = "^(?!\\.)(?!.*\\.$)(?!.*?\\.\\.)[a-zA-Z0-9_.+]+[a-zA-Z0-9+_][@][a-z0-9]+[.][a-z]{2,}$" ;
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(email);
        System.out.println(email + "  " + match.matches());
        input.close();
    }
    public static void main(String[] args)
    {
    	System.out.println(" Welcome to sample email testing program ");
        SampleEmailTesting sampleEmailTesting = new SampleEmailTesting();
        sampleEmailTesting.emailValidation();
    }
}
