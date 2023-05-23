import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hrac extends Arena{
    private String jmeno;
    private int level;
    private  int xp;
    private int zivoty;
    private int sila;
    private int krit;
    private int odolnost;

    public  int utok(){
        int poskozeni;
        if(kritickyZasah()==true){
            poskozeni=sila*2;
        }
        else {
            poskozeni=sila;
        }
        return poskozeni;
    }
    public boolean kritickyZasah(){
        boolean kritickyZasah=false;
        Random random = new Random();
        if (random.nextInt()<krit){
            kritickyZasah=true;
        }
        return kritickyZasah;
    }

    public int levelUp(){
        level=level+1;
        System.out.println("Dosáhl jste levelu "+level+", nyní si vyberte atribut k vylepšení:");
        System.out.println("1.) Životy");
        System.out.println("2.) Poškození");
        System.out.println("3.) Krit");
        System.out.println("4.) Odolnost");
        boolean opakovani =true;
        while (opakovani){
            try {
                Scanner scanner = new Scanner(System.in);
                int vyberUzivatele = scanner.nextInt();
                switch (vyberUzivatele){
                    case 1: zivoty=zivoty+30;
                        break;
                    case 2:
                        sila = sila +10;
                        break;
                    case 3: krit=krit+5;
                        break;
                    case 4: odolnost=odolnost+5;
                }
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Zadejte prosím číslo");
            }
            opakovani=false;
        }
        return level;
    }

    @Override
    public String toString() {
        return "Hrac{" +
                "jmeno='" + jmeno + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                ", zivoty=" + zivoty +
                ", poskozeni=" + sila +
                ", krit=" + krit +
                ", odolnost=" + odolnost +
                '}';
    }

    public Hrac(String jmeno, int level, int xp, int zivoty, int sila, int krit, int odolnost) {
        this.jmeno = jmeno;
        this.level = level;
        this.xp = xp;
        this.zivoty = zivoty;
        this.sila = sila;
        this.krit = krit;
        this.odolnost = odolnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getKrit() {
        return krit;
    }

    public void setKrit(int krit) {
        this.krit = krit;
    }

    public int getOdolnost() {
        return odolnost;
    }

    public void setOdolnost(int odolnost) {
        this.odolnost = odolnost;
    }
}
