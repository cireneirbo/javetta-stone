package SinglePackagePrograms;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Storytime {

    public static void main(String[] args) {

        story();


    }

    public static void story() {
        ArrayList<String> storyBoardArray = new ArrayList<>();
        storyBoardArray.add("{^-^}");
        storyBoardArray.add("{'-'}");
        storyBoardArray.add("{*_*}");
        storyBoardArray.add("{=-=}");
        storyBoardArray.add("{b.b}");
        storyBoardArray.add("{d.d}");
        storyBoardArray.add("{^o^}");
        storyBoardArray.add("{._.}");

        for (int i = 0; i < 12; i++){

            String storyGaps = "\n";
            String leftStep = "\n   ^ ";
            String rightStep = "\n ^   ";

            if(i % 2 == 0) {
                System.out.println(storyBoardArray.get(4) + leftStep + storyGaps);
            } else {
                System.out.println(storyBoardArray.get(5) + rightStep + storyGaps);
            }



            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
