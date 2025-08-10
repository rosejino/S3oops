import java.util.Scanner;
class Common{
public static void main(String args[]){
int arr[]=new int[4];
int arr2[]=new int[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers for 1st array");
for(int i=0;i<4;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter numbers for 2nd array");
for(int j=0;j<4;j++){
arr2[j]=sc.nextInt();
}
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
if(arr[i]==arr2[j]){
System.out.println(arr[i]+"is a common element of two arrays");
}
}
}

}
}
