import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;

    public String checkYourself(String userInput) {

        String result = "miss"; //default
        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            }

            else {
                result = "hit";
            }
        }
        return result;

    }

    public void setLocationCells(int [] locs) {
        locationCells = locs;
    }
}
