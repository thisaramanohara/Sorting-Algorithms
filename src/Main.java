public class Main {
    public static void main (String [] args) {
        int numberList [] = {2,4,3,45,6,34,23,43,54,34};
        int orderdList [] = {2,4,6,15,16,34,38,43,54,77};
        int numberListForInsertionSort [] = {2,4,3,45};
        //bubble_sort_general(numberList);
        //bubble_sort_optimized(numberList);
        //System.out.println(linear_search(numberList,99));
        //System.out.println(binary_search(orderdList,6,0,orderdList.length-1));
        //numberListForSelectionSort = selection_sort(numberListForSelectionSort);
        numberListForInsertionSort = insertion_sort(numberListForInsertionSort);

        for (int i=0;i<numberListForInsertionSort.length;i++) {
            System.out.println(numberListForInsertionSort[i]);
        }

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

//    static int [] mergeSort(int [] data,int start,int end) {
//        System.out.println("Im again");
//        int mid = (int)((start+end)/2);
//        int [] mergedList = new int[end-start];
//        if(start<end) {
//            //mid = (int)((start+end)/2);
//            mergeSort(data,start,mid);
//            mergeSort(data,mid+1,end);
//            mergedList = merge(data,start,mid,end);
//
////            for(int x=start;x<=end;x++){
////                data[x] = mergedList[x];
////            }
//        }
//        return mergedList;
//    }
//
//    static int [] merge(int [] data,int start,int mid,int end) {
//        int [] merged = new int[end-start];
//        int i = start; int j = mid+1; int k = start;
//        while (i<=mid && j<=end) {
//            if(data[i] <= data[j]){
//                merged[k] = data[i];
//                i++;
//            }else {
//                merged[k] = data[j];
//                j++;
//            }
//            k++;
//        }
//        if(i>mid){
//            while (j<=end) {
//                merged[k] = data[j];
//                j++;
//                k++;
//            }
//        }else{
//            while (i<=end) {
//                merged[k] = data[i];
//                i++;
//                k++;
//            }
//        }
//
//        return merged;
//    }

    //for the convenience
    static void swap(int []d, int i, int j) {
        int tmp = d[i];
        d[i] = d[j];
        d[j] = tmp;
    }

    static int [] selection_sort(int [] data) {
        for (int i=0;i<data.length-1;i++) {
            int min = i;
            for (int j=i+1;j<data.length;j++) {
                if(data[j] < data[min]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(data,i,min);
            }
        }
        return data;
    }

    static int [] insertion_sort(int [] data) {
        for (int i=1;i<data.length;i++) {
            int temp = data[i];
            int j = i-1;
            while (j>=0 && data[j]>temp) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
        return data;
    }











}
