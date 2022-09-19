import java.util.Scanner;
/**
 * Takes the users name, date, nouns, adjectives , adverbs, etc and uses in a madlib
 *
 * @author Gracie Gabel
 * @9/16/22
 */
public class madLibs
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        
        System.out.print("Enter the month in a integer: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Enter the day in a integer: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("Enter the year in a integer: ");
        int year = input.nextInt();
        input.nextLine();
        
        
        
        
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
        
        
        System.out.print("Enter a noun: ");
        String secondNoun = input.nextLine();
        
        
        System.out.print("Enter a noun: ");
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
        
        System.out.println();
        System.out.println(name+ " "+ month+"/"+day+"/"+year);
        System.out.println("Today I went to the zoo. I saw a "+firstAdj+" "+ firstNoun+" jumping up and down in its tree. He "+verbPast+" "+ firstAdverb+" through the large tunnel that led to its "+ secondAdj+ " "+ secondNoun+".");
        System.out.println("I got some peanuts and passed them through the cage to a gigantic gray "+thirdNoun+" towering above my head."); 
        System.out.println("Feeding that animal made me hungry. I went to get a "+thirdAdj+" scoop of ice cream. It filled my stomach."); 
        System.out.print("Afterwards I had to "+ secondVerb+" "+ secondAdverb+" to catch our bus. When I got home I "+verbSecondpast+" my mom for a "+fourthAdj+" day at the zoo.");
        
    
    
    }
}
