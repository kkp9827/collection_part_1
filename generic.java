
public class generic {
       
       public static void main(String[] args)
       {
          Object obj= new String("Hello");
          obj= new Integer(10);  
          
          String str=(String)obj;
       }
}
// conclusion from this demonstration
// 1 . if u have reference of object you can assign object of any type. or any class.
// 2 . when u have to get in actual reference u have to do type casting.