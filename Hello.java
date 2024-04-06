// CREATION OF MUTLIDIMENTIONAL ARRAY IN JAVA---

public class Hello
{
    pubic static void main(String a[])
    {
        int nums[][][] = new int[3][4][5];  //THIS IS CALLED 3 dimentional ARRAY

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
         

   
        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                 nums[i][j] = (int)(Math.random() *10);
                  
            }
            
        }

         
      

        //WE CAN ALSO USE ENHANCE FOR LOOP TO PRINT ARRAY--

        // for (int n[] : nums)
        // {
        //     for(int m:n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.outprintln();
        // }
    }
}

 