package collection;
import java.util.*;
public class practicelist1 
{
       public static void main(String[] args)
       {
               ArrayList<Integer> list=new ArrayList<>(20);

               ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(50,60,70,80,90));
               list.add(10);
               list.add(0,5);
               list.addAll(1,list2);
               list.add(5,70);
               list.set(6,100);

      //         System.out.println(list.get(5));  // get the element of the list.
      //         System.out.println(list.contains(50));  // if that number is present or not.
               
                  
       //        System.out.println(list);
              for(Integer x:list)
              {
                     System.out.println(x);
              }
               
       // second approach for printing list       
              Iterator<Integer> it=list.iterator();
              while(it.hasNext())
              {
                     System.out.println(it.next());

              }
              System.out.println("---------------------");
       // list iterator
       // other method
       list.forEach(System.out::println);
       
       System.out.println("---------------------");
       // lambda method 
       list.forEach(n->show(n));

       }
       static void show(int n)
       {
              if(n>60)
              System.out.println(n);
       }
       
}
