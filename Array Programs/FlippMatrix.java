import java.util.Scanner;
class FlippMatrix{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of rows for 1st matrix:");
int r1=sc.nextInt();
System.out.println("Enter the number of columns for 1st matrix:");
int c1=sc.nextInt();
int matrix[][]= new int[r1][c1];
System.out.println("Enter elements of 1st matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
matrix[i][j]=sc.nextInt();}
}
System.out.println("Matrix is ");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
System.out.print(matrix[i][j]+" ");}
System.out.println();
}
for(int j=0;j<c1;j++){
int temp=matrix[0][j];
matrix[0][j]=matrix[r1-1][j];
matrix[r1-1][j]=temp;
}
for(int i=0;i<r1;i++){
int temp = matrix[i][0];
matrix[i][0] = matrix[i][c1-1];
matrix[i][c1-1] = temp;
}
System.out.println("Matrix after flipping:");
for(int i=0;i<r1;i++){ 
for(int j=0;j<c1;j++){
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
}
}