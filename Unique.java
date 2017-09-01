import java.util.*;
public class Unique
{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String []str1=str.split(",");
    for(int i=0;i<str1.length-1;i++)
    {
        if(str1[i]!=str1[i+1])
        {
          System.out.println(Integer.valueOf(str1[i]));
          break;
            }
        }
    }

}
