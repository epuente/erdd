package actions;

import classes.nonceToken;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Result;

public class Encabezados  extends Action.Simple {

    @Override
    public F.Promise<Result> call(play.mvc.Http.Context ctx) throws Throwable {

        nonceToken x = new nonceToken();
        String y = x.generateSafeToken();
        play.mvc.Controller.session("nonce", y);
        Config conf = ConfigFactory.load();
        String url = conf.getString("urlSitio");


        //ctx.response().setHeader("Set-Cookie", String.format("%s; %s", "PLAY_SESSION", "SameSite=Strict"));



        ctx.response().setHeader("Referrer-Policy", "same-origin");
        ctx.response().setHeader("Strict-Transport-Security", "max-age=31536000");
        ctx.response().setHeader("X-Frame-Options", "sameorigin");
        //ctx.response().setHeader("Permissions-Policy", "camera 'none'");


        //ctx.response().setHeader("Content-Security-Policy", "script-src 'nonce-"+y+"'");
        ctx.response().setHeader("Content-Security-Policy", "default-src 'self''nonce-" + y + "'");
        //ctx.response().setHeader("Content-Security-Policy", "csrf-token '"+t+"'");



        ctx.response().setHeader("Content-Security-Policy", "script-src 'nonce-" + y + "' " +
                url + " " +
                url + "/assets/gentelella/vendors/jquery/dist/jquery.min.js " +
                "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js " +
                "https://check.dev.ipn.mx/matomo.js " +
                "https://framework-gb.cdn.gob.mx/gobmx.js"
        );

        ctx.response().setHeader("Content-Security-Policy", "style-src 'self' 'unsafe-inline' "+
                "https://framework-gb.cdn.gob.mx/assets/styles/main.css "+
                "http://fonts.googleapis.com/css "+
                "https://framework-gb.cdn.gob.mx/gm/v4/css/main.css "+
                "https://www.ipn.mx/assets/files/main/css/estilo-compresion.min.css "+
                "https://framework-gb.cdn.gob.mx/assets/styles/main.css"
        );

        ctx.response().setHeader("X-Content-Type-Options", "nosniff");
        //	ctx.response().setHeader("Permissions-Policy", "geolocation=(self "+url+"\"), microphone=()");
        //	ctx.response().setHeader("Permissions-Policy", "fullscreen=(self "+url+"\"), geolocation=*, camera=()");

        ctx.response().setHeader("Permissions-Policy", "geolocation=(), camera=(), microphone=()");

        return delegate.call(ctx);
    }
}


/*
 *
 *  HEADERS QUE PRODUCE
 *
 *
 *  comando: wget -q -S -O - localhost:8089 | :
 *
 * regresa:
  HTTP/1.1 200 OK
  Content-Security-Policy: script-src 'nonce-2VZxqxYyW7gWKsTetymUt1Ljvk8' style-src 'self' 'unsafe-inline' https://videoteca.dev.ipn.mx https://videoteca.dev.ipn.mx/assets/gentelella/vendors/jquery/dist/jquery.min.js https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js https://check.dev.ipn.mx/matomo.js https://framework-gb.cdn.gob.mx/gobmx.js https://framework-gb.cdn.gob.mx/assets/styles/main.css http://fonts.googleapis.com/css https://framework-gb.cdn.gob.mx/gm/v4/css/main.css https://www.ipn.mx/assets/files/main/css/estilo-compresion.min.css https://framework-gb.cdn.gob.mx/assets/styles/main.css
  Content-Type: text/html; charset=utf-8
  Permissions-Policy: geolocation=(), camera=(), microphone=()
  Referrer-Policy: same-origin
  Set-Cookie: PLAY_SESSION_ERDD="8ccb93620f533448b6d1c5de906be071d4d9e1cb-csrfToken=2877b94b2f940bb53702fb5d37c3b440bce4a229-1714780018650-ba6b81e09ca659a0d07353b1"; Path=/; HTTPOnly
  Strict-Transport-Security: max-age=31536000
  X-Content-Type-Options: nosniff
  X-Frame-Options: sameorigin
  Content-Length: 11909


*/





