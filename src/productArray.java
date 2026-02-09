public class productArray {
    public static void main(String[] args) {
        int arr[] = {5,1,10,1};
        int totalprod = 1;
        for(int ele:arr){
            totalprod *= ele;
        }
        int productArr[] = new int[arr.length];
        for(int i=0;i<productArr.length;i++){
            productArr[i] = totalprod/arr[i];
        }

        System.out.println("");
        for(int ele:productArr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }

}