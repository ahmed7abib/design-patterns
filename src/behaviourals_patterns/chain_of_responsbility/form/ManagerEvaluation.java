package behaviourals_patterns.chain_of_responsbility.form;

public class ManagerEvaluation extends BaseFormHandler {

    public ManagerEvaluation() {
        setCurrentHandler(this);
    }

    @Override
    public void handleRequest(FormRequest request) {
        if (isValidRequest(request)) {
            request.setManagerEvaluation("Manager evaluation = 9");
        }

        toNextChain(request);
    }

    @Override
    public Boolean isValidRequest(FormRequest request) {
        return request.getFormName() != null;
    }
}
