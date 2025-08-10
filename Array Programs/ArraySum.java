import java.util.Scanner;
class ArraySum{
public static void main(String args[]){
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<10;i++){
if(arr[i]%2==0){
sum+=arr[i];
}
}
System.out.println("The sum of even elements is "+sum);

}
}


