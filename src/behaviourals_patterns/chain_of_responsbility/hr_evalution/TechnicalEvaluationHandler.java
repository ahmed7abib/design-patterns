package behaviourals_patterns.chain_of_responsbility.hr_evalution;

public class TechnicalEvaluationHandler extends BaseHandler {

    public TechnicalEvaluationHandler() {
        setCurrentHandler(this);
    }

    @Override
    public void handleRequest(JobApplication request) {
        if (isValidRequest(request)) {
            request.setComments("Technical Evaluation = 9.5/10");
        }

        pointerToNext(request);
    }

    @Override
    public Boolean isValidRequest(JobApplication request) {
        return request.getApplicationName() != null;
    }
}
