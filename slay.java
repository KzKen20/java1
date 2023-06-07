/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asdfkljalksdfj;

/**
 *
 * @author armin
 */
public class slay {
    //bubble sort algorithm
    static void bubbleSort(int[] arr, String[] arr2) {  
        int n = arr.length;  
        int temp = 0;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swaps string elements whenever a comparison is made
                                 String temp2 = arr2[j-1];
                                 arr2[j-1] = arr2[j];
                                 arr2[j] = temp2;
                                 //swaps integer elements whenever a comparison is made
                                 temp = arr[j-1];
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                                 
                         }  
                          
                 }  
         }
    }
    
    public static int StringSearch(String []arr,String target){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(arr[i].equalsIgnoreCase(target) ){
                return i;

            }


        }
        return -1;

    }
    

    public static void main(String[] args) {
        //use *INT* arr[] for the product amount input
        int arr[] ={3,60,35,2,45,320,5};  
        //use *STRING* arr2[] for the product name input
        String arr2[] = {"apple", "orange", "banana", "lotion", "hairspray", "crackers", "oil"};
                 
                System.out.println("Unsorted Products");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print("Product name: " + arr2[i] + " | " + "Product amount: "+ arr[i] + "\n"); 
                        System.out.println("-----------"); 
                }  
                System.out.println();  
                  
                bubbleSort(arr, arr2);//sorting array elements using bubble sort
                
                //add user input for ASCENDING, DESCENDING, and SEARCH
                /* 
                Menu should look like:
                Hello! What would you like to do with the inventory?
                1. Search for specific product.
                2. Sort inventory in ascending order.
                3. Sort inventory in descending order.
                */
                 
                System.out.println("Sorted Products (Ascending)");  
                for(int i=0; i < arr.length; i++){  
                        System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: "+ arr[i]); 
                        System.out.println(" "); 
                }  
                System.out.println("Sorted Products (Descending)");  
                for(int i= (arr.length - 1); i > 0; i--){  
                        System.out.println("Product name: " + arr2[i] + " " + "\nProduct amount: "+ arr[i]); 
                        System.out.println(" "); 
                }
   
        }  
    }
