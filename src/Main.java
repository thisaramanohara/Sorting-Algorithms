public class Main {
    public static void main (String [] args) {
        int numberList [] = {2,4,3,45,6,34,23,43,54,34};
        bubble_sort(numberList);
    }

    static void bubble_sort(int [] data) {
        //time complexity O(n^2)
        int temp;
        for(int i=0;i<data.length-1;i++) {
            for (int j=data.length-1;j>0;j--) {
                if(data[j]<data[j-1]){
                    //swap
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
