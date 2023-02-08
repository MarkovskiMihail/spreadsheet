import java.util.Scanner;
import java.util.Arrays;   

public class PrimitiveSpreadsheet{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){

    System.out.println("Enter the number of integers in the array:");
    int arraylength = scan.nextInt();
    int[] array = new int[arraylength];
    
    fillArray(array);

    int choice;

    do {
    displayMenu();
    choice = scan.nextInt();
    switch (choice){
        case 1:
        displayArray(array );
        break;

        case 2:
        SumNums(array );
        break;

        case 3:
        FindMax(array );
        break;

        case 4:
        FindMin(array );
        break;

        case 5:
        Ascending(array );
        break;

        case 6:
        FindMax(array );
        break;

        case 7:
        FindMax(array );
        break;

    }
    }while(choice >=1 && choice <=7);
    }
    
    public static void fillArray(int[] array){
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < array.length; i++ ){
    array[i] = scan.nextInt();
    }
    }


    public static void displayMenu(){
		System.out.println("\n\n\n1. Display the elements of the array.\n" + 
				"2. Sum numbers\n" + 
				"3. Find max\n" + 
				"4. Find min\n" + 
				"5. Sort Ascending\n" + 
				"6. Sort Descending\n" + 
				"7. Swap the position of two array elements\n" + 
				"Enter your choice (1-7) or any other number to exit");
	
    }
    public static void displayArray(int[] array){		
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}	
	}

    public static void SumNums(int[] array){
        int sum = 0;

        for (int i=0; i < array.length; i++) {
		sum = sum + array[i];
		}
        System.out.println(sum);
    }
    public static void FindMax(int[] array){
        int max = array[0];
        for (int i=0; i < array.length; i++) {
		if (max < array[i]){
            max = array[i]; 
        }
        System.out.println(max);
        }
    }
    public static void FindMin(int[] array){
    int min = array[0];
    for (int i=0; i < array.length; i++) {
    if (min < array[i]){
        min = array[i]; 
    
    } 
    System.out.println(min);    
    }
    }
    
    public static void Ascending(int[] array){
    Arrays.sort(array);   
    System.out.println("Elements of array sorted in ascending order: ");   
    for (int i = 0; i < array.length; i++){       
    System.out.println(array[i]); 
    } 
    }
        
    public static void Descending(int[] array){
    Arrays.sort(array, Collections.reverseOrder());   
    System.out.println("Elements of array sorted in ascending order: ");   
    for (int i = 0; i < array.length; i++){       
    System.out.println(array[i]); 
    } 
    }
    }

    // public static void Descending(int[] array){

    // }
