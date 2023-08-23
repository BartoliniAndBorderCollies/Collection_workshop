package com.klodnicki.generics;

public class GenericClazz<T extends Number> {
    // & bitwise AND
    private Integer integer;
    private String text;
    private T number;

    public GenericClazz(Integer integer, String text, T number) {
        this.integer = integer;
        this.text = text;
        this.number = number;
    }

    public byte getByteValueOfNumber() {
        return number.byteValue();
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
