import java.util.Arrays;
import java.util.Scanner;
public class Bsearch
 {
  public static int myBinarySearch(int arr[],int first,int last,int key)
   {
    int mid=(first+last)/2;
    while(first<=last)
     {
      if(arr[mid]<key)
       {
        first=mid + 1;
       }
      else if(arr[mid]==key)
       {  
        System.out.println("Element is found at index:" +mid);
        return mid;
       }
      else
       {
        last=mid-1;
       }
      mid=(first+last)/2;
     }
    return -1;
   }
  public static int binarysearchRecursion(int arr[],int first,int last,int key)
   {
    if(last>=first)
     {
      int mid=first+(last-first)/2;
      if(arr[mid]==key)
       {
        return mid;
       }
      if(arr[mid]>key)
       {
        return binarysearchRecursion(arr,first,mid-1,key);
       }
      else
       {
        return binarysearchRecursion(arr,mid+1,last,key);
       }
     }
    return -1;
   }
  public static void main(String[] args)
   {
    System.out.println("Enter your choice of binary search logic:");
    System.out.println("1.Simple binary search");
    System.out.println("2.Recursive Binary search");
    System.out.println("3:Using Arrays.binarySearch");
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter number of elements:");
    int n=in.nextInt();
    int array[]=new int[n];
    System.out.println("Enter those " +n+ " elements:");
    for(int c=0;c<n;c++)
    array[c]=in.nextInt();
    System.out.println("Enter value to find:");
    int search=in.nextInt();
    Arrays.sort(array);
    int found=-1;
    switch(ch)
     {
      case 1:found=myBinarySearch(array,0,n,search);
             break;
      case 2:found=binarysearchRecursion(array,0,n,search);
             break;
      case 3:found=Arrays.binarySearch(array,0,n,search);
             break;
     }
    if(found>=0)
     {
      System.out.println("Elements is found at " +found);
     }
    else
     {
      System.out.println("Elements is not found !");
     }
   }
 }

