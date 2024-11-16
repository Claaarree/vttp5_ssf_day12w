package sg.edu.nus.iss.vttp5a_ssf_day12w.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5a_ssf_day12w.model.Numberr;
import sg.edu.nus.iss.vttp5a_ssf_day12w.repo.NumberrRepo;

@Service
public class NumberrService {
    
    @Autowired
    NumberrRepo numberRepo;
    @Autowired
    Random random;
    List<Numberr> generatedNumbers;

    public List<Numberr> getNumbers(){
        return numberRepo.getNumbers();
    }

    public List<Numberr> generateNumbers(String number){
        generatedNumbers = new ArrayList<>();
        int randomInt;
        for (int i = 0; i < Integer.parseInt(number); i++){
            randomInt = random.nextInt(20) + 1;
            Numberr randomNumberr = getNumbers().get(randomInt - 1);
            generatedNumbers.add(randomNumberr);
        }

        return generatedNumbers;
    }
}
