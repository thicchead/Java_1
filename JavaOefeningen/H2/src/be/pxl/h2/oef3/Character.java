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
    private String[] titles = new String[MAX_TITLES];

    public Character(String firstName, String lastName, String house, String portrayedBy) {
        this(firstName, lastName, "", house, 0, 0, 0, portrayedBy);
    }

    public Character(String firstName, String lastName, String nickName, String house, String portrayedBy) {
        this(firstName, lastName, nickName, house, 0, 0, 0, portrayedBy);
    }

    public Character(String firstName, String lastName, String nickName, String house, int firstSeason, int lastSeason, int episodes, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.house = house;
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
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

    public boolean getDate() {
        return firstSeason != 0 || lastSeason != 0 || episodes != 0;
    }

    public void addTitle(String title) {
        int i = 0;
        if (titles[i] == null) {
            titles[i] = title;
        } else if (titles[i + 1] == null) {
            titles[i + 1] = title;
        } else {
            titles[i + 2] = title;
        }
    }

    public String toString() {
        String eindString = "";
        if (nickName.equals("")) {
            eindString += String.format("%s %s of house %s%n", firstName, lastName, house);
        } else {
            eindString += String.format("%s \"%s\" %s of house %s%n", firstName, nickName, lastName, house);
        }
        for (String title : titles) {
            if (title == null) {
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
    }
}
// addtitle fixen