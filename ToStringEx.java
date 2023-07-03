package Test;
class One
{
   String str = "welcome";

   public String toString() {
      return str;
   }
}

public class ToStringEx
{
   public static void main(String[] args)
   {
      One obj = new One();
      System.out.println(obj); 
   }
}