package SinglePackagePrograms;

public class Spikey {

    public static void main(String[] args) {

        String lineOnePrint = "  \\/  \n";
        String lineTwoPrint = " \\\\// \n";
        String lineThreePrint = "\\\\\\///\n";
        String lineFourPrint = "///\\\\\\\n";
        String lineFivePrint = " //\\\\ \n";
        String lineSixPrint = "  /\\  \n";

        String forwardSlashPrint = lineOnePrint + lineTwoPrint + lineThreePrint;
        String backwardSlashPrint = lineFourPrint + lineFivePrint + lineSixPrint;

        String lineToPrint = forwardSlashPrint + backwardSlashPrint;

        System.out.println(lineToPrint);
    }
}



//    Write a complete Java program in a class named Spikey that prints the following output:
//
//                \/
//               \\//
//              \\\///
//              ///\\\
//               //\\
//                /\

//   https://practiceit.cs.washington.edu/problem/view/bjp5/chapter1/e2-Spikey