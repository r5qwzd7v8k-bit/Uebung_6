package h1;


public class h1_main {


public static boolean isMirrorArray(int[] a, int[] b) {
 
if (a.length != b.length) {
return false;
}

int n = a.length;

for (int i = 0; i < n; i++) {

if (a[i] != b[n - 1 - i]) {

return false;
}
}


return true;
}


}