public class PhraseOMatic {

    public static void main (String[] args) {

        String[] wordListOne = {"24/7" ,"multi-Tiar",
        "30,OOO foot", "B-to-B" , "win-win" , "front-end" ,
        "web-based" , "pervasive", "smart", "six-sigma",
         " critical -path" , "dynamic"};

        String[] wordListTwo = { "empowered", "sticky",
        "value-added.", "oriented", "centric", "distributed",
        "clustered", "branded", "outaide-the-box", "positioned",
        "networked", " focused" , "leveraged", "aligned",
        "targeted", "shared" , "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point",
        "solution", "architecture", "core competency" ,
        "strategy", "mindshare", "portal" , "apace" , "vision",
        "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase =  wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("The phrase is: " + phrase);
    }
}
