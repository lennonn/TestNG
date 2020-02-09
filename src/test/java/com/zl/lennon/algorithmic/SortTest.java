package com.zl.lennon.algorithmic;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    public static  final  int size =5;
    @Test
    public void testBubbleSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        int[] sorted= Sort.bubbleSort(arr);
        long end =System.currentTimeMillis();
        System.out.println("冒泡排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }

    @Test
    public void testSelectionSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        int[] sorted= Sort.selectionSort(arr);
        long end =System.currentTimeMillis();
        System.out.println("选择排序排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }

    @Test
    public void insertionSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        int[] sorted= Sort.insertionSort(arr);
        long end =System.currentTimeMillis();
        System.out.println("插入排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }

    @Test
    public void shellSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        int[] sorted= Sort.shellSort(arr);
        long end =System.currentTimeMillis();
        System.out.println("希尔排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }

    @Test
    public void mergeSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        int[] sorted= Sort.mergeSort(arr,0,arr.length-1);
        long end =System.currentTimeMillis();
        System.out.println("归并排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }

    @Test
    public void quickSort(){
        long start = System.currentTimeMillis();
        int arr[] =Sort.getRandomArr(size);
        arr= new int[]{5, 1, 4, 2, 3};
        int[] sorted= Sort.quickSort(arr,0,arr.length-1);
        long end =System.currentTimeMillis();
        System.out.println("快速排序所用时间："+(end-start)+"ms"+ Arrays.toString(sorted));
    }
}
