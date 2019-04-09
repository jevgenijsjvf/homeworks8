package HW11;

import java.util.HashMap;
import java.util.Map;

public class UserRepository <T extends User>{
//maps here
    Map<String, User> users = new HashMap<>();

        void save(T user){
            String id = user.getId();
            users.put(id, user);
        }
    }

