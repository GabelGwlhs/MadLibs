import java.util.Scanner;
/**
 * Write a description of class madLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class madLibs
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        
        System.out.print("Enter the date: ");
        String date = input.nextLine();
        
        
        System.out.print("Enter a adjevtive: ");
        String firstAdj = input.nextLine();
        
        
        System.out.print("Enter an noun: ");
        String firstNoun = input.nextLine();
       
        
        System.out.print("Enter a verb past tense: ");
        String verbPast = input.nextLine();
        
        
        System.out.print("Enter a adverb: ");
        String firstAdverb = input.nextLine();
        
        
        System.out.print("Enter a adjevtive: ");
        String secondAdj = input.nextLine();
        
        
        System.out.print("Enter the noun: ");
        String secondNoun = input.nextLine();
        
        
        System.out.print("Enter the noun: ");
        String thirdNoun = input.nextLine();
        
        
        System.out.print("Enter a adjective: ");
        String thirdAdj = input.nextLine();
        
        
        System.out.print("Enter a verb: ");
        String secondVerb = input.nextLine();
        
    
        System.out.print("Enter a adverb: ");
        String secondAdverb = input.nextLine();
        
        
        System.out.print("Enter a verb past tense: ");
        String verbSecondpast = input.nextLine();
        
        
        System.out.print("Enter a adjective: ");
        String fourthAdj = input.nextLine();
        
        
        System.out.println("Today I went to the zoo. I saw a "+firstAdj+" "+ firstNoun+" jumping up and down in its tree. He "+verbPast+" "+ firstAdverb+" through the large tunnel that led to its "+ secondAdj+ " "+ secondNoun+".");
        System.out.println("I got some peanuts and passed them through the cage to a gigantic gray "+thirdNoun+" towering above my head. Feeding that animal made me hungry. I went to get a "+thirdAdj+" scoop of ice cream. It filled my stomach. Afterwards I had to "+ secondVerb+" "+ secondAdverb+" to catch our bus. When I got home I "+verbSecondpast+" my mom for a "+fourthAdj+" day at the zoo.");
        
    
    
    }
}