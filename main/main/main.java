package main.main;

public class main {

    public static int countTrue(boolean[] arr) {
		int count = 0;
    for(int i = 0; i<arr.length; i++){
        if (arr[i] == true) {
            count++;
            
        }
    }
    return count;
    }
    public static void main(String[] args) {
        countTrue(new boolean[]{true, false, false, true, false});
    }
    
}
