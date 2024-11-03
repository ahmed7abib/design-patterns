package behaviourals_patterns.chain_of_responsbility.hr_evalution;

public class JobApplication {

    private String jobCode;
    private String jobTitle;
    private String applicationName;
    private final StringBuilder comments = new StringBuilder();

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setComments(String comments) {
        this.comments.append("\n");
        this.comments.append(comments);
    }

    public String getComments() {
        return this.comments.toString();
    }
}
