package AccesoDatos.Ficheros;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class OosWritter extends ObjectOutputStream {

    public OosWritter(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader()throws IOException {
        //lo sobreescribimos para que no haga nada
    }
}