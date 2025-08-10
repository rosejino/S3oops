import java.util.Scanner;
class DupMatrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr=new int[10];
int i,j,k;
System.out.println("Enter the number of elements in an array:");
int elem=sc.nextInt();
System.out.println("Enter elements:");
for(i=0;i<elem;i++){
arr[i]=sc.nextInt();
}
System.out.println("Array is:");
for(i=0;i<elem;i++){
System.out.print(arr[i]+" ");
}
System.out.println("\nArray after removing duplicate non zero integrer elements:");
for(i=0;i<elem;i++){
if(arr[i]!=0){
for(j=i+1;j<elem;j++){
if(arr[i]==arr[j]){
for(k=j;k<elem-1;k++){
arr[k]=arr[k+1];}
elem--;
j--;
}
}
}
}
for(i=0;i<elem;i++){
System.out.print(arr[i]+" ");
}
}
}

