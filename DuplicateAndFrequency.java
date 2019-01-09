import java.util.Scanner;
public class Pattern {
    
    static void duplicate1(String s)
    {
        char[] array = s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char character = array[i];
            for(int j=0;j<s.length();j++)
            {
            if(character == array[j])
            {
                count++;
                array[j]='*';
            }
            }
            if(count>1 && character!='*')                
            {
                System.out.println(character + " -> " +count);
                
            }
            count = 0;
        }
         for(int j=0;j<s.length();j++)
             System.out.print(array[j]);
    }
    
    
    
    static void duplicate(String s)
    {
        char[] array = s.toCharArray();
        int[] value = new int[52];
        for(int i=0;i<52;i++)
        {
            value[i]=0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(array[i]>=97 && array[i]< 123)
            {
                value[array[i]-97] +=1;
            }
            if(array[i]>=65 && array[i]< 90)
            {
                value[array[i]-39] +=1;
            }
        }
        for(int i=0;i<52;i++)
        {
         char character;   
        
            if(value[i]>1)
            {
               if(i<26)
               {          
                character = (char)(i+97);
               }
               else
               {
                character = (char)(i+39);
               }
              
                System.out.println(character+" -> "+value[i]);
              
        }
    }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       // duplicate(s);
        duplicate1(s);
                   
}
}
