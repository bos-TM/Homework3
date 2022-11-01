package task2;

public class Main {
    public static void main(String[] args) {
       Pupil pupil1 = new ExcellentPupil();
       Pupil pupil2 = new GoodPupil();
       Pupil pupil3 = new BadPupil();

       ClassRoom classRoom1 = new ClassRoom();
       classRoom1.pupil1.study();
       classRoom1.pupil2.study();
       classRoom1.pupil3.study();
       classRoom1.pupil4.study();

       System.out.println("-----------------------");

       ClassRoom classRoom2 = new ClassRoom(pupil1, pupil2, pupil3);
       classRoom2.pupil1.study();
       classRoom2.pupil2.study();
       classRoom2.pupil3.study();
       classRoom2.pupil4.study();
    }
}