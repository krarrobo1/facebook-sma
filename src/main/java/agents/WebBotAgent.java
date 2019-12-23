package agents;

import jade.core.*;

/*Este agente es el encargargado de comunicarse con el Cliente Web*/
public class WebBotAgent extends  Agent{

    private String keyWord;
    private AID fbAgent;


    // Metodo de inicializacion
    @Override
    protected void setup() {
        System.out.println("WebBotAgent iniciado...");

        Object [] args = getArguments();

        if (args != null && args.length > 0) {
            keyWord = (String) args[0];
            System.out.println("Quiero saber acerca de: "+ keyWord);


            // Agregar comportamiento
            // Comunicarse con FacebookBotAgent para que haga la peticion....
            // OneShotBehaviour --> Make Request
            //addBehaviour();


            // Agregar comportamiento: Receptar informacion de PipelineBotAgent
        }
        else {
            // Make the agent terminate immediately
            System.out.println("Err: keyWord is not defined!");
            // Terminar tarea del agente
            doDelete();
        }
    }

    // Metodo de finalizacion
    @Override
    protected void takeDown() {
        System.out.println("WebBotAgent terminado...");
    }
}
