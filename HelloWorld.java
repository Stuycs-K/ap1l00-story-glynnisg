
  
  public class HelloWorld {

      public static void printHello(){
          System.out.println("Hello world!");
      }

      public static String returnHello(){
          return "Hello world!";
      }

      public static void main(String[] args){
          String s;
          
          //This line will print something
          printHello();
          
          //This line assigns the returned String to s.
          s = returnHello();
          //This line prints the String stored in s.
          System.out.println(s);
          
          //Note: These two lines are equivalent to : System.out.println(returnHello());
          
      }

  }