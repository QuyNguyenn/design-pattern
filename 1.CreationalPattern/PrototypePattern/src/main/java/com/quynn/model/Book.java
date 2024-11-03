package com.quynn.model;

public class Book implements Cloneable {

    private String name;
    private String ibsn;

    public Book() {
    }

    public Book(String name, String ibsn) {
        this.name = name;
        this.ibsn = ibsn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ibsn='" + ibsn + '\'' +
                '}';
    }
}
