import jade.core.*;

public class Main {

    public static void main(String[] args) {
    String [] argsAgent = {"-gui","-agents", "WebBot:agents.WebBotAgent(\"innovacion\");FbBot:agents.FacebookBotAgent;PipelineBot:agents.PipelineBotAgent"};
    jade.Boot.main(argsAgent);


    }
}
