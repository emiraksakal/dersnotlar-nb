package ll;

/**
 *
 * @author btek    (modified by cmshalom)
 * @version 2020 
 * 
 */
public class MeasureTime {
	public static final int LOW = -100;
	public static final int HIGH = 100;

    public static void main(String[] args) {
        int N = 8000;
        int[] a = createRandomIntArray(N);
        printArray(a);
        long t1= System.nanoTime();
        System.out.println("Number of zeros: "+countZeros(a));
        long t2= System.nanoTime();
        System.out.println("\n N is "+N+" ,Time: "+(t2-t1)+" nano seconds");

        t1= System.nanoTime();
        System.out.println("Number of null triples: "+threeSum(a));
        t2= System.nanoTime();
        System.out.println("\n N is "+N+" ,Time: "+(t2-t1)+" nano seconds");
    }
    
    /**
     * Creates an array of n integers each of which is chosen uniformly at random
     * between LOW and HIGH 
     * @param n
     * @return
     */
    public static int[] createRandomIntArray(int n){
        int[] ret = new int [n];
        for (int i=0; i<ret.length;i++ ){
            ret[i]=(int)(Math.random()*(HIGH-LOW+1)+LOW);
        }
        
        return ret;
    }
    
    /**
     * Prints the array a in one line, elements separated by commas
     * @param a
     */
    public static void printArray(int[] a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
  
    /**
     * @param a
     * @return the number of zeros in a
     */
    public static int countZeros(int[] a){
        int cnt=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0)
                cnt++;
        }
        return cnt;
    }
    
    /**
     * @param a
     * @return  the number of triples of distinct elements of a that sum up to 0
     */
    public static int threeSum(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}