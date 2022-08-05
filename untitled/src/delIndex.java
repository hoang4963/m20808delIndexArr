import java.util.Scanner;
public class delIndex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 7, 9, 8};
        int arr1[] =del(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t" );
        }
    }
    public static int[] del(int[] arr1) {
            int value;
            int index = -1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap so muon kiem tra ");
            value = scanner.nextInt();
            for (int i = 0; i < arr1.length; i++){
                if (value == arr1[i]){
                    index = i;
                    break;
                }
            }
            if (index != -1){
                for (int j = index; j< arr1.length-1; j++){
                    arr1[j] = arr1[j+1];
                }
                arr1[arr1.length-1] = 0;
            }
            return arr1;
        }
}
