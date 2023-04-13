import java.util.Scanner;
class ArraySort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int arr[]={1,2,3,4,56,67,89,99};
      System.out.println("Enter the number to check whether it is present in list or not: ");
    int num = sc.nextInt();
        int startindex = arr[0], stopindex = arr.length - 1;
        int mid = (startindex + stopindex) / 2;
 
        while (true) {
            if (arr[mid] == num) {
                System.out.println("element found at index " + mid);
                break;
            } else if (arr[mid] > num) {
                startindex = startindex;
                stopindex = mid - 1;
                mid = (startindex + stopindex) / 2;
            } else if (arr[mid] < num) {
                stopindex = stopindex;
                startindex = mid + 1;
                mid = (startindex + stopindex) / 2;
            }
        }
    }
}
    