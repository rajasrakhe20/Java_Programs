package Function;

public class Array {

    static void Array(int a[]){
        a[0]=12;
        a[3]=20;
        System.out.println("Given array is : ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};


        Array(arr);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
