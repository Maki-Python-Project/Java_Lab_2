package lab2;

import java.util.Objects;

public class    Soldier {
    protected String name;
    protected String surName;
    protected String middleName;
    protected String callDate;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCallDate() {
        return callDate;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Builder {
        private Soldier newSoldier;

        public Builder() {
            newSoldier = new Soldier();
        }

        public Builder withName(String name){
            newSoldier.name = name;
            return this;
        }

        public Builder withSurname(String surName){
            newSoldier.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newSoldier.middleName = middleName;
            return this;
        }

        public Builder withAge(int age){
            newSoldier.age = age;
            return this;
        }

        public Builder callDate(String callDate){
            newSoldier.callDate = callDate;
            return this;
        }

        public Soldier build(){
            return newSoldier;
        }

    }


    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", callDate='" + callDate + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return age == soldier.age && name.equals(soldier.name) && surName.equals(soldier.surName) && middleName.equals(soldier.middleName) && callDate.equals(soldier.callDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, middleName, callDate, age);
    }
}
