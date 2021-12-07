import java.util.Scanner;

public class StrategyDesignPattern {
    private static Scanner scanner;

    public static void main( String[] args )
     {

     System.out.println("Mohon pilih ingin menonton film apa : 'Cemara' or 'Galaksi'");
     scanner = new Scanner(System.in);
     String TranslateType = scanner.next();

     Bahasa bahasa = null;
     bahasa = new Bahasa();

     if( "Cemara".equalsIgnoreCase(TranslateType) )
     {
        bahasa.setJudul(new Cemara());
     }
     else if("Galaksi".equalsIgnoreCase(TranslateType))
     {
        bahasa.setJudul(new Galaksi());
     }
     bahasa.useJudul();

        Maghfirah maghfirah = new Maghfirah();
        Indonesian indonesian = new David();
  
        Indonesian englishAdapter = new EnglishAdapter(maghfirah);

        System.out.print("Rating dari maghfirah:  ");
        maghfirah.say();
  
        System.out.print("Rating dari David    :  ");
        indonesian.berkata();
  
        // duck behaving like a cat 
        System.out.print("Rating               :  ");
        englishAdapter.berkata();
        
     }
     
}
