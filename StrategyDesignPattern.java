import java.util.Scanner;

public class StrategyDesignPattern {
    private static Scanner scanner;

    public static void main( String[] args )
     {

     System.out.println("Mohon pilih ingin menonton film apa : 'Cemara' or 'Galaksi'");
     scanner = new Scanner(System.in);
     String TranslateType = scanner.next();

     Film film = null;
     film = new Film();

     if( "Cemara".equalsIgnoreCase(TranslateType) )
     {
      film.setBintang(new Cemara());
     }
     else if("Galaksi".equalsIgnoreCase(TranslateType))
     {
      film.setBintang(new Galaksi());
     }
     film.useBintang();

        Maghfirah maghfirah = new Maghfirah();
        Nonton nonton = new David();
  
        Nonton englishAdapter = new RatingAdapter(maghfirah);

        System.out.print("Rating dari maghfirah:  ");
        maghfirah.say();
  
        System.out.print("Rating dari David    :  ");
        nonton.berkata();
  
        System.out.print("Rating               :  ");
        englishAdapter.berkata();
        
     }
     
}
