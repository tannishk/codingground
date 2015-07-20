public class HelloWorld{

     public static void main(String []args){
        int i=154;
        int index=0;
        int rem;
        int arr[] = new int[100];
        while(i>0)
        {
            rem = i%2;
            i = i/2;
            arr[index]=rem;
            index++;
        }
        for(int j=index-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
     }
}
