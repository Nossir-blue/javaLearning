public class Caneta 
{
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
    //Getters, Setters and Constructors
    public Caneta(String m, String c, float p)
    {
        setModelo(m);
        setCor(c);
        setPonta(p);
        tampar();
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    public float getPonta()
    {
        return this.ponta;
    }
    public void setPonta(float p)
    {
        this.ponta = p;
    }
    public String getCor()
    {
        return this.cor;
    }
    public void setCor(String c)
    {
        this.cor = c;
    }
    //--------------------------
    public void status()
    {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
