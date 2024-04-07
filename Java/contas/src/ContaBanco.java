public class ContaBanco
{
    public int numConta;
    protected char tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoActual()
    {
        System.out.println("----------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirConta(char tipo)
    {
        this.setTipo(tipo);
        this.setStatus(true);
        if(this.getTipo() == 'C' || this.getTipo() == 'c')
        {
            this.setSaldo(50f);
        }
        else if(this.getTipo() == 'P' || this.getTipo() == 'p')
        {
            this.setSaldo(150f);
        }
    }
    public void fecharConta()
    {
        if(this.getSaldo() < 0)
        {
            System.out.println("Por favor, pague as suas dívidas.");
        }
        else if(this.getSaldo() > 0)
        {
            System.out.println("Por favor, retire todo o dinheiro da sua conta");
        }
        else
            {this.setStatus(false);
            System.out.println("Conta Fechada");}
    }
    public void depositar(float valor)
    {
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta: "+this.getDono());
        }
        else
            System.out.println("Impossível depositar");
    }
    public void sacar(float sacar)
    {
        if(this.getStatus())
        {
            if(this.getSaldo()>0)
            {
                this.setSaldo(this.getSaldo() - sacar);
                System.out.println("Um saque foi realizado na conta: "+this.getDono());
            }
            else
                System.out.println("Saldo insuficiente");
        }
        else
            System.out.println("A conta não está aberta\nImpossível Sacar");
    }
    public void pagarMensal()
    {
        float valor = 0;
        if(this.getTipo()=='C'||this.getTipo()=='c')
        {
            valor = 12f;
        }
        else if(this.getTipo()=='P'||this.getTipo()=='p')
        {
            valor = 20f;
        }
        if(this.getStatus())
        {
            if(this.getSaldo() > valor)
            {
                this.setSaldo(this.getSaldo() - valor);
            }
            else
                System.out.println("Saldo insuficiente");
        }
        else
            System.out.println("Impossível pagar");
    }
    public void status()
    {
        this.getStatus();
    }
    //Getters,Setters,Constructors
    public ContaBanco()
    {
        this.setStatus(false);
        this.setSaldo(0);
    }
    public int getNumConta()
    {
        return this.numConta;
    }
    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }
    public char getTipo()
    {
        return this.tipo;
    }
    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }
    public String getDono()
    {
        return this.dono;
    }
    public void setDono(String dono)
    {
        this.dono = dono;
    }
    public float getSaldo()
    {
        return this.saldo;
    }
    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    public boolean getStatus()
    {
        return this.status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
}