import java.util.Scanner;
class Arrays{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter number of elements:");
int n=sc.nextInt();
int arr[] = new int [n];
for(i=0;i<9;i++){
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}