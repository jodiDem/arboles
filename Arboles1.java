
public class Arboles1
{
   int [] arr  = new int [150];
   int [] list = {15,17,20,14,19,8,18,21,9,7,15,13};
       public static void main (String [] args)
   {
       Arboles1 obj = new Arboles1();
       obj.fill();
       
       obj.runInOrder(0);
       obj.runInPreOrder(0);
       obj.runInPostOrder(0);
       
   }
   public void fill()
   {
       for (int i = 0; i < list.length; i++)
       {
              if(arr[0] == 0)
                {
                  arr[0] = list[i];
                }
          
              else if (list[i] < arr[0] )
              {     
                  if (arr[0 * 2 + 1] == 0)
                  {
                      arr[0 * 2 + 1] = list[i];
                  }
              }
              else if (list[i] > arr[0])
              {
                  if (arr[0 * 2 + 2] == 0)
                  {
                   arr[0 * 2 + 2] = list[i];
                }
               }
            
          
       }
       for  (int i = 0; i < arr.length; i++)
       {
           System.out.print(arr[i] + ",");
        }
    }
   public void runInOrder(int p)//left,print,right
   {
     if (arr[p]!=0)
     {
         runInOrder(p*2+1);
         System.out.print(arr[p] + ",");
         runInOrder(p*2+2);
        }
    }
    public void runInPreOrder(int p)//print,left,right
   {
     if (arr[p]!=0)
     {
         System.out.print(arr[p] + ",");
         runInPreOrder(p*2+1);        
         runInPreOrder(p*2+2);
        }
    }
   public void runInPostOrder(int p)//left,right,print
    {
        if (arr[p]!=0)
        { 
         runInPostOrder(p*2+1);        
         runInPostOrder(p*2+2);
         System.out.print(arr[p] + ",");
        }
    }
}
