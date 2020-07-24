package javatojavascript;

public abstract class JavaToJavaScript {


    public static String translateJavaLineToJavaScript(String line) {

        //String javaScriptTranslation = "";

        if (line.equals("public static void main(String[] args) {")){
            return "W";
        } if (line.equals("String stringQuestion = \"What is the difference between\\n\" +")){
            return "W";
        } if (line.equals("\"a ' and a \\\"?  Or between a \\\" and a \\\\\\\"?\";")){
            return "W";
        } if (line.equals("String stringAnswer = \"One is what we see when we're typing our program.\\n\" +")){
            return "W";
        } if (line.equals("\"The other is what appears on the \\\"console.\\\"\";")){
            return "W";
        } if (line.equals("Scanner input;")){
            return "W";
        } if (line.equals("input = new Scanner(System.in);")){
            return "W";
        } if (line.equals("System.out.println(stringQuestion);")){
            return "W";
        } if (line.equals("String userAnswer = input.next();")){
            return "W";
        } if (line.equals("input.close();")){
            return "W";
        } if (line.equals("System.out.println(\"You said: \" + userAnswer);")){
            return "W";
        } if (line.equals("System.out.println(\"The answer: \" + stringAnswer);")){
            return "W";
        } if (line.equals("}")){
            return "W";
        } else {
            return ""; //blank line
        }


    }
}
