public class CommandLine
{
    public static void main(String[] a)
    {
        int count = a.length;
        int temp = 0;
        
        for(int i = 0; i<count;i++)
        {
            temp+= Integer.parseInt(a[i]);
            System.out.println(temp);
        
        }

    }
}