public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void rabiscar()
    {
        if(this.tampada)
        {
            System.out.println("Erro");
        }
        else
            System.out.println("Rabisco");
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
    void status()
    {
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? \nTampada: "+this.tampada);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Modelo: "+this.modelo);
    }
}