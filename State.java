public class State {

    private String stateName;
    private int population;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {

        return "State Name: " + stateName + ". Population: " + population + ".";
    }
}