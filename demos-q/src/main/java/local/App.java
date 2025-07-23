package local;

import java.time.LocalDateTime;

import local.entities.Meeting;
import local.repositories.MeetingDAO;;

/**
 * Hello world!
 */
public final class App {
    private App() {

    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Meetings application");
        MeetingDAO meetingDAO = new MeetingDAO();

        Meeting m1 = meetingDAO.save(new Meeting("Primera reunion", LocalDateTime.now().plusDays(2)));
        Meeting m2 = meetingDAO.save(new Meeting("Segunda reunion", LocalDateTime.now().plusDays(3)));
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("----------- Find All -----------");
        System.out.println(meetingDAO.findAll());
        System.out.println("----------- Find by ID valid -----------");
        System.out.println(meetingDAO.findById(1));
        System.out.println("----------- Find by ID invalid -----------");
        System.out.println(meetingDAO.findById(100));

        System.out.println("----------- Delete by ID 1 (si existe)-----------");
        // try {
        // meetingDAO.delete(meetingDAO.findById(2).get());
        // } catch (Exception e) {
        // System.out.println("Meeting ya eliminado");
        // }

        meetingDAO.findById(1).ifPresent(entity -> meetingDAO.delete(entity));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(meetingDAO.findAll());

        try {
            Meeting m3 = meetingDAO.findById(2).orElseThrow(() -> new RuntimeException("Meeting not found"));
            System.out.println("----------- Update by ID 1 -----------");
            m3.setDescription("Reunion actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meetingDAO.update(m3);
            System.out.println("----------- Find All after update -----------");
            System.out.println(meetingDAO.findAll());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
