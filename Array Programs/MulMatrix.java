import java.util.Scanner;
class MulMatrix{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i,j,k;
System.out.println("Enter the number of rows for 1st matrix:");
int rows1=sc.nextInt();
System.out.println("Enter the number of columns for 1st matrix:");
int cols1=sc.nextInt();
int matrix1[][]= new int[rows1][cols1];
System.out.println("Enter the number  of rows for 2st matrix:");
int rows2=sc.nextInt();
System.out.println("Enter the number of columns for 2st matrix:");
int cols2=sc.nextInt();
int matrix2[][]= new int[rows2][cols2];
int matrix3[][]= new int[rows1][cols2];
if(cols1==rows2)
System.out.println("Multiplication possible");
else
System.out.println("Multiplication not possible");
System.out.println("Enter elements of 1st matrix");
for(i=0;i<rows1;i++){
for(j=0;j<cols1;j++){
matrix1[i][j]=sc.nextInt();}}
System.out.println("Enter elements of 2nd matrix");
for(i=0;i<rows2;i++){
for(j=0;j<cols2;j++){
matrix2[i][j]=sc.nextInt();}}
for(i=0;i<rows1;i++){
for(j=0;j<cols2;j++){
for(k=0;k<rows2;k++)
matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];}}
System.out.println("Matrix after multiplication is ");
for(i=0;i<rows1;i++){
for(j=0;j<cols2;j++){
System.out.print(matrix3[i][j]+"   ");}
System.out.println();}
}}