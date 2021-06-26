public class Main {
    public static void main (String [] args) {
        int numberList [] = {2,4,3,45,6,34,23,43,54,34};
        //bubble_sort_general(numberList);
        //bubble_sort_optimized(numberList);
        //System.out.println(linear_search(numberList,99));

    }

    static void bubble_sort_general(int [] data) {
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

    static void bubble_sort_optimized(int [] data) {
        int temp;
        boolean quit = false;
        for(int i=0;i<data.length-1 && !quit;i++) {
            quit = true;
            for (int j=data.length-1;j>0;j--) {
                if(data[j]<data[j-1]){
                    //swap
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                    quit = false;
                }
            }
        }
        System.out.println();
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    static boolean linear_search(int [] data,int key) {
        //O(N)
        for (int i=0;i<data.length;i++) {
            if(data[i]==key){
                return true;
            }
        }
        return false;
    }

}
