import java.io.*;
class Prime implements Runnable
{
     public void run()
    {
        int no;
        for(no=2;no<=1000;no++)
        {
            int cnt=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0)
                System.out.println(no+" Number is prime");
        }
    }
}

        
class q62
{
    public static void main(String args[])
    {

       
     
        try
        {
           
           
            Prime p1=new Prime();
             Thread t1=new Thread(p1);
            t1.start();
            
        }
        catch(Exception e1){}
    }
}
