package collection;

class MyArray<T>
{
       T A[]=(T[]) new Object[10];
       int length =0;
       
       public void append(T v)
       {
              A[length++]=v;
       }
       public void display()
       {
              for(int i=0;i<length;i++)
              {
                     System.out.println(A[i]);
              }
       }
}
public class genericexp2 {
       public static void main(String[] args)
       {
              MyArray<String> ma=new MyArray<>();

              ma.append("hi");
              ma.append("bye");
              ma.append("tata");

              ma.display();

       }
}