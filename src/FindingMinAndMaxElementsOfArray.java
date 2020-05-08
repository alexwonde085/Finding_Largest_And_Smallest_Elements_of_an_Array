public class FindingMinAndMaxElementsOfArray {
    /*
        Create and Initialize an array;
            Assign the first element is maximum
            Assign the first element is minimum
            For loop
                    loop through the array
                        If(arr[i]>max)
                            max = arr[i];
                        EndIF

                        If(arr[i]<min)
                            min=arr[i];
                        EndIF
            OutPut maxElement
            OutPut minElement
     */
    public static void main(String[] args) {
        int[]arr = {5,6,234,3,1,8,90};
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Largest Number in a given array is : " + max);
        System.out.println("Smallest Number in a given array is : " + min);
    }
}
