import java.io.*;
class strfun
{
    public static void main(String a[]) throws IOException
    {
        String s;
        int v = 0, c = 0, w = 1, i;
        char ch;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("\tCounting Vowels, Consonants & Words");
        System.out.println("\t**********************************");
        System.out.println("Given sentence:");
        s = d.readLine();
        for (i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                v++;
            else if (Character.isLetter(ch))
                c++;
            else if (Character.isSpace(ch))
                w++;
        }
        System.out.println("\n\tNumber of vowels = " + v);
        System.out.println("\tNumber of consonants = " + c);
        System.out.println("\tNumber of words = " + w);
    }
}