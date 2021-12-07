package lecture.paper;

 class tellcall {
     int pho;
     String sname;
     int n;
     int amt;

     public tellcall()
     {

     }
     public tellcall(int a,String a2,int a3,int a4)
     {
       pho=a;
       sname=a2;
       n=a3;
       amt=a4;
     }
    void compute()
     {
         if(n>1 && n<100)
         {
             amt= 100;
         }
         else if(n>100 && n<200)
         {
             amt= 200;
         }
         else if(n>200 && n<300)
         {
             amt=300;
         }


     }
     void display()
     {
        System.out.println("phone number is " +pho+" Name is " +sname+"number of calls  " +n+"amount is " +amt);
     }
}
public class question{
    public static void main(String[] args)

    {
        tellcall q=new tellcall(5,"Arpit",4,2);
       q.compute();
        q.display();

    }
}
