public class VariableChangeShortcuts
  {
      public static void main( String[] args )
      {
          int i, j, k;
  
          i = 5;
          j = 5;
          k = 5;
 
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
         i =  i + 3;
         j =  j - 3;
         k =  k * 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k ); 
         i = 5;
         j = 5;
         k = 5;
 
         System.out.println( "\ni: " + i + "\tj: " + j + "\tk: " + k );
         i += 3;
         j -= 3;
         k *= 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
 
         i = j = k = 5;
 
         System.out.println( "\ni: " + i + "\tj: " + j + "\tk: " + k );
         i += 1;
         j -= 2;
         k *= 3;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
 
         i = j = k = 5;
 
         System.out.println( "\ni: " + i + "\tj: " + j + "\tk: " + k );
         i =+ 1;
         j =- 2;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
 
         i = j = k = 5;
 
         System.out.println( "\ni: " + i + "\tj: " + j + "\tk: " + k );
         i++;
         j--;
         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
	}
}