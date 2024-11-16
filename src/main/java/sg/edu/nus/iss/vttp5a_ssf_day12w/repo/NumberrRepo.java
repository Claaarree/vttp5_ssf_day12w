package sg.edu.nus.iss.vttp5a_ssf_day12w.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5a_ssf_day12w.model.Numberr;

@Repository
public class NumberrRepo {
    public List<Numberr> numbersList;

    public List<Numberr> getNumbers(){
        numbersList = new ArrayList<>();
        
        for (int i = 0; i < 20; i++){
            Numberr nbr = new Numberr(i, ".\\src\\main\\resources\\static\\images\\" + i + ".jpg");
            numbersList.add(nbr);
        }

        return numbersList;
    }
}
