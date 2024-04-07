public class factorial {
    static int Factorial(int f)
    {
        //o método recebe o valor do parâmetro
        //factorial é o produto de todos os números inteiros menores ou iguais a n, 4 = 4x3x2x1 = 24
        //f(x) = x * x-1 * x-2 * ...* x-n
        int product = f;
        int i = f-1;
        while(i>0)
        {
            product *= i;
            i--;
        }


        return product;
    }
}
