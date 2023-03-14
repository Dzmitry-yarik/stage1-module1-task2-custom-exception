package com.epam.mjc;


class MyException extends IllegalArgumentException {
    MyException(long s) {
        System.out.println("Could not find student with ID " + s);
    }
}

public class StudentManager {
    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        for (long i = 0; i < IDs.length-1; i++) {
            if (studentID > 11 || studentID < 1) {
                throw new MyException(studentID);
            }

        }
        return Student.getValueOf(studentID);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length-1; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }
    }

}
