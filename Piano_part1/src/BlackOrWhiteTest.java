public class BlackOrWhiteTest {
    public static void main(String[] args) throws java.lang.Exception {
        int octave = 1;
        for (int i = 1, j=1, k=1; i<1000; i++, j++, k++){
            System.out.println(i + " "+  BlackOrWhiteTest.blackOrWhiteKey(i));
            if (j%88==0){
                j = 0;
                System.out.println("<----" + " start from beginning ---->");
                k =0;
            } else if (k%12==0) {
                System.out.println("------->" + octave + " octave");
                octave++;
            }
        }
    }

    public static String blackOrWhiteKey(int keyCount) {
        if (keyCount>=88){         // there are 88 keys of the keyboard
            keyCount = keyCount%88;

            if (keyCount%88==0){   //the last key from keyboard, it can't be 0 for further calculations purpose
                keyCount=1;
            }
        }
        if (keyCount >= 12) {      // keyboard scheme repeats every 12 keys
            keyCount = keyCount%12;
        }
        // these are black keys (starting counting from the beginning of the keyboard); 12th key is of value 0
        return (keyCount == 2 || keyCount == 5 || keyCount == 7 || keyCount == 10 || keyCount == 0) ? "black" : "white";
    }
}
