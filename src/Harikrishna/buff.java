package Harikrishna;

public class buff {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hari");
        StringBuffer buffer1 = new StringBuffer("krish");
         buffer1.append("na");
        System.out.println(buffer);
        System.out.println(buffer1);

        StringBuilder build = new StringBuilder("ganesh");
        build.append("ram");
        System.out.println(build);
    }
}
