package ProgramacionII.Ejercicios.Personas;

import java.util.ArrayList;

public class Directorio {
    private ArrayList<Persona> personas = new ArrayList<>();

    public void agregar(Persona persona){
        personas.add(persona);
    }

   public void listar(){
       for (Persona persona : personas) {
           System.out.println(persona.toString());
       }
   }
}
