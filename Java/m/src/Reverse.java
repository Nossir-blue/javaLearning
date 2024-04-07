public class Reverse {
    static String reverse(String s)
    {
        char[] letter = new char[s.length()];
        int letterIndex = 0;
        
        for(int i = s.length()-1; i>=0;i--)
        {
            letter[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String reverse = "";
        for(int i=0;i<s.length();i++)
        {
            reverse += letter[i];
        }
        return reverse;

    }
}
