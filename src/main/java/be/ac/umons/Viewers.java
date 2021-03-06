package be.ac.umons;

public class Viewers implements Observer {

    private String viewerName;
    private Subject newsChannelObj;

    public Viewers(String viewerName) {
        this.viewerName = viewerName;
    }

    @Override
    public void update() {
        String msg = (String) newsChannelObj.getUpdate(this);

        if (msg == null)
            System.out.println("Aucune notification ");
        //else
          //  System.out.println("Le stock de " + msg +" est tombé à zéro ");
    }

    @Override
    public void setSubject(Subject subject) {
        if (subject == null)
            throw new NullPointerException("The subject object is null");
        this.newsChannelObj = subject;
    }

}
