package com.portfolio.Diego.Sani.Interface;

import com.portfolio.Diego.Sani.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id );
    
    //Busca una persona por ID
    public Persona findPersona(Long id);
}
