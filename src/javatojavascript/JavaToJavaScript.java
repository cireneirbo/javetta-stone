package javatojavascript;

public abstract class JavaToJavaScript {


    public static String translateJavaLineToJavaScript(String line) {

        if (line.equals("public static void main(String[] args) {")){
            return "W";
        } else {
            return "M";
        }


    }
}
