import java.util.Scanner;
class BinarySearch{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int flag=0;
int key;
System.out.println("Enter the number of elements in array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of array:");
for (int i=0;i<n;i++){
arr[i]=sc.nextInt();
} 
System.out.println("The Element of array is :");
System.out.print("[");
for (int i=0;i<n;i++){
System.out.print(arr[i] +" ");
}
System.out.print("]");
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;}}
}
System.out.println("\nThe sorted array is:\n");
System.out.print("[");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");}
System.out.print("]");
System.out.println("\n Enter the element to be searched:\n");
 key=sc.nextInt();
int l=0,u=n-1,mid;
while(l<=u){
mid=(l+u)/2;
if(key==arr[mid]){
System.out.println("Successful and found at index "+ mid);
flag=1;
}
if(key<=arr[mid]){
u=mid-1;
}
else{
l=mid+1;}
}
if(flag==0){
System.out.println("Unsuccessful");
}
}
}

