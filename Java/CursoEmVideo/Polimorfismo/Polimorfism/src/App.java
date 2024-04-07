public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir("Vai apanhar");
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(11,45);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(21,00);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(true);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(false);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(2, 12.5f);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");
        c.reagir(17, 4.5f);
        System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=");

    }
}
