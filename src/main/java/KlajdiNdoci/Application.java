package KlajdiNdoci;

import KlajdiNdoci.entities.EventoDAO;
import KlajdiNdoci.entities.LocationDAO;
import KlajdiNdoci.entities.PartecipazioneDAO;
import KlajdiNdoci.entities.PersonaDAO;
import KlajdiNdoci.utils.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Application {
    private static final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        try {
            EventoDAO eventoDAO = new EventoDAO(em);
            PersonaDAO personaDAO = new PersonaDAO(em);
            LocationDAO locationDAO = new LocationDAO(em);
            PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(em);

//            Evento ev1 = new Evento("Evento1", LocalDate.of(2022, 12, 5), "ciao", TipoEvento.PUBBLICO, 200);
//            ed.save(ev1);

//            Evento evFromDB = ed.getById(5);
//            if (evFromDB != null) {
//                System.out.println(evFromDB);
//            }
//            ed.delete(5);

//            Evento ev7FromDB = ed.getById(8);
//            if (ev7FromDB != null) {
//                ev7FromDB.setTitolo("Evento7");
//                System.out.println(ev7FromDB);
//                em.refresh(ev7FromDB);
//                System.out.println(ev7FromDB);
//            }


        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            em.close();
            emf.close();
        }

    }
}
