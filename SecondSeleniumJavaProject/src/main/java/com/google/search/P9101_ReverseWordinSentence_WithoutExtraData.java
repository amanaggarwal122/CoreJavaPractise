package com.google.search;

public class P9101_ReverseWordinSentence_WithoutExtraData {
    
    // Helper: reverse a portion of the char array
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
            
        }
       
            
        
    }

    public static String reverseWords(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        // Step 1: Reverse the whole string
        reverse(arr, 0, n - 1);
        
        for(int i = 0 ; i < str.length() ; i++)
        {
        System.out.println("Step1 Reverse Whole : " + arr[i]);
        }
        
        // Step 2: Reverse each word
        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "I love Java";
        String result = reverseWords(input);
        
        
        System.out.println("Original: " + input);
        System.out.println("Reversed words: " + result);
    }
}

