package hello;
class NumException extends Exception {
    public NumException(String str){
        super(str);
    }
}

class TryCatch {
    static void Check(int num) throws NumException{
    	 if(num<100){
            
    		 throw new NumException("ERROR : The number entered is less than 100.");
         }
         else{
             System.out.println("No Exception Found.");
         }
     }

    
    public static void main(String args[]){
        try {
            Check(11);
        }
        catch (NumException e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Reached To Finally Block!!");
        }

    }
}