public class SimpleDotComGame {

    public static void main(String [] args) {

        int numOfGuesses = 0;
        GetHelper helper = new GetHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int [] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive) {
            System.out.println("before");
            String guess = helper.getUserInput("enter a number");
                String result = theDotCom.checkYourself(guess);
                numOfGuesses ++;
                if(result.equals("kill")) {
                    isAlive = false;
                    System.out.println("You took" + numOfGuesses + "guesses");
                }

        }

    }

}
