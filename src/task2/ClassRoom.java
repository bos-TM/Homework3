package task2;

public class ClassRoom {
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom() {
        this.pupil1 = new ExcellentPupil();
        this.pupil2 = new GoodPupil();
        this.pupil3 = new BadPupil();
        this.pupil4 = new GoodPupil();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = new ExcellentPupil();
        this.pupil4 = new GoodPupil();
    }

    public ClassRoom(Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = new BadPupil();
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }
}
