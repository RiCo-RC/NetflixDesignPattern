public class HandlerRequest {
    private ETypeRequest type = "LOGGER";
    private String request = "";
    private String conclusion = "";

    public HandlerRequest(ETypeRequest type, String request) {
        this.type = type;
        this.request = request;
    }

    public ETypeRequest getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public void display(Boolean showRequest) {
        if (showRequest) System.out.println(this.request);
        System.out.println(this.conclusion);
    }
}