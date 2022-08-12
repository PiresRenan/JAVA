package JAVA_CONVERSIONS;
class StringToHex {
    public static void main(String[] args) {
        String hex = "a";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);

        //more example
        System.out.println(Integer.parseInt("a", 16));
        System.out.println(Integer.parseInt("f", 16));
        System.out.println(Integer.parseInt("121", 16));
    }
}
