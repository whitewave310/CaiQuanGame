package com.etc.methodone.vo;

/**
 * Created by whitewave on 2015/8/31.
 */
public class PersonPlayer {
    private String personName;
    private int personScore;
    private int personshoushi;

    public int getPersonshoushi() {
        return personshoushi;
    }

    public void setPersonshoushi(int personshoushi) {
        this.personshoushi = personshoushi;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonScore() {
        return personScore;
    }

    public void setPersonScore(int personScore) {
        this.personScore = personScore;
    }

    public void addScore(){
        personScore++;
    }

    public void jianScore(){
        personScore--;
    }
}
