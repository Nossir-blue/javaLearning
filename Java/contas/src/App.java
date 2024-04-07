public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Nossir");
        p1.abrirConta('c');
        

        ContaBanco p2 =new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Simone");
        p2.abrirConta('P');

        p1.depositar(300f);
        p2.depositar(300f);
        p2.sacar(100f);

        p1.sacar(350f);
        p1.fecharConta();

        p1.estadoActual();
        p2.estadoActual();
    }
}
