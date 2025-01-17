class Livro implements Publicacao{

    //Atributos

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    // special methods 

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public Boolean getAberto() {
        return aberto;
    }
    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // normal methods
    public String detalhes(){
        return "Livro{\n"+"titulo="+titulo+"\n, autor="+autor+"\n, totPaginas="+totPaginas+"\n, pagAtual="+pagAtual+"\n, aberto="+aberto+"\n, leitor="+leitor.getNome()+"\n, idade="+leitor.getIdade()+"\n, leitor="+leitor.getSexo()+'}';
    }
    // using interface
    
    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar() {
        this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        if(p>this.totPaginas){
            this.pagAtual = 0;
        } else{
            this.pagAtual = p;
        }
        
    }
    @Override
    public void avançarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}