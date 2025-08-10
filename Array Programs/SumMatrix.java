import java.util.Scanner;
class SumMatrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in first row");
int row1=sc.nextInt();
System.out.println("Enter the number of elements in second row");
int row2=sc.nextInt();
System.out.println("Enter the number of elements in first coloumn");
int col1=sc.nextInt();
System.out.println("Enter the number of elements in second coloumn");
int col2=sc.nextInt();
if((row1==row2)&&(col1==col2)){
int[][] mat1=new int[row1][col1];
int[][] mat2=new int[row2][col2];
int[][] Sum=new int[row1][col1];
System.out.println("Enter the elements for matrix1:");
for(int i=0;i<row1;i++){
for(int j=0;j<col1;j++){
mat1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements for matrix2:");
for(int i=0;i<row2;i++){
for(int j=0;j<col2;j++){
mat2[i][j]=sc.nextInt();
}
}
for(int i=0;i<row1;i++){
for(int j=0;j<col1;j++){
Sum[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.println("Sum of Two Matrix: ");
for(int i=0;i<row1;i++){
for(int j=0;j<col1;j++){
System.out.print(Sum[i][j]+"    ");
}System.out.println();}
}
else {
System.out.println("Addition is not possible");
}
}
}