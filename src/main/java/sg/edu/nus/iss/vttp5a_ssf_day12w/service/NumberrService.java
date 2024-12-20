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
    Random random = new Random();
    List<Numberr> generatedNumbers;

    public List<Numberr> getNumbers(){
        return numberRepo.getNumbers();
    }

    public List<Numberr> generateNumbers(String number){
        generatedNumbers = new ArrayList<>();
        List<Numberr> numbersList = getNumbers();
        
        while (generatedNumbers.size() != Integer.parseInt(number)){
            int randomInt = random.nextInt(numbersList.size());
            Numberr randomNumberr = numbersList.remove(randomInt);
            generatedNumbers.add(randomNumberr);
                    
        }

        return generatedNumbers;
    }
}
