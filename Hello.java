// CREATION OF ARRAY IN JAVA---

public class Hello
{
    public static void main(String a[])
    {
        // int nums[] = {3,7,2,4};
        int nums[] = new int[4]; //another way to declare array
        nums[0]=6;
        nums[1]=3;
        nums[2]=4;
        nums[3]=5;

        for (int i =0; i<4; i++)
        {
            System.out.println(nums[i]);
        }
        
       
    }

}