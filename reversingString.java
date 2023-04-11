package Addtwonumbers;

public class reversingString {
    public static void main(String[] args) {
        String originalStr="hello";
        String reversedStr="";
        for(int i=0;i<originalStr.length();i++){
            reversedStr=originalStr.charAt(i)+reversedStr;
        }
        System.out.println("Reversed String: "+reversedStr);
    }
}
