class App2
{  
    public static void main(String args[])
    {
        int Count=0;
        for(int i = 1; i>0; i+=3)
        { Count+=1;
         if(Count==55) break;
         else System.out.println(i);
        }
    }
}