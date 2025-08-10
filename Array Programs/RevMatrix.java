import java.util.Scanner;
class RevMatrix{
public static void main(String args[]){
int[][] arr=new int[10][10];
int sum=0;
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
System.out.println("Reverse the order of the diagonl element in a matrix row wise :");
for(int i=row-1;i>=0;i--){
for(int j=0;j<col;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}

