public class LinearSearch {
    static int linearSearch(int n, int[] list)
    {
        int index = -1;
        for(int i = 0; i<=list.length;i++)
        {
            if(list[i].equals(n))
            {
                index = n;
                break;
            }
        }
        return index;
    }
}
