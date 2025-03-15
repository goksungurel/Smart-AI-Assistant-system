public class LanguageTranslatorAssistant extends VirtualAssistant{
private String lastTranslatedWord;
public LanguageTranslatorAssistant(String assistantName,String version){
    super(assistantName, version);
    this.lastTranslatedWord = "None";
}
String greetUser(){
    return "Bonjour! Hola! Hello! I’m your Language Translator AI!";
}
String performTask(String task){
   if(task.equalsIgnoreCase("translate hello to Spanish")){
       lastTranslatedWord="Hola";
       return "Hello in Spanish is Hola.";
   }else if(task.equalsIgnoreCase("translate thank you to French")){
       lastTranslatedWord="Merci";
       return "Thank you in French is Merci.";
   }
   return "I don't know that language yet.";
}
}
