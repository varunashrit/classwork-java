package test;
import java.util.*;

class ggg {
    private static void getMissingChar(){
        String str = "baADfecgi".toLowerCase();
        int length = str.length();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){           
            char c = str.charAt(i);
            arr[i]=(int)c;
        }
        Arrays.sort(arr);
        
        for(int i : arr){
            System.out.println(i);
        }
        int count=0;
        while(count<length){            
            int first = arr[0];
            if(str.indexOf(first+count)>=0){
                count++;
                continue;
            }else{
                System.out.println("Missing Character is ::"+String.valueOf(Character.toChars(first+count)));
                break;
            }
        }       
    }

    public static void main(String[] args) {
        getMissingChar();
    }
}
