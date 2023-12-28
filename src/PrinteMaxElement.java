public class PrinteMaxElement {
    public static void main(String[] args) {
        int[] a={1,2,3,8,5,2,9,4,9};
        //9 is the maximum number
        //Print all maximum numbers...So here I want to print 9 two times.
        int len=a.length;
        System.out.println("Length of the array is: "+len);
        int max=a[0];
        for (int i=1;i<len;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Final Maximum element is: "+max);
        int count=0;
        for (int j=0;j<len;j++){
            if (max==a[j]){
                System.out.println("Maximum element is: "+max);
                count++;
            }

        }
        System.out.println("Maximum element is present "+count+" times");
    }
}
