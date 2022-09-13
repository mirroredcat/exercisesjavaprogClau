package be.abis.courseadmin.enums;

public enum Gender {
    MALE("m", "he", "his", "him"),
    FEMALE("f", "she", "her", "her"),
    OTHER("x", "they", "their", "them");

    private String type;
    private String personalPronoun;
    private String possessivePronoun;
    private String reflexivePronoun;

    Gender(String type, String personalPronoun, String possessivePronoun, String reflexivePronoun) {
        this.type = type;
        this.personalPronoun = personalPronoun;
        this.possessivePronoun = possessivePronoun;
        this.reflexivePronoun = reflexivePronoun;
    }

    public String getType() {
        return type;
    }

    public String getPersonalPronoun() {
        return personalPronoun;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }

    public String getReflexivePronoun() {
        return reflexivePronoun;
    }
}
