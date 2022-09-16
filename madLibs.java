import java.util.Scanner;
/**
 * Write a description of class madLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class madLibs
{
    public void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        input.nextLine();
        System.out.println(name);//name
        
        System.out.print("Enter the date: ");
        String date = input.nextLine();
        input.nextLine();
        System.out.println(date);//date
        
        System.out.println("Enter a adjevtive: ");
        String firstAdj = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter an noun: ");
        String firstNoun = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a verb: ");
        String firstVerb = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a verb past tense: ");
        String verbPast = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a adverb: ");
        String firstAdverb = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a adjevtive: ");
        String secondAdj = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter the noun: ");
        String thirdNoun = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter the noun: ");
        String fourthNoun = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a adjective: ");
        String thirdAdj = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a verb: ");
        String secondVerb = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a adverb: ");
        String secondAdverb = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a verb past tense: ");
        String verbSecondpast = input.nextLine();
        input.nextLine();
        
        System.out.println("Enter a adjective: ");
        String fourthAdj = input.nextLine();
        input.nextLine();
        
        System.out.print("Today I went to the zoo. I saw a "+firstAdj+ firstNoun);
        
        
    
    
    }
}
