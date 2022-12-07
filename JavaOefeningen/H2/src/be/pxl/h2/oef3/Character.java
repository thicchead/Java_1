package be.pxl.h2.oef3;

public class Character {
    public static final int MAX_TITLES = 3;
    private static int count;
    private String lastName;
    private String firstName;
    private String nickName;
    private String house;
    private int firstSeason;
    private int lastSeason;
    private int episodes;
    private String portrayedBy;
    private int numberOfTitles;
    private String[] titles;

    public Character(String firstName, String lastName, String house, String portrayedBy) {
        this(firstName, lastName, "", house, 0, 0, 0, portrayedBy);
    }

    public Character(String firstName, String lastName, String nickName, String house, String portrayedBy) {
        this(firstName, lastName, nickName, house, 0, 0, 0, portrayedBy);
    }

    public Character(String firstName, String lastName, String nickName, String house, int firstSeason, int lastSeason, int episodes, String portrayedBy) {
        this.firstName = firstName;
        titles = new String[MAX_TITLES]; // mevrouw heeft dit gedaan
        this.lastName = lastName;
        setNickName(nickName);
        this.house = house;
        setData(firstSeason, lastSeason, episodes);
        this.portrayedBy = portrayedBy;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setData(int firstSeason, int lastSeason, int episodes) {
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void addTitle(String title) {
        for (String x : titles) {
            if (x != null) {
                numberOfTitles++;
                if (numberOfTitles == 3) {
                    numberOfTitles = 2;
                }
            }
        }

        if (numberOfTitles < MAX_TITLES) {
            titles[numberOfTitles] = title;
        }
    }

    public String toString() {
        String output = firstName;
        if (!nickName.isEmpty()){
            output += " \"" + nickName + "\"";
        }
        output += " " + lastName + " of house " + house + "\n";
        for (String x : titles) {
            if (x != null) {
                output += "*** " + " \"" + x + "\" " + "\n";
            }
        }
        output += "Played by: " + portrayedBy;
        if (firstSeason != 0){
            output += " in season " + firstSeason + " - " + lastSeason + " (" + episodes + " episodes)";
        }

        return output;
    }

/*    public String toString() {
        String eindString = "";
        if (nickName.equals("")) {
            eindString += String.format("%s %s of house %s%n", firstName, lastName, house);
        } else {
            eindString += String.format("%s \"%s\" %s of house %s%n", firstName, nickName, lastName, house);
        }
        for (String title : titles) {
            if (title == null) { // --> helemaal geen nut, zet dingen die iets doen in de IF
                eindString += "";
            } else {
                eindString += String.format("*** %s%n", title);
            }
        }
        if (!getDate()) {
            eindString += String.format("Played by: %s", portrayedBy);
        } else {
            eindString += String.format("Played by: %s in season %d-%d (%d episodes)", portrayedBy, firstSeason, lastSeason, episodes);
        }

        return eindString;
    } */

}
