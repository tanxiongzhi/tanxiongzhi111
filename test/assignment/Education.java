public class Education {
    public  Education(){}

    private String degree;
    private String major;

    public Education(String degree, String major, int research) {
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    private int research;

    public int getResearch() {
        return research;
    }

    public void setResearch(int research) {
        this.research = research;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
