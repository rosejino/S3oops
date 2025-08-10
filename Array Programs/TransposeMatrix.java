import java.util.Scanner;
class TransposeMatrix{
public static void main(String args[]){
int[][] arr=new int[10][10];
int[][] trans=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in matrix:");
int row=sc.nextInt();
System.out.println("Enter the number of column in matrix:");
int col=sc.nextInt();
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
trans[j][i]=arr[i][j];}}
System.out.println("Transpose is:");
for(int i=0;i<col;i++){
for(int j=0;j<row;j++){
System.out.print(trans[i][j]+" ");
}System.out.println();

}
}
}