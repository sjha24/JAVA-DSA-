import java.util.Scanner;

// import javax.xml.validation.SchemaFactoryConfigurationError;

// package binaryToDecimal;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binary = scn.next();
        int power = 1, decimal = 0;
        for(int bit = binary.length()-1; bit>=0; bit--){
            if(binary.charAt(bit)=='1'){
                decimal = decimal + power;
            }
            power = power*2;
        }
        System.out.println(decimal);
    }
}
