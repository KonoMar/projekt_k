package pl.dmcs.projektkompetencyjny.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class Tournament {
    @Autowired
    Map<String,Knight> knights;


    public Tournament(){

    }
    public void duel(){
        //knight.setAge(knight.getAge()+1);
    }

    public void setKnight(Map<String,Knight> knights){
        this.knights=knights;
    }

    @Override
    public String toString(){
        return" W turnieju wezmie rycerz " + knights.stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}