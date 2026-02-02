public class preffix_array {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};
        int[] pf = new int[5];
        pf[0] = arr[0];
        for(int i = 1; i<arr.length;i++){
            pf[i] = pf[i-1] + arr[i];
        }
        System.out.println("preffix array");
        for(int i = 0; i<arr.length;i++){
            System.out.print(pf[i]+" ");
        }
    }
}
