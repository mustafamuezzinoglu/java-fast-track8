package m05_string;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "     ";
        System.out.println(s1.isEmpty()); //true
        System.out.println(s2.isEmpty()); //false

        System.out.println(s1.isBlank()); // true
        System.out.println(s2.isBlank()); // true because all white spaces

        System.out.println(s1.length()); //0
        System.out.println(s2.length()); //5


        String s3 = "hello cydeo";
        System.out.println(s3.charAt(0));
        System.out.println(s3.charAt(6));
        System.out.println(s3.charAt(s3.length()-1));

        System.out.println(s3.substring(0,4)); //hell
        System.out.println(s3.substring(0,5)); //hello

        System.out.println(s3.substring(6)); //cydeo 6 to end
        System.out.println(s3.substring(6,10)); //cyde 6 to 9

        System.out.println(s3.indexOf('y'));     //is index of y character
        System.out.println(s3.indexOf("cyd"));     //is stating point of cyd
        System.out.println(s3.indexOf("java"));  //-1 if not found
        System.out.println(s3.lastIndexOf('e'));  //9 seraches from end and returns index

        System.out.println(s3.toLowerCase()+ " - " + s3.toUpperCase());

        System.out.println(s3.replace("cydeo","world"));
        System.out.println(s3.replace("e","E"));

        String s4 = "AB12C54D3";
        System.out.println(s4.replaceAll("\\d", ""));
        System.out.println(s4.replaceAll("[A-Z]", ""));

        System.out.println(s4.contains("AB"));
        System.out.println(s4.contains("J"));




            }
}
