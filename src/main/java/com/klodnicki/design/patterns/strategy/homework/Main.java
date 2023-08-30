package com.klodnicki.design.patterns.strategy.homework;

//Zadanie 2. Strategia
//        Zaimplementuj program i strategię w taki sposób, aby pozwolić użytkownikowi sortowanie tablicy intów według
//        różnych algorytmów sortowania. Stwórz interfejs SortStrategy z metodą "void sort(int[] arr)" a następnie
//        konkretne implementacje sortowania pozwól wybierać użytkownikowi w trakcie działania programu.
//        (PS. implementacje algorytmów sortujących znajdziesz w internecie bardzo łatwo. To, czego musisz szukać to:
//        bubble sort, selection sort i quicksort algorithm. Te trzy konkretne implementacje chciałbym aby były
//        zaimplementowane w programie!)

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr ={1000, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arr2 ={10000, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arr3 ={100000, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original array: " + Arrays.toString(arr));

        SortStrategy bubbleSort = new BubbleSort();
        SortStrategy selectionSort = new SelectionSort();
        SortStrategy quickSort = new QuickSort();

        System.out.println("Bubble sort: ");
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Selection sort: ");
        selectionSort.sort(arr2);
        System.out.println("Quick sort: ");
        quickSort.sort(arr3);
    }
}
