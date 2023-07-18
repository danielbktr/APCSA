// Made by Daniel Boktor on June 11,2023
// This class demonstrates different sorting algorithms using the PastaSauce class.


import java.util.Arrays;
import java.util.Collections;

public class PastaSauceTester{
    public static void main(String args[]){
        PastaSauce zero = new PastaSauce("Ragu",12.81,10,1543);
        PastaSauce one = new PastaSauce("Bertolli",16.81,11,7345);
        PastaSauce two = new PastaSauce("Barilla",13.81,17,2345);
        PastaSauce three = new PastaSauce("Prego",16.81,18,9867);
        PastaSauce four = new PastaSauce("Cucina Antica",17.81,17,87345);
        PastaSauce five = new PastaSauce("Newman's Own",2.81,16,875);
        PastaSauce six = new PastaSauce("Classico",1.81,60,62354);
        PastaSauce seven = new PastaSauce("Trader Joe's",12.11,10,7325);
        PastaSauce eight = new PastaSauce("Whole Foods",19.81,30,8932);
        PastaSauce nine = new PastaSauce("Victoria",10.81,20,8345);
        PastaSauce[] temp = {zero,one,two,three,four,five,six,seven,eight,nine};

        System.out.println("Default array: ");
        printAll(temp); System.out.println("\n\n");

        System.out.println("Insertion sort by price: ");
        temp = insertionSortByPrice(temp, 0);
        printAll(temp); System.out.println("\n\n");

        System.out.println("Insertion sort by price, descending: ");
        temp = insertionSortByPrice(temp, 1);
        printAll(temp); System.out.println("\n\n");

        System.out.println("Insertion sort by product number: ");
        temp = insertionSortByProductNumber(temp, 0);
        printAll(temp); System.out.println("\n\n");

        System.out.println("Insertion sort by product number, descending: ");
        temp = insertionSortByProductNumber(temp, 1);
        printAll(temp); System.out.println("\n\n");

        System.out.println("Merge sort by quantity: ");
        temp = mergeSortByQuantity(temp, 0, temp.length-1,1);
        printAll(temp);System.out.println("\n\n");

        System.out.println("Merge sort by quantity, descending: ");
        temp = mergeSortByQuantity(temp, 0, temp.length-1,0);
        printAll(temp);System.out.println("\n\n");
        
        System.out.println("Selection sort by name: ");
        selectionSortByName(temp,1);
        printAll(temp);System.out.println("\n\n");

        System.out.println("Selection sort by name, descending: ");
        selectionSortByName(temp,0);
        printAll(temp);System.out.println("\n\n");
    }
    public static void printAll(PastaSauce[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }

    public static PastaSauce[] insertionSortByPrice(PastaSauce[] tempArr,int ascDec){
        for(int i=1;i<tempArr.length;i++){
            PastaSauce current = tempArr[i];
            int jndex = i-1;
            
            while((jndex>=0 )&& (tempArr[jndex].getPrice() >current.getPrice())){
                tempArr[jndex+1] = tempArr[jndex];
                jndex=jndex-1;
            }
            tempArr[jndex+1] = current;
        }
        if(ascDec==1){
            Collections.reverse(Arrays.asList(tempArr));
        }
        return tempArr;
    }

    public static PastaSauce[] insertionSortByProductNumber(PastaSauce[] tempArr,int ascDec){
        for(int i=1;i<tempArr.length;i++){
            PastaSauce current = tempArr[i];
            int jndex = i-1;

            while((jndex>=0) && tempArr[jndex].getProductNumber()>current.getProductNumber()){
                tempArr[jndex+1] = tempArr[jndex];
                jndex=jndex-1;
            }
            tempArr[jndex+1] = current;
        }
        if(ascDec==1){
            java.util.Collections.reverse(Arrays.asList(tempArr));
        }
        return tempArr;
    }

    public static PastaSauce[] mergeSortByQuantity(PastaSauce[] arr, int low, int hi, int asc) {

		if (low == hi) {
			PastaSauce[] br = new PastaSauce[1];
			br[0] = arr[low];

			return br;
		}

		int mid = (low + hi) / 2;

		PastaSauce[] firstHalf = mergeSortByQuantity(arr, low, mid,asc);
		PastaSauce[] lastHalf = mergeSortByQuantity(arr, mid + 1, hi,asc);
        PastaSauce[] mergedArrs = mergeArrays(firstHalf, lastHalf);

        if((mergedArrs.length == arr.length) &&(asc == 0)){
            Collections.reverse(Arrays.asList(mergedArrs));
        }
		return mergedArrs;
	}

    public static PastaSauce[] mergeArrays(PastaSauce[] one, PastaSauce[] two) {

        PastaSauce[] sorted = new PastaSauce[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length && j < two.length) {

            if (one[i].getQuantity() < two[j].getQuantity()) {
                sorted[k] = one[i];
                k++;
                i++;
            } else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if (i == one.length) {

            while (j < two.length) {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if (j == two.length) {

            while (i < one.length) {
                sorted[k] = one[i];
                k++;
                i++;
            }
        }

        return sorted;

    }
        
    public static void selectionSortByName(PastaSauce[] temparr, int asc){
        for (int index =0;index<temparr.length-1;index++){
            int current = index;
            for (int jndex=index+1;jndex<temparr.length;jndex++){
                if (temparr[jndex].getName().compareToIgnoreCase(temparr[current].getName())<0){
                    current = jndex;
                }
            }
            PastaSauce temp = temparr[index];
            temparr[index] = temparr[current];
            temparr[current] = temp;
        }
        if (asc==0){
            java.util.Collections.reverse(Arrays.asList(temparr));
        }
    }
    }
    