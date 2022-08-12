package JAVA_CONVERSIONS;
class IntToBinary {
    public static void main(String[] args) {
        String binaryString="1010";
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);

        //more example
        System.out.println(Integer.parseInt("1010",2));
        System.out.println(Integer.parseInt("10101",2));
        System.out.println(Integer.parseInt("11111",2));

    }
}
