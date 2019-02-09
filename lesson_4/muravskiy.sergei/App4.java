class App4
{  
    public static void main(String args[])
    {
        int Count=0;
        for(int i = 2; i>0; i*=2)
        { 
         Count+=1;
         if(Count==20) break;
         else System.out.println(i);
        }
    }
}