package Harshal_Day3_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Day3_Assignment {


	public static void main(String[] args) {

          int [] arr = new int[8];
          readArray(arr);
          System.out.println(Arrays.toString(arr));
          
       //  frequencyOfEachElement(arr);,
         
         LargestAndSmallestElementInAnArray(arr);
         int [] arr2 = {1,3,3,6,2,2,2,4,4,8,7};
        printElementsOnEvenAndOddPosition(arr2);
         reverseArray(arr2);
          sortingArray(arr2);
        duplicateElementsOfAnArray(arr2);
          SecondLargestInArray(arr2);
          frequencyOfEachElement(arr2);

         
          
	}

	private static void SecondLargestInArray(int[] arr) {
		int largest = arr[0];
        int secondLargest = arr[0];
           System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array.");
        }
    }
            		
	

	private static void duplicateElementsOfAnArray(int[] arr2) {
		System.out.println();
		System.out.print("the duplicate elements are:: ");

            for(int i=0;i<arr2.length;i++) {
            	for(int j=i+1;j<arr2.length;j++) {
            		if(arr2[i]==arr2[j]) {
            			System.out.print(arr2[i]+" ");
            		}
            	}
            }
	}

	private static void sortingArray(int[] arr2) {
		System.out.println();
           for(int i=0;i<arr2.length-1;i++) {
        	   int min=i;
        	   for(int j=i+1;j<arr2.length;j++) {
        		   if(arr2[min]>=arr2[j]) {
        			   min=j;
        		   }
        	   }
        	   int temp=arr2[i];
        	   arr2[i]=arr2[min];
        	   arr2[min]=temp;
	 	   
           }
            System.out.println("Sorted Array:: "+Arrays.toString(arr2));

            		
	}

	private static void reverseArray(int[] arr2) {
		System.out.println();
		System.out.print("Reverse Array Elements Are::");
            for(int i=arr2.length-1;i>=0;i--) {
            	System.out.print(" "+arr2[i]);
            }
	}

	private static void printElementsOnEvenAndOddPosition(int[] arr2) {
		System.out.println();
		System.out.print("Elements On Even Position::");

		for(int i=0;i<arr2.length;i++) {
			if(i%2==0) {
				System.out.print(" "+arr2[i]);
			}
		}
		
		System.out.println();
		System.out.print("Elements On Odd Position::");

		for(int i=0;i<arr2.length;i++) {
			if(i%2!=0) {
				System.out.print(" "+arr2[i]);
			}
		}

		
	}

	private static void LargestAndSmallestElementInAnArray(int[] arr) {
           int min=arr[0];
           int max=arr[0];
           for(int i=0;i<arr.length;i++) {
        	   if(min>=arr[i]) {
        		   min=arr[i];
        	   }
        	   if(max<=arr[i]) {
        		   max=arr[i];
        	   }
        	   

           }
           System.out.println("Largest element in an array::"+max);
           System.out.println("Smallest element in an array::"+min);


           
           
	}

	private static void frequencyOfEachElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1; 
            boolean isUnique = true; 

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++; 
                }
            }

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
            }
        }
    }

          

	

	private static void readArray(int[] arr) {
		Scanner sc= new Scanner(System.in);
           System.out.println("Enter the Array elements::");
           for(int i=0;i<arr.length;i++) {
        	   arr[i]=sc.nextInt();
           }
	}

}
