package behaviours;
import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/*
* Este comportamiento permite al WebBotAgent realizar peticiones al FacebookBotAgent
* */


public class RequestPerformer extends Behaviour {

    private AID agent;
    private String kw;

    public RequestPerformer(AID agent, String kw) {
        this.agent = agent;
        this.kw = kw;
    }

    @Override
    public void action() {

        // Call of Proposal
        ACLMessage cfp = new ACLMessage(ACLMessage.CFP);
        cfp.addReceiver(agent);
        cfp.setContent(kw);


    }

    @Override
    public boolean done() {
        return false;
    }
}
