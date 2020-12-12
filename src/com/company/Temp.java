package com.company;

public class Temp <T extends Number> implements Tempble<T>{

    private T id;

    public Temp(T id){
        this.id=id;
    }

    public T getId() {
        return id;
    }
}
