package behaviourals_patterns.chain_of_responsbility.form;

public abstract class BaseFormHandler {

    private BaseFormHandler currentHandler;
    private BaseFormHandler nextHandler;

    public void setNextHandler(BaseFormHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void setCurrentHandler(BaseFormHandler currentHandler) {
        this.currentHandler = currentHandler;
    }

    public abstract void handleRequest(FormRequest request);

    public abstract Boolean isValidRequest(FormRequest request);

    protected void toNextChain(FormRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Process ended at: " + currentHandler.getClass().getName());
        }
    }
}
