public class Sorter {
    public void printArray(String name, int[] arr){
        System.out.println("The " + name + " array is:");
        for(int n:arr){
            System.out.print(n + "  ");
        }
        System.out.println();
    }
    public void mergeSort(int[] arr){
        int size = arr.length;
        int mid = size/2;
        int[] l = new int[mid];
        int[] r = new int[size-mid];
        for(int i=0;i<mid;i++){
            l[i] = arr[i];
        }
        for(int i=mid;i<size;i++){
            l[i - mid] = arr[i];
        }
        // diagnostic for splitting arrays:
        printArray("left", l); //debug
        printArray("right", r); //debug
    }
}
