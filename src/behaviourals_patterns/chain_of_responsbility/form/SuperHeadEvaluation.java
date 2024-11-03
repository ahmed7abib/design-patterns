package behaviourals_patterns.chain_of_responsbility.form;

public class SuperHeadEvaluation extends BaseFormHandler {

    public SuperHeadEvaluation() {
        setCurrentHandler(this);
    }

    @Override
    public void handleRequest(FormRequest request) {
        if (isValidRequest(request)) {
            request.setSuperHeadEvaluation("SuperHead evaluation = 8");
        }

        toNextChain(request);
    }

    @Override
    public Boolean isValidRequest(FormRequest request) {
        return request.getManagerEvaluation() != null;
    }
}
