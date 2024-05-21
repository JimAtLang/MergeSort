public class Sorter {
    public void printArray(String name, int[] arr){
        System.out.println("The " + name + " array is:");
        for(int n:arr){
            System.out.print(n + "  ");
        }
        System.out.println();
    }
    public void mergeSort(int[] arr){
        printArray("whole", arr);
        int size = arr.length;
        int mid = size/2;
        // Assignment: Write a function that divides arr into two parts and use the printArray function
        // to print each of them out
    }
}
