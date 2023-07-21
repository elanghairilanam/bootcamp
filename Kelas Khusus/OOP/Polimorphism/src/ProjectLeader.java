public class ProjectLeader extends Employee {

    private int totalProject;

    public ProjectLeader(String name, int age, String companyName, int totalProject) {
        super(name, age, companyName);
        this.totalProject = totalProject;
    }

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }

    @Override
    public void greeting() {
        System.out.println("Hallo, nama saya "+ super.getName() + ", berumur " + super.getAge() + " tahun");
        System.out.println("Saya Bekerja di " + super.getCompanyName());
        System.out.println("Saya telah memimpin " + getTotalProject() + " project");
        System.out.println("Saya adalah Project Leader utama di "+ super.getCompanyName());
    }
}
