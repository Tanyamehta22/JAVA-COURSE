// CREATION OF MUTLIDIMENTIONAL ARRAY IN JAVA---

public class Hello
{
    pubic static void main(String a[])
    {
        int nums[][] = new int[3][4];
         

   
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                 nums[i][j] = (int)(Math.random() *10);
                 System.outprintln(nums[i][j]);
            }
            
        }

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
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

 