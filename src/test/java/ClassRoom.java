public class ClassRoom {
    private int number;
    private int numberOfPlaces;
    private String square;


    public ClassRoom(int number, int numberOfPlaces, String square) {
        this.number = number;
        this.numberOfPlaces = numberOfPlaces;
        this.square = square;
    }

    public ClassRoom() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

}
