package BaseLayer;

public class Swapping {

	public static void main(String[] args) {
   int a[]= {1,2,3,4,5};
   int b[]= {6,7,8,9,10};
   
   int temp[]=a;
           a=b;
           b=temp;
           
          System.out.println("After Swapping");
          System.out.print("a={");
          for(int i=0;i<a.length;i++) {
        	     System.out.print(a[i]+",");
          }
          System.out.println("}");
          System.out.println();
          System.out.print("b={");
          for(int j=0;j<b.length;j++) {
        	  System.out.print(b[j]+",");
          }
           System.out.println("}");
           
    		  
	}

}
