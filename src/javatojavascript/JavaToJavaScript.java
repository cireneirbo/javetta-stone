package javatojavascript;

public abstract class JavaToJavaScript {


    public static String translateJavaLineToJavaScript(String line) {

        //String javaScriptTranslation = "";

        if (line.equals("public static void main(String[] args) {")){
            return "function main() { ";
        } if (line.equals("String stringQuestion = \"What is the difference between\\n\" +")){
            return "    const stringQuestion = \"What is the difference between\\n\" +";
        } if (line.equals("\"a ' and a \\\"?  Or between a \\\" and a \\\\\\\"?\";")){
            return "        \"a ' and a \\\"?  Or between a \\\" and a \\\\\\\"?\";";
        } if (line.equals("String stringAnswer = \"One is what we see when we're typing our program.\\n\" +")){
            return "    const stringAnswer = \"One is what we see when we're typing our program.\\n\" +";
        } if (line.equals("\"The other is what appears on the \\\"console.\\\"\";")){
            return "        \"The other is what appears on the \\\"console.\\\"\";";
        } if (line.equals("Scanner input;")){
            return "    const input = require('readline-sync');";
        } if (line.equals("System.out.println(stringQuestion);")){
            return "    let userAnswer = input.question(stringQuestion);";
        } if (line.equals("System.out.println(\"You said: \" + userAnswer);")){
            return "    console.log(\"You said: \" + userAnswer);";
        } if (line.equals("System.out.println(\"The answer: \" + stringAnswer);")){
            return "    console.log(\"The answer: \" + stringAnswer);";
        } if (line.equals("}")){
            return "}";
        } else {
            return ""; //blank line
        }


    }
}
