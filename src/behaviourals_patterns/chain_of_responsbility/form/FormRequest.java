package behaviourals_patterns.chain_of_responsbility.form;

public class FormRequest {

    private String formName;
    private String managerEvaluation;
    private String superHeadEvaluation;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getManagerEvaluation() {
        return managerEvaluation;
    }

    public void setManagerEvaluation(String managerEvaluation) {
        this.managerEvaluation = managerEvaluation;
    }

    public String getSuperHeadEvaluation() {
        return superHeadEvaluation;
    }

    public void setSuperHeadEvaluation(String superHeadEvaluation) {
        this.superHeadEvaluation = superHeadEvaluation;
    }

    @Override
    public String toString() {

        return "Form Name = " + formName + "\n" +
                "Manager Evaluation = " + managerEvaluation + "\n"
                + "SuperHead Evaluation = " + superHeadEvaluation;
    }
}
