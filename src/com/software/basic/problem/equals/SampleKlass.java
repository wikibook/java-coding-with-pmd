package com.software.basic.problem.equals;

public class SampleKlass {
    int id;
    String name;
    
    public SampleKlass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SampleKlass other = (SampleKlass) obj;
        if (id != other.id) {
            return false;
        }
        if (name == null && other.name != null) {
            return false;
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}