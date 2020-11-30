

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    ArrayList<Pet> pets = new ArrayList<Pet>();
    public static void main(String args []){
        Engine app = new Engine();
        app.start();
    }



}
