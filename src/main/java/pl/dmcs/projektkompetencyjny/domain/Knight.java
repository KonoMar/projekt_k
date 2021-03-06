package pl.dmcs.projektkompetencyjny.domain;


import java.util.Objects;
public class Knight {

    private int id;



    private String name;

    private int age;

    private int level = 1;

    private Quest quest;

    public Knight() {

    }


    public Knight(String name, int age) {
          this.name = name;
          this.age = age;
          this.level = 1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }


    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza...");
        this.quest = quest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu" + name + " ( " + age + " ). Wykonuje zadanie: " + quest;
    }
}
