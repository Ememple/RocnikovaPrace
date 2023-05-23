import java.util.Scanner;

public class Hra {
    public String zacatek(Hrac hrac){
        boolean vyberJmena=true;
        while (vyberJmena) {
            System.out.println("Zadejte prosím jméno:");
            Scanner scanner = new Scanner(System.in);
            String jmeno = scanner.nextLine();
            hrac.setJmeno(jmeno);
            System.out.println("Vaše jméno je:" + jmeno);
            System.out.println("1.) Pokračovat");
            System.out.println("2.) Změnit jméno");
            int vyber=scanner.nextInt();
            if (vyber==1){
                vyberJmena=false;
            }
            else if (vyber==2){
                vyberJmena=true;
            }
            else {
                System.out.println("Jste hloupý a neumíte číst, protože jinak by jste věděli, žě máte zadat buď 1 nebo 2 :)");
                }
            }
            System.out.println("Něco něco, jseš hloupej a zkončil jsi v aréně, musíš se odtud vybojovat pryč aby jsi získal zpátky svou svobodu");
            System.out.println();

            Arena arena = new Arena();
            if (arena.souboj(hrac).equals("Výherce je:"+hrac.getJmeno())){
                System.out.println(hrac.levelUp());;
            }


        return "";
    }
}
