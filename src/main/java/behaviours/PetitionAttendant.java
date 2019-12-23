package behaviours;
import jade.core.AID;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;


/*
* Comportamiento Ciclico que realiza el FacebookBot, escucha a nuevas consultas...
* y envia el resultado al pipelinebot
* */

public class PetitionAttendant extends CyclicBehaviour {

    private AID agent;

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();
        if(msg != null){
            String keyWord = msg.getContent();

            // Conectarse con API de Facebook

            // Hacer consulta

            // Retornar resultado a PipelineBotAgent

            ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
        }
    }


}
