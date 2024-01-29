package cipher;

// src/main/resources/
// [0.08167,0.01462,0.02782,0.04253,0.12702,0.02228,0.02015,0.06094,0.06966,0.00153,0.00772,0.04025,0.02406,0.06749,0.07707,0.01929,0.00095,0.05987,0.06327,0.09056,0.02758,0.00978,0.02360,0.00150,0.01974,0.00074]

public class App {
    public static void main(String[] args){

    }

    public static double findMin(double[] array){
        double currentMin = Double.MAX_VALUE;
        for(int i = 0;i < array.length;i++){
            if(currentMin > array[i]){
                currentMin = array[i];
            }
        }
        return currentMin;
    }

    public static char encode(char charToShift,int shift){
        int decimalChar = (int)charToShift;//convert from ascii character to decimal
        if((65 <= decimalChar && decimalChar <= 90) || (97 <= decimalChar && decimalChar <= 122)){//check if letter
            shift = shift % 26;
            if(shift < 0){//if the shift is negative, convert it to the positive version of the shift
                shift += 26;//!shift = 26 - shift;
            }
            decimalChar+= shift;
        }else{
            return 0;
        }

        // System.out.println((char) decimalChar);
        return (char)decimalChar;
    }

    public static int[] countLetters(String line){
        int[] counts = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        line = line.toUpperCase();
        for(int i = 0;i < line.length();i++){
            char current = line.charAt(i);
            int decimalChar = (int)current;
            if(65 <= decimalChar && decimalChar <= 90){
                decimalChar -= 65;
            }else{
                return null;
            }
        }
        return null;
    }
}
