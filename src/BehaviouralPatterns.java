import behaviourals_patterns.chain_of_responsbility.form.FormRequest;
import behaviourals_patterns.chain_of_responsbility.form.ManagerEvaluation;
import behaviourals_patterns.chain_of_responsbility.form.SuperHeadEvaluation;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.HREvaluationHandler;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.JobApplication;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.TechnicalEvaluationHandler;

public class BehaviouralPatterns {

    public static void main(String[] args) {

        System.out.println("----------------- Chain Of Responsibility -------------------");
        coRDemo();
    }

    private static void coRDemo() {
        System.out.println("Example 1");

        JobApplication jobApplication = new JobApplication();
        jobApplication.setJobCode("1210131");
        jobApplication.setJobTitle("Android Developer");
        // jobApplication.setApplicationName("Ahmed");

        HREvaluationHandler hrEvaluationHandler = new HREvaluationHandler();
        TechnicalEvaluationHandler technicalEvaluationHandler = new TechnicalEvaluationHandler();
        technicalEvaluationHandler.setNextHandler(hrEvaluationHandler);

        technicalEvaluationHandler.handleRequest(jobApplication);

        System.out.println(jobApplication.getComments());

        System.out.println("Example 2 \n");

        FormRequest formRequest = new FormRequest();
        formRequest.setFormName("Mobile Team Evaluation");

        ManagerEvaluation managerEvaluation = new ManagerEvaluation();
        SuperHeadEvaluation superHeadEvaluation = new SuperHeadEvaluation();
        managerEvaluation.setNextHandler(superHeadEvaluation);

        managerEvaluation.handleRequest(formRequest);

        System.out.println(formRequest);
    }
}
