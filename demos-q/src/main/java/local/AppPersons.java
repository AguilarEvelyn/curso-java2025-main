package local;

import local.entities.Person;
import local.repositories.PersonDAO;

public class AppPersons {

    private static void checkPersons() {
        PersonDAO dao = new PersonDAO();

        dao.save(new Person("Pepe", "Perez", "pp@sample.com"));
        dao.save(new Person("Luisa", "Gomez", "lg@sample.com"));

        System.out.println("----------- Find All -----------");
        System.out.println(dao.findAll());
        System.out.println("----------- Find by ID valid -----------");
        System.out.println(dao.findById(1));
        System.out.println("----------- Find by ID invalid -----------");
        System.out.println(dao.findById(100));

        System.out.println("----------- Delete by ID 1 (si existe)-----------");

        dao.findById(1).ifPresentOrElse(
                dao::delete,
                () -> System.out.println("Persona no encontrada: no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(dao.findAll());

        try {
            Person p3 = dao.findById(4).orElseThrow(() -> new RuntimeException("Persona no encontrada"));
            // El método detach(p3) no está definido en PersonDAO.
            // Si necesitas "desvincular" el objeto p3 de algún contexto de persistencia,
            // deberías implementar ese método en PersonDAO o eliminar esta línea si no es necesario.
            // Por ahora, simplemente la comentamos o eliminamos.
            // dao.detach(p3);
            System.out.println("----------- Update by ID 2 -----------");
            p3.setEmail("new@sample.com");
            dao.update(p3);
            System.out.println("----------- Find All after update -----------");
            System.out.println(dao.findAll());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("Persons application");
        checkPersons();
    }
}
