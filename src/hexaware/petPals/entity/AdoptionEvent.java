package hexaware.petPals.entity;

import java.util.ArrayList;
import java.util.List;

public class AdoptionEvent {
    private List<IAdoptable> participants = new ArrayList<>();

    public void hostEvent() {
        System.out.println("Adoption event\n Total Participant: " + participants.size());
    }

}