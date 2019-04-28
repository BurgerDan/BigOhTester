/*
    CSC 325 Assignment 2
    Danny Young
    Growth function - f(n) = 4 + n(5)
    Big Oh          - O(n)
*/
public class NumFind 
{
    public static int findNum(int[] array)
    {
        int top = array[0];
        
        for(int item : array)
        {
            if(top < item)
            {
                top = item;
            }
        }
        return top;
    }
}
