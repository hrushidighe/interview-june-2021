package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr,int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
int i,temp;
    temp=arr[n-1];
    for(i=1;i<n;i++)
      arr[i]=arr[i-1];
    arr[0]=temp
  }

}
