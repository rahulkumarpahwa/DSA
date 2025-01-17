public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 7, 8, 9, 10 };
        QuickSortArray(a, 0, a.length - 1);
    }

    public static void QuickSortArray(int[] a, int low, int high) {
        int partitionIndex = Partition(a, low, high);
        QuickSortArray(a, low, partitionIndex - 1);
        QuickSortArray(a, partitionIndex - 1, high);

    }

    public static int Partition(int[] a, int low, int high){
        int i = low+1;
        int j = high;
        int pivot = a[low];
        int temp;
        do{
            while(a[i]<= pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }

            if(i<j){
                
            }
        } while (i<j);

    }
}
