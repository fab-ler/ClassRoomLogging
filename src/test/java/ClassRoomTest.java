public class ClassRoomTest {
    public static void main(String[] args) {
        ClassRoom classroom = new ClassRoom();
        classroom.setNumber(1618);
        classroom.setNumberOfPlaces(13);
        ClassRoom classroom2 = new ClassRoom(1618, 13, "двести");
        if (classroom.equals(classroom2)) {
            System.out.println("ОДИНАКОВЫЕ");
        }
        System.out.println(classroom);
        System.out.println(classroom2);
    }

}
