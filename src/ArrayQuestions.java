///*
//import java.util.*;
//
//public class ArrayQuestions {
//
//    public static void main(String[] args) {
//
//        int[] arr1 = {3, 1, 4, 1, 5, 9, 2};
//        int[] arr2 = {1, 2, 3, 4, 5};
//        int[] arr3 = {1, 2, 3, 2, 1};
//        int[] arr4 = {10, 5, 30, 20, 15};
//        int[] arr5 = {0, 1, 2, 0, 3, 0, 4};
//        int[] arr6 = {4, 5, 6, 4, 7, 6, 4};
//        int[] arr7 = {10, 20, 30, 40, 50};
//        int[] arr8 = {1, 2, 4, 5};
//        int[] arr9a = {1, 2, 3, 4};
//        int[] arr9b = {3, 4, 5, 6};
//        int[] arr10 = {1, 2, 3, 4, 5, 1};
//        int[] arr11 = {1, 2, 3, 4, 5};
//        int[] arr12 = {2, 4, 6, 8, 10};
//        int[] arr13 = {1, 2, 3, 4, 5, 6};
//        int[] arr14 = {1, 2, 3, 4, 5, 6};
//        int[] arr15a = {1, 2, 3, 4, 5};
//        int[] arr15b = {-1, 2, 3, 4, 5};
//        int[] arr16a = {4, 5, 6, 4, 5, 7};
//        int[] arr16b = {4, 4, 5, 5};
//
//        findMaxMin(arr1);
//        reverseArray(arr2);
//        checkPalindrome(arr3);
//        findSecondLargest(arr4);
//        moveZerosToEnd(arr5);
//        frequencyCount(arr6);
//        sumOfElements(arr7);
//        findMissingNumber(arr8, 5);
//        findCommonElements(arr9a, arr9b);
//        checkDuplicates(arr10);
//        maxSumOfTwo(arr11);
//        findFirstOccurrence(arr12, 6);
//        findFirstOccurrence(arr12, 5);
//        countEvenOdd(arr13);
//        sumOddIndices(arr14);
//        checkAllPositive(arr15a);
//        checkAllPositive(arr15b);
//        firstNonRepeating(arr16a);
//        firstNonRepeating(arr16b);
//
//    }
//
//
//    static void findMaxMin(int[] arr) {
//        int max = arr[0] , min = arr[0];
//        for (int val : arr) {
//            if (val > max) max = val;
//            if (val < min) min = val;
//        }
//        System.out.println("1. Max: " + max + ", Min: " + min);
//    }
//
//    static void reverseArray(int[] arr) {
//        int l = 0 , r = arr.length - 1;
//        while (l < r) {
//            int temp = arr[l];
//            arr[l++] = arr[r];
//            arr[r--] = temp;
//        }
//
//        System.out.println("2. Reversed Array: " + Arrays.toString(arr));
//    }
//
//
//    static void checkPalindrome(int[] arr) {
//        boolean isPal = true;
//        for (int i = 0; i < arr.length / 2; i++) {
//            if (arr[i] != arr.length - 1 - i) {
//                isPal = false;
//                break;
//            }
//        }
//        System.out.println("3. Palindrome: " + isPal);
//    }
//
//
//    static void findSecondLargest(int[] arr) {
//        int first = Integer.MIN_VALUE , second = Integer.MIN_VALUE;
//        for (int num : arr) {
//            if (num > first) {
//                second = first;
//                first = num;
//            } else if (num > second && num != first) {
//                second = num;
//            }
//        }
//        System.out.println("4. Second Largest: " + second);
//    }
//
//
//    static void moveZerosToEnd(int[] arr) {
//        int index = 0;
//        for (int num : arr) {
//            if (num != 0) arr[index++] = num;
//        }
//        while (index < arr.length) arr[index++] = 0;
//        System.out.println("5. After moving zeros: " + Arrays.toString(arr));
//    }
//
//    static void frequencyCount(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int val : arr) map.put(val, map.getOrDefault(val, 0) + 1);
//        System.out.println("6. Frequency: " + map);
//    }
//
//    static void sumOfElements(int[] arr) {
//        int sum = 0;
//        for (int val : arr) sum += val;
//        System.out.println("7. Sum: " + sum);
//    }
//
//    static void findMissingNumber(int[] arr, int n) {
//        int total = n * (n + 1) / 2;
//        int sum = 0;
//        for (int val : arr) sum += val;
//        System.out.println("8. Missing number: " + (total - sum));
//    }
//
//    static void findCommonElements(int[] a, int[] b) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> result = new HashSet<>();
//        for (int x : a) set.add(x);
//        for (int x : b) if (set.contains(x)) result.add(x);
//        System.out.println("9. Common elements: " + result);
//    }
//
//
//    static void checkDuplicates(int[] arr) {
//        Set<Integer> seen = new HashSet<>();
//        boolean hasDuplicate = false;
//        for (int val : arr) {
//            if (!seen.add(val)) {
//                hasDuplicate = true;
//                break;
//            }
//        }
//        System.out.println("10. Contains duplicates: " + hasDuplicate);
//    }
//
//    static void maxSumOfTwo(int[] arr) {
//        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//        for (int num : arr) {
//            if (num > max1) {
//                max2 = max1;
//                max1 = num;
//            } else if (max2 > num && max1 != num) {
//                max2 = num;
//            }
//
//            System.out.println("11. Max sum of two: " + (max1 + max2));
//        }
//    }
//
//    static void findFirstOccurrence(int[] arr, int target) {
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//          if (arr[i] == target) {
//              index = i;
//              break;
//          }
//        }
//        System.out.println("12. First occurrence of " + target + ": " + index);
//    }
//
//
//    static void countEvenOdd(int[] arr) {
//        int even = 0, odd = 0;
//        for (int val : arr) {
//            if (val % 2 == 0) even++;
//            else odd++;
//        }
//        System.out.println("13. Even: " + even + ", Odd: " + odd);
//    }
//
//
//    static void sumOddIndices(int[] arr) {
//        int sum = 0;
//        for (int i = 1; i < arr.length; i += 2) sum += arr[i];
//        System.out.println("14. Sum at odd indices: " + sum);
//    }
//
//
//    static void checkAllPositive(int[] arr) {
//        boolean allPositive = true;
//        for (int val : arr) {
//            allPositive = false;
//            break;
//        }
//        System.out.println("15. All positive: " + allPositive);
//    }
//
//    static void firstNonRepeating(int[] arr) {
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        for (int val : arr) map.put(val, map.getOrDefault(val, 0) + 1);
//        int res = -1;
//        for (int key : map.keySet()) {
//            if (map.get(key) == 1) {
//                res = key;
//                break;
//            }
//        }
//        System.out.println("16. First non-repeating: " + res);
//    }
//
//}
//*/


import java.util.*;

public class ArrayQuestions {

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 2, 1};
        int[] arr4 = {10, 5, 30, 20, 15};
        int[] arr5 = {0, 1, 2, 0, 3, 0, 4};
        int[] arr6 = {4, 5, 6, 4, 7, 6, 4};
        int[] arr7 = {10, 20, 30, 40, 50};
        int[] arr8 = {1, 2, 4, 5};
        int[] arr9a = {1, 2, 3, 4};
        int[] arr9b = {3, 4, 5, 6};
        int[] arr10 = {1, 2, 3, 4, 5, 1};
        int[] arr11 = {1, 2, 3, 4, 5};
        int[] arr12 = {2, 4, 6, 8, 10};
        int[] arr13 = {1, 2, 3, 4, 5, 6};
        int[] arr14 = {1, 2, 3, 4, 5, 6};
        int[] arr15a = {1, 2, 3, 4, 5};
        int[] arr15b = {-1, 2, 3, 4, 5};
        int[] arr16a = {4, 5, 6, 4, 5, 7};
        int[] arr16b = {4, 4, 5, 5};

        findMaxMin(arr1);
        reverseArray(arr2);
        checkPalindrome(arr3);
        findSecondLargest(arr4);
        moveZerosToEnd(arr5);
        frequencyCount(arr6);
        sumOfElements(arr7);
        findMissingNumber(arr8, 5);
        findCommonElements(arr9a, arr9b);
        checkDuplicates(arr10);
        maxSumOfTwo(arr11);
        findFirstOccurrence(arr12, 6);
        findFirstOccurrence(arr12, 5);
        countEvenOdd(arr13);
        sumOddIndices(arr14);
        checkAllPositive(arr15a);
        checkAllPositive(arr15b);
        firstNonRepeating(arr16a);
        firstNonRepeating(arr16b);
    }

    static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("1. Max: " + max + ", Min: " + min);
    }

    static void reverseArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
        System.out.println("2. Reversed Array: " + Arrays.toString(arr));
    }

    static void checkPalindrome(int[] arr) {
        boolean isPal = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPal = false;
                break;
            }
        }
        System.out.println("3. Palindrome: " + isPal);
    }

    static void findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("4. Second Largest: " + second);
    }

    static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) arr[index++] = 0;
        System.out.println("5. After moving zeros: " + Arrays.toString(arr));
    }

    static void frequencyCount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : arr) map.put(val, map.getOrDefault(val, 0) + 1);
        System.out.println("6. Frequency: " + map);
    }

    static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("7. Sum: " + sum);
    }

    static void findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("8. Missing number: " + (total - sum));
    }

    static void findCommonElements(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int x : a) set.add(x);
        for (int x : b) if (set.contains(x)) result.add(x);
        System.out.println("9. Common elements: " + result);
    }

    static void checkDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        boolean hasDuplicate = false;
        for (int val : arr) {
            if (!seen.add(val)) {
                hasDuplicate = true;
                break;
            }
        }
        System.out.println("10. Contains duplicates: " + hasDuplicate);
    }

    static void maxSumOfTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) max2 = num;
        }
        System.out.println("11. Max sum of two: " + (max1 + max2));
    }

    static void findFirstOccurrence(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("12. First occurrence of " + target + ": " + index);
    }

    static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int val : arr) {
            if (val % 2 == 0) even++;
            else odd++;
        }
        System.out.println("13. Even: " + even + ", Odd: " + odd);
    }

    static void sumOddIndices(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) sum += arr[i];
        System.out.println("14. Sum at odd indices: " + sum);
    }

    static void checkAllPositive(int[] arr) {
        boolean allPositive = true;
        for (int val : arr) {
            if (val < 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println("15. All positive: " + allPositive);
    }

    static void firstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int val : arr) map.put(val, map.getOrDefault(val, 0) + 1);
        int res = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
                break;
            }
        }
        System.out.println("16. First non-repeating: " + res);
    }
}











