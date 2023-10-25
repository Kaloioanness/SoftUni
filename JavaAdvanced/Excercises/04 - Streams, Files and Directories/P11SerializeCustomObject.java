package JavaAdvanced.Excercises.StreamsFilesDirectories;

import java.io.*;

public class P11SerializeCustomObject {
    static class Course implements Serializable {
        String name;
        int numberOfStudents;

        public Course(String name, int numberOfStudents) {
            this.name = name;
            this.numberOfStudents = numberOfStudents;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course("Java-Advanced",200);
        String path = "C:\\Users\\zaekb\\Desktop\\course.ser";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        objectOutputStream.writeObject(course);
        Course deserialized = (Course) objectInputStream.readObject();
        System.out.println();
    }

}
