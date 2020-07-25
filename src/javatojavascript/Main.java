package javatojavascript;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends JavaToJavaScript{

    public static void main(String[] args ) {

        System.out.println("\nThe following code should be added into an empty VSCode project:\n");

        /*
        needs to parse over data and reformat code to be javascript in nature

        could just start with one string hard-coded example to learn
         */
        String exampleJavaProject =
                "public static void main(String[] args) {\n" +
                "\n" +
                "        String stringQuestion = \"What is the difference between\\n\" +\n" +
                "                \"a ' and a \\\"?  Or between a \\\" and a \\\\\\\"?\";\n" +
                "        String stringAnswer = \"One is what we see when we're typing our program.\\n\" +\n" +
                "                \"The other is what appears on the \\\"console.\\\"\";\n" +
                "\n" +
                "        Scanner input;\n" +
                "        input = new Scanner(System.in);\n" +
                "        System.out.println(stringQuestion);\n" +
                "        String userAnswer = input.next();\n" +
                "        input.close();\n" +
                "        System.out.println(\"You said: \" + userAnswer);\n" +
                "        System.out.println(\"The answer: \" + stringAnswer);\n" +
                "    }";



        StringSplitter splitExampleJavaProject = new StringSplitter(exampleJavaProject);
        splitExampleJavaProject.setSplitExampleJavaProject(splitExampleJavaProject.getExampleJavaProject());

        ArrayList<String> splitJavaLines = new ArrayList();

        for (String javaExampleLine : splitExampleJavaProject.getSplitExampleJavaProject()) {
            splitJavaLines.add(javaExampleLine.trim());
        }

        for(int i = 0; i < splitJavaLines.size(); i++) {
            //System.out.println(splitJavaLines.get(i));
            if (!translateJavaLineToJavaScript(splitJavaLines.get(i)).equals("")) {
                System.out.println(translateJavaLineToJavaScript(splitJavaLines.get(i)));
            }
        }



    }
}
