package generation;

public enum Card {

    KILLGREY("Make sure that grey does not exist. \n If you play grey, or grey is not in the game, occupy 24 provinces."),
    KILLGREEN("Make sure that green does not exist. \n If you play green, or green is not in the game, occupy 24 provinces."),
    KILLYELLOW("Make sure that yellow does not exist. \n If you play yellow, or yellow is not in the game, occupy 24 provinces."),
    KILLBLUE("Make sure that blue does not exist. \n If you play blue, or blue is not in the game, occupy 24 provinces."),
    KILLRED("Make sure that red does not exist. \n If you play red, or red is not in the game, occupy 24 provinces."),
    CONQ1("Conquer the following: Asia and South America."),
    CONQ2("Conquer the following: Asia and Africa."),
    CONQ3("Conquer the following: North America and Africa."),
    CONQ4("Conquer the following: North America and Australasia."),
    CONQ5("Conquer the following: Europe, South America and a 3rd continent of your choice."),
    CONQ6("Conquer the following: Europe, Oceania and a 3rd continent of your choice. "),
    OCC1(" Occupy 18 territories with at least 2 armies in each territory. "),
    OCC2(" Occupy 24 territories with any amount of armies in each territory. ");

    private String description;


    Card (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
