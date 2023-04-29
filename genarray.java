package collection;

public class genarray {
     public static void main(String[] args)
     {
       Object obj[]=new Object[3];

        obj[0]="hi";
        obj[1]="bye";
        obj[2]=new Integer[10]; // this will cause an error because string cannot be converted in int.

        String str;
        for(int i=0;i<3;i++)
        {
              str=(String)obj[i];
              System.out.println(str);
        }
     }      
}
