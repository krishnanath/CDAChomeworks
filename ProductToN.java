public class ProductToN
 {
    
    public static void main(String[] args) {
        
        int lowerBound = 1;
        int upperBound = 10;
        int product = 1;
        
        for (lowerBound = 1; lowerBound <= upperBound; lowerBound++) // product from 1 to 10
             {
                 product = product*lowerBound;
             }
            
        System.out.println("Product: " + product);
        
         
    }



 }









 // for (lowerBound = 1; lowerBound <= (upperBound+1); lowerBound++) // product from 1 to 11
        //      {
        //          product = product*lowerBound;
        //      }
            
        // System.out.println("Product2: " + product);
        
        // for (lowerBound = 1; lowerBound <= (upperBound+2); lowerBound++)// product from 1 to 12
        //      {
        //          product = product*lowerBound;
        //      }
            
        // System.out.println("Product3: " + product);
        
        // for (lowerBound = 1; lowerBound <= (upperBound+3); lowerBound++)// product from 1 to 13
        //      {
        //          product = product*lowerBound;
        //      }
            
        // System.out.println("Product4: " + product);