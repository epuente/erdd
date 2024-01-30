package models;

import play.mvc.*;
import akka.actor.UntypedActor;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Pinger extends UntypedActor {
    WebSocket.In<String> in;
    WebSocket.Out<String> out;

    public Pinger(WebSocket.In<String> in, WebSocket.Out<String> out) {
        this.in = in;
        this.out = out;
        System.out.println("objeto Pinger creado");
    }

    @Override
    public void onReceive(Object message) {
        if (message.equals("Tick")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            out.write(sdf.format(cal.getTime())+" OK !");
        } else {
            unhandled(message);
        }
    }
    
    
    
    public void salida(){
    	 out.write("retorno!!!!!!!!1");
    }
    
    
}