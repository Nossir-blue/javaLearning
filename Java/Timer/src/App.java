public class App
{
    public static void main(String[] args) throws Exception
    {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        System.out.println("\n");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.destampar();

        c2.status();
        c2.rabiscar();
    }
}
