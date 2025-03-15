import java.util.List;
import java.util.ArrayList;
public class AssistantManager {
private List<VirtualAssistant> assistants;
public AssistantManager() {
    this.assistants=new ArrayList<>();

}
public void addAssistant(VirtualAssistant assistant){
    assistants.add(assistant);
    System.out.println(assistant.getAssistantName()+"added.");
}
public void removeAssistant(VirtualAssistant assistant){
    assistants.remove(assistant);
    System.out.println(assistant.getAssistantName()+"removed.");
}
public List<String> interactWithAll(String task){
        List<String> responses=new ArrayList<>();
        for(VirtualAssistant assistant:assistants){
            String greeting=assistant.greetUser();
            String response=assistant.performTask(task);

            responses.add(greeting);
            responses.add(response);
            System.out.println(greeting);
            System.out.println(response);
        }
        return responses;
}
}
