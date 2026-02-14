public class Arr_Q10 
{
    public static void main(String[] a)
    {
        //Program that reverses an array and stores it in the same array. 
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
