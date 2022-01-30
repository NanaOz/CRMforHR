package logika;

import org.hibernate.mapping.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Logics {

    private ArrayList<Long> positions;
    //поля
    private ArrayList<String> tags;
    private HashMap<Long, Long> idUsers;

    //конструктор
    public Logics(ArrayList<String> tags, HashMap<Long, Long> idUsers, ArrayList<Long> positions) {
        this.tags = tags;
        this.idUsers = idUsers;
        this.positions=positions;
    }

    //фильтр по тегам
    private ArrayList<Long> filter() {

        ArrayList<Long> filterIdUsers = new ArrayList<>();

        for (int i = 0; i < idUsers.size(); i++) { //для каждого пользователя проверяем совпадене тегов

            // контроллер дает arraylist тегов конкретно i-го пользователя
            ArrayList<String> userTags;

            int flag = 1;
            for (int j = 0; j < tags.size(); j++) { // для каждого выбранного тега проверяем наличие тега у пользователя
                for (int k = 0; k < userTags.size(); k++) {

                    if(tags.get(j)!= userTags.get(k)){flag=0;}
                }
            }

            if(flag==0){ filterIdUsers.add(idUsers.get(i));} //если у нас выбранный тег есть у пользователя, то добавляем его в список фильтрованных
        }

        return filterIdUsers;
    }
}
