package logika;

import com.company.entity.*;

import java.lang.reflect.Array;
import java.util.*;

public class Logics {


    //поля
    private HashMap<Post, Map<Tag, Level>> tagsByPositions;
    private ArrayList<Lid> lids;


    //конструктор
    public Logics(HashMap<Post, Map<Tag, Level>> tagsByPositions0, ArrayList<Lid> lids) {
        this.tagsByPositions = tagsByPositions;
        this.lids = lids;
    }


    //сбор команды
    public HashMap<Post, ArrayList<Lid>> gatherTeam() {


        for (Post p : tagsByPositions.keySet()) { //для каждой позиции должности, будем перебирать лидов
            for (Lid lid : lids) { //для каждого лида будем перебирать теги
                if (lid.isCandidate()) { //если лид кандидат
                    for (Tag tagFromForm : tagsByPositions.get(p).keySet()) { //для каждого тега лида, будем перебирать и сравнивать теги необходимые для должности p
                        if (lid.getCandidateTags().containsKey(tagFromForm)) { //если у лида есть тег указанный в листе тегов должности p
                            if (tagsByPositions.get(p).get(tagFromForm).getLevel() <= lid.getCandidateTags().get(tagFromForm).getLevel()) { //если уровень тега не ниже чем требуемый для должности
                                lid.summAdd(1.0);//todo связать "1" с коэфициентом важности тега
                            } else { // если уровень ниже требуемого, домножаем коэфициент "1" то есть коэф важности тега на частное от уровень владения лидом на требуемый уровень для должности
                                lid.summAdd(1.0 * tagFromForm.getCriterion() * lid.getCandidateTags().get(tagFromForm).getLevel() / tagsByPositions.get(p).get(tagFromForm).getLevel());
                            }
                        } else {
                            /*
                            if (tagsByPositions.get(p).get(tagFromForm).getLevel() <= lid.getCandidateTags().get(tagFromForm).getLevel()) { //если уровень тега не ниже чем требуемый для должности
                                lid.summAdd(1.0);//todo связать "1" с коэфициентом важности тега
                            } else { // если уровень ниже требуемого, домножаем коэфициент "1" то есть коэф важности тега на частное от уровень владения лидом на требуемый уровень для должности
                                lid.summAdd(1.0*tagFromForm.getCriterion()*lid.getCandidateTags().get(tagFromForm).getLevel() / tagsByPositions.get(p).get(tagFromForm).getLevel());
                            }
                             */
                        }
                    }
                }
            }
        }

        return null;
    }

    private ArrayList<Lid> sortTeam(ArrayList<Lid> team) {
//      Map<Post, ArrayList<Lid>> team=new HashMap<>();
        Collections.sort(team, ( (a, b) -> (int)(a.getSumm() * 100 - b.getSumm() * 100)));

    }

}
