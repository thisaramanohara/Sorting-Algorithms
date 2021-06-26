public class Main {
    public static void main (String [] args) {
        int numberList [] = {2,4,3,45,6,34,23,43,54,34};
        int orderdList [] = {2,4,6,15,16,34,38,43,54,77};
        //bubble_sort_general(numberList);
        //bubble_sort_optimized(numberList);
        //System.out.println(linear_search(numberList,99));
        System.out.println(binary_search(orderdList,6,0,orderdList.length-1));

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

    static boolean binary_search(int [] data,int key,int start,int end) {
        int mid = (int)((start+end)/2);
        if(start>end) return false;
        if(data[mid]==key) return true;
        if(data[mid]>key) return binary_search(data,key,start,mid-1);
        return binary_search(data,key,mid+1,end);
    }

}
