class InsertionSort{
  public static void main(String args[]){
    int[] a={50,30,32,20,15};
  int temp = 0;
    for (int i = 1; i < n; i++) {
      for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
      }
    }
    System.out.println("After Sort ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
  