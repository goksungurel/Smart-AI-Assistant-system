public class HomeAssistant extends VirtualAssistant{
    private boolean isLightOn;
    public HomeAssistant( String version,String assistantName) {
        super(assistantName,version);
        this.isLightOn = false;
    }
    public boolean isLightOn(){
        return isLightOn;
    }
    public void setLightOn(boolean lightOn){
        isLightOn = lightOn;
    }
    public String greetUser(){
        return "Hello! I’m your Home Assistant. How can I help to control your home today?";
    }
    public String performTask(String task) {
        if (task.equalsIgnoreCase("turn on lights")) {

            if (isLightOn) {
                return "The light are already turned on.";
            }

            setLightOn(true);
            return "Turning on the lights!";
        }

        if(task.equalsIgnoreCase("turn off lights")) {

            if(!isLightOn) {
                return "The light are already turned off.";
            }

            setLightOn(false);
            return "Turning off the lights!";
        }
        return "Sorry,I can't do that!";
    }

}
