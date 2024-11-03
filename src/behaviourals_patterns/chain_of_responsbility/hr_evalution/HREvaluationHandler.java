package behaviourals_patterns.chain_of_responsbility.hr_evalution;

public class HREvaluationHandler extends BaseHandler {

    public HREvaluationHandler() {
        setCurrentHandler(this);
    }

    @Override
    public void handleRequest(JobApplication request) {
        if (isValidRequest(request)) {
            request.setComments("HR Evaluation = 9/10");
        }

        pointerToNext(request);
    }

    @Override
    public Boolean isValidRequest(JobApplication request) {
        return request.getJobTitle() != null && request.getJobCode() != null;
    }
}