package algorithms_2_1;

// Java implementation of ShellSort
class ShellSort1
{
    /* An utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /* function to sort arr using shellSort */
    int sort(int arr[])
    {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                System.out.println();
                printArray(arr);
                System.out.print("gap: " + gap + ", i: " + i + ", ");
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
                System.out.println("temp: " + temp);

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                {
                    arr[j] = arr[j - gap];
                    System.out.print("j: " + j + ", arr[j - gap]: " + arr[j - gap] + ", arr[j]: " + arr[j] + ", ");
                }

                System.out.println("j -> " + j);

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
                System.out.println();
            }
        }
        return 0;
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 34, 54, 2, 3, 53, 43, 21, 26};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSort1 ob = new ShellSort1();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
