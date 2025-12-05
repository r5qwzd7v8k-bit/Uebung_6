package h2;


import java.util.Arrays;

public class h2_main {

public static void main(String[] args) {
int[] a = {1, 2, 3};
int[] b = {1, 2, 4};
int[] c = {1, 3, 2};
int[] d = {1, 2};
int[] e = {1, 3, 2, 3};


System.out.println("compareArrays(a, b): " + compareArrays(a, b)); 
System.out.println("compareArrays(a, c): " + compareArrays(a, c)); 
System.out.println("compareArrays(a, d): " + compareArrays(a, d)); 
System.out.println("compareArrays(e, a): " + compareArrays(e, a)); 
System.out.println("compareArrays(a, e): " + compareArrays(a, e)); 
}


public static boolean compareArrays(int[] a, int[] b) {
return Arrays.equals(a, b);
}
}