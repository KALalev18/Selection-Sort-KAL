package Sort;
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            printArray(arr);
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
        System.out.println("");
    }
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {9,8,7,6,5,4,3,2,1};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}