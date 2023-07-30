package util;

public enum Grade {
    A("A",4), B("B",3),C("C",2),D("D",1),F("F",0);

    private int index;
    private String stringValue;

    Grade(String stringValue,int index) {
        this.index = index;
        this.stringValue=stringValue;
    }

    public int getIndex() {
        return index;
    }
    public String getStringValue() {
        return stringValue;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setStringValue( String stringValue){
        this.stringValue=stringValue;
    }
//To string method is created.
    @Override
    public String toString() {
        return "Grade " + this.getStringValue() + " corresponds to numeric grade " + this.index;
    }
}
