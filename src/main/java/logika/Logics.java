package logika;

import com.company.entity.*;
import org.hibernate.mapping.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Logics {


    //поля
    private HashMap<Post, ArrayList<TagWithLevel>> tagsByPositions;
    private ArrayList<Lid> lids;


    //конструктор
    public Logics(HashMap<Post, ArrayList<TagWithLevel>> tagsByPositions, ArrayList<Lid> lids) {
        this.tagsByPositions = tagsByPositions;
        this.lids = lids;
    }


    //сбор команды
    public HashMap<Post, ArrayList<Lid>> gatherTeam() {
        for (Post p : tagsByPositions.keySet()) {
            for (TagWithLevel tagWithLevel : tagsByPositions.get(p)) {
                for (Lid lid : lids) {
                    if (lid.isCandidate()) {
                        if (lid.getCandidate().getTags().contains(tagWithLevel.getTag())) {
                            if (tagWithLevel.getLevel() <= lid.getCandidate().getTags().getLevel()){

                            }
                        }
                    }
                }
            }
        }

        return null;
    }


}
