import java.util.Random;
import java.util.Scanner;

public class Arena extends Hra{

    public String souboj(Hrac hrac) {
        Souper souper = new Souper("Jakub", 5, 0,20, 15, 5, 10);
        System.out.println("Nyní začíná souboj na život a na smrt");
        System.out.println("Bojují proti sobě "+hrac.getJmeno()+" a "+souper.getJmeno());
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String vyherce="";
        int hracZivoty=hrac.getZivoty();
        while (hracZivoty>0 || souper.getZivoty()>0){
            int coinflip=random.nextInt(2)+1;
            System.out.println("Tipni si stranu mince:");
            System.out.println("1.)Panna");
            System.out.println("2.)Orel");
            int vyberStrany = scanner.nextInt();
            if (vyberStrany==coinflip){
                System.out.println("Uhádl jsi správně hlupáku, teď zaútoč🥵");
                souper.setZivoty(souper.getZivoty()-hrac.utok());
                System.out.println("Aktuální životy soupeře: "+souper.getZivoty());
                if (souper.getZivoty()<0){
                    vyherce="Výherce je:"+hrac.getJmeno();
                    break;
                }
            }
            else {
                System.out.println("Jseš trouba, teď umřeš");
                hracZivoty=hrac.getZivoty()-souper.utok();
                System.out.println("Aktuální životy hráče: "+hracZivoty);
                if (hracZivoty<0){
                    vyherce="Výherce je:"+souper.getJmeno();
                    break;

                }
            }

        }
        return vyherce;
    }
}
