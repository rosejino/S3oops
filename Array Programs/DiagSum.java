import java.util.Scanner;
class DiagSum{
public static void main(String args[]){
int[][] arr=new int[10][10];
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in matrix:");
int row=sc.nextInt();
System.out.println("Enter the number of column in matrix:");
int col=sc.nextInt();
if(row==col){
System.out.println("Enter elements:");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
arr[i][j]=sc.nextInt();}
}
System.out.println("Matrix is:");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
if(i==j){
sum+=arr[i][j];
}
}
}
System.out.println("The Sum of Diagonal is "+sum);}
else
System.out.println("It is not Square matrix .So Sum is not possible.");
}
}







