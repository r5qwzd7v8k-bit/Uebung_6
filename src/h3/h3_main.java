package h3;


import java.util.HashMap;
import java.util.Map;

public class h3_main {

public static void main(String[] args) {
int[] a = {1, 2, 3};
int[] c = {1, 3, 2};
int[] f = {1, 1, 2};


System.out.println("compareArraysVal(a, c): " + compareArraysVal(a, c)); 
System.out.println("compareArraysVal(c, a): " + compareArraysVal(c, a)); 
System.out.println("compareArraysVal(f, a): " + compareArraysVal(f, a)); 
}


public static boolean compareArraysVal(int[] a, int[] b) {
if (a == null || b == null || a.length != b.length) {
return false;
}


Map<Integer, Integer> countsA = new HashMap<>();
for (int element : a) {
countsA.put(element, countsA.getOrDefault(element, 0) + 1);
}


Map<Integer, Integer> countsB = new HashMap<>();
for (int element : b) {
countsB.put(element, countsB.getOrDefault(element, 0) + 1);
}


return countsA.equals(countsB);
}
}