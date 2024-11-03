package behaviourals_patterns.chain_of_responsbility.hr_evalution;

public abstract class BaseHandler {

    private BaseHandler nextHandler;
    private BaseHandler currentHandler;

    public void setCurrentHandler(BaseHandler currentHandler) {
        this.currentHandler = currentHandler;
    }

    public void setNextHandler(BaseHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(JobApplication request);

    public abstract Boolean isValidRequest(JobApplication request);

    protected void pointerToNext(JobApplication request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            request.setComments("Ended at: " + currentHandler.getClass().getName());
        }
    }
}
