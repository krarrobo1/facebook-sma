package behaviours;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;



/*
 * Este comportamiento lo realiza el PipeLineBot, escucha las respuestas que le manda FacebookBot, las formatea, filtra y agrupa
 * y se la envia a WebBot
 * */

public class ResultReceiver extends CyclicBehaviour {

    @Override
    public void action() {

        // Obtener respuesta de FacebookBotAgent
        ACLMessage msg = myAgent.receive();
        if(msg != null){

            String json = msg.getContent();

            // Formatear la respuesta


            // Enviar la respuesta al WebBot

            ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
        }else{
            block();
        }
    }

}
