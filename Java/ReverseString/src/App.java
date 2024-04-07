public class App {
    public static void main(String[] args) throws Exception {
        String r = reverse("Nossir");//1ª uma variável string r que recebe o método reverse que tem como parámetro "Nossir"
        System.out.println(r); //3º após retornar o valor reverse na função onde foi chamado, será impresso no SOUT
    }
    public static String reverse(String s) { //2ª método reverse que serve para meter strings de trás para frente com parámetro string s
        char[] letter = new char[s.length()]; //vetor letter do tipo char que é do tamanho do paramtro s
        int letterIndex = 0; //variável inteira inicializada com 0, vai servir para subscrever os dados no vetor letra
        for(int i = s.length()-1;i>=0;i--) //for loop com índice inicializado com o tamanho do vetor e -1 para eliminar casas extras, enquanto o índice for menor ou igual À zero, ele será decrementado
        {
            letter[letterIndex] = s.charAt(i); //o vetor letter na posição letterIndex(que foi inicializado com o) vai receber cada caractere na posição i
            letterIndex++; //incrementa o letterIndex
        }
        String reverse = ""; //variável string reverse vazia
        for(int i=0;i<s.length();i++) //loop para adicionar caracteres no reverse onde, i na posição 0, enquanto for menor que o tamanho do s, será incrementado
        {
            reverse = reverse + letter[i]; //reverse recebe reverso mais a letra na posição i
        }
        return reverse; //retorna o valor de reverso
    }
}
