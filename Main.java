import java.util.Random;
public class Main {
    int dataSize = 20;
    int min = -100;
    int max = 100;
    int[] data;
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        Random r = new Random();
        data = new int[dataSize];
        for(int i=0;i<dataSize;i++){
            data[i] = r.nextInt(min,max);
        }
        Sorter st = new Sorter();
        st.mergeSort(data);

        Tester t = new Tester();
        if(t.isIncreasing(data)){
            System.out.println("The data is sorted increasing");
        } else {
            System.out.println("The data is not sorted increasing");
        }
    }
}
