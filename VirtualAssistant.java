public abstract class VirtualAssistant {
    private String assistantName;
    private String version;

    public VirtualAssistant(String assistantName, String version) {
        this.assistantName = assistantName;
        this.version = version;
    }
    public String getAssistantName(){
        return assistantName;
    }
    public String getVersion(){
        return version;
    }
    public void setAssistantName(String assistantName){
        this.assistantName = assistantName;
    }
    public void setVersion(String version){
        this.version = version;
    }
    abstract String greetUser();
    abstract String performTask(String task);

}
