import java.util.*;
import java.io.*;
public class Driver{
  public static void main(String[]args) throws Exception{
	  for (int i=2; i<=99; i++) {
		  String file = "makelake/makelake."+i;
		  if (USACO.bronze(file+".in")==new Scanner(new File(file+".out")).nextLong()) {
			  System.out.println("Pass case: "+file+".in");
		  }
		  else {
			  System.out.println("FAIL case: "+file+".in");
		  }
	  }
        }
}
