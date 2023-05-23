public class Main {
    public static void main(String[] args) {
        Hrac hrac = new Hrac("Honza",9, 99, 200,15,50, 100);
        Hra hra = new Hra();
        System.out.println(hra.zacatek(hrac));

    }
}