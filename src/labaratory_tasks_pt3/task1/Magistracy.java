package labaratory_tasks_pt3.task1;
class Magistracy extends Student {
    private String scientificWork;

    public Magistracy(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 8) {
            return 200;
        } else {
            return 180;
        }
    }
}