package com.google.search;

import java.util.*;

public class Array4_SubSetSum_EXPLAINED {
    
    // Static counter to track function calls
    static int callCounter = 0;
    
    public static List<List<Integer>> findSubsetSum(int[] arr, int target) {
        System.out.println("=".repeat(80));
        System.out.println("STARTING SUBSET SUM PROBLEM");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target Sum: " + target);
        System.out.println("=".repeat(80));
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        
        // Reset call counter for each run
        callCounter = 0;
        
        backtrack(arr, target, 0, 0, currentSubset, result);
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("FINAL RESULTS:");
        System.out.println("Total valid subsets found: " + result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println("  Subset " + (i+1) + ": " + result.get(i));
        }
        System.out.println("=".repeat(80));
        
        return result;
    }
    
    private static void backtrack(int[] arr, int target, int index, int currentSum, 
                                 List<Integer> currentSubset, List<List<Integer>> result) {
        
        // Increment and display call information
        callCounter++;
        String indent = "  ".repeat(index); // Indentation based on recursion depth
        
        System.out.println("\n" + indent + "📞 CALL #" + callCounter + " STARTED");
        System.out.println(indent + "🔍 Current Parameters:");
        System.out.println(indent + "   - index = " + index + " (considering element at position " + index + ")");
        System.out.println(indent + "   - currentSum = " + currentSum);
        System.out.println(indent + "   - target = " + target);
        System.out.println(indent + "   - currentSubset = " + currentSubset);
        System.out.println(indent + "   - array length = " + arr.length);
        
        if (index < arr.length) {
            System.out.println(indent + "   - element to consider: arr[" + index + "] = " + arr[index]);
        } else {
            System.out.println(indent + "   - NO MORE ELEMENTS (index >= array length)");
        }
        
        // BASE CASE: We've considered all elements in the array
        if (index == arr.length) {
            System.out.println(indent + "🏁 BASE CASE REACHED!");
            System.out.println(indent + "   - index (" + index + ") == arr.length (" + arr.length + ")");
            System.out.println(indent + "   - We have considered ALL elements in the array");
            System.out.println(indent + "   - Current subset: " + currentSubset);
            System.out.println(indent + "   - Current sum: " + currentSum);
            System.out.println(indent + "   - Target: " + target);
            
            // Check if our current subset's sum equals the target
            if (currentSum == target) {
                System.out.println(indent + "✅ SUCCESS! currentSum (" + currentSum + ") == target (" + target + ")");
                System.out.println(indent + "   - This subset " + currentSubset + " is VALID!");
                System.out.println(indent + "   - Adding copy of " + currentSubset + " to results");
                
                // Create a copy of currentSubset and add it to results
                // We need to create a copy because currentSubset will be modified later
                List<Integer> copy = new ArrayList<>(currentSubset);
                result.add(copy);
                System.out.println(indent + "   - Copy created and added to results");
                System.out.println(indent + "   - Total results so far: " + result.size());
            } else {
                System.out.println(indent + "❌ FAILED! currentSum (" + currentSum + ") != target (" + target + ")");
                System.out.println(indent + "   - This subset " + currentSubset + " is INVALID");
                System.out.println(indent + "   - NOT adding to results");
            }
            
            // Return from this recursive call (base case reached)
            System.out.println(indent + "⬅️  RETURNING from base case (Call #" + callCounter + ")");
            return;
        }
        
        // RECURSIVE CASE: We have more elements to consider
        System.out.println(indent + "🔄 RECURSIVE CASE:");
        System.out.println(indent + "   - We still have elements to consider (index " + index + " < length " + arr.length + ")");
        System.out.println(indent + "   - Current element to decide on: arr[" + index + "] = " + arr[index]);
        System.out.println(indent + "   - We have 2 choices: EXCLUDE or INCLUDE this element");
        
        // CHOICE 1: DON'T include the current element arr[index]
        System.out.println(indent + "🚫 CHOICE 1: EXCLUDE arr[" + index + "] = " + arr[index]);
        System.out.println(indent + "   - Moving to next index: " + index + " → " + (index + 1));
        System.out.println(indent + "   - Sum stays same: " + currentSum);
        System.out.println(indent + "   - Subset stays same: " + currentSubset);
        System.out.println(indent + "   - Making recursive call...");
        
        // Move to next index without adding current element
        // Sum stays the same, subset stays the same
        backtrack(arr, target, index + 1, currentSum, currentSubset, result);
        
        System.out.println(indent + "⬅️  RETURNED from EXCLUDE choice (Call #" + callCounter + ")");
        System.out.println(indent + "   - Back to considering arr[" + index + "] = " + arr[index]);
        System.out.println(indent + "   - Current subset after return: " + currentSubset);
        System.out.println(indent + "   - Current sum after return: " + currentSum);
        
        // CHOICE 2: INCLUDE the current element arr[index]
        System.out.println(indent + "✅ CHOICE 2: INCLUDE arr[" + index + "] = " + arr[index]);
        
        // Step 1: Add current element to our subset (make the choice)
        System.out.println(indent + "   Step 1 - MAKING THE CHOICE:");
        System.out.println(indent + "   - Before: currentSubset = " + currentSubset);
        System.out.println(indent + "   - Before: currentSum = " + currentSum);
        
        currentSubset.add(arr[index]);
        System.out.println(indent + "   - After adding arr[" + index + "] = " + arr[index]);
        System.out.println(indent + "   - After: currentSubset = " + currentSubset);
        System.out.println(indent + "   - New sum will be: " + currentSum + " + " + arr[index] + " = " + (currentSum + arr[index]));
        
        // Step 2: Recursively explore with this choice
        System.out.println(indent + "   Step 2 - EXPLORING THIS CHOICE:");
        System.out.println(indent + "   - Moving to next index: " + index + " → " + (index + 1));
        System.out.println(indent + "   - New sum: " + (currentSum + arr[index]));
        System.out.println(indent + "   - Current subset: " + currentSubset);
        System.out.println(indent + "   - Making recursive call...");
        
        // Move to next index, add current element's value to sum
        backtrack(arr, target, index + 1, currentSum + arr[index], currentSubset, result);
        
        System.out.println(indent + "⬅️  RETURNED from INCLUDE choice (Call #" + callCounter + ")");
        System.out.println(indent + "   - Back to considering arr[" + index + "] = " + arr[index]);
        
        // Step 3: BACKTRACK - undo the choice we just made
        System.out.println(indent + "   Step 3 - BACKTRACKING:");
        System.out.println(indent + "   - Before backtrack: currentSubset = " + currentSubset);
        System.out.println(indent + "   - Before backtrack: currentSum = " + currentSum);
        System.out.println(indent + "   - Need to remove the last element we added: " + arr[index]);
        
        // Remove the last element we added to restore previous state
        int removedElement = currentSubset.remove(currentSubset.size() - 1);
        
        System.out.println(indent + "   - Removed element: " + removedElement);
        System.out.println(indent + "   - After backtrack: currentSubset = " + currentSubset);
        System.out.println(indent + "   - After backtrack: currentSum = " + currentSum + " (unchanged in this call)");
        System.out.println(indent + "   - State restored to before we made INCLUDE choice");
        
        // This is crucial for exploring other possibilities
        System.out.println(indent + "🏁 FINISHED exploring both choices for arr[" + index + "] = " + arr[index]);
        System.out.println(indent + "⬅️  RETURNING from Call #" + callCounter);
    }
    
    public static void main(String[] args) {
        // Example with array {1, 2, 3} and target 3
        int[] arr = {1, 2, 3};
        int target = 3;
        
        List<List<Integer>> result = findSubsetSum(arr, target);
        
        System.out.println("\n" + "🎯".repeat(20));
        System.out.println("SUMMARY:");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Valid subsets found: " + result.size());
        for (List<Integer> subset : result) {
            int sum = subset.stream().mapToInt(Integer::intValue).sum();
            System.out.println("  " + subset + " → sum = " + sum);
        }
        System.out.println("Total function calls made: " + callCounter);
        System.out.println("🎯".repeat(20));
    }
}