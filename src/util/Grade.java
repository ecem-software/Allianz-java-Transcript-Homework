package util;

public enum Grade {
    A(4),B(3),C(2),D(1),F(0);

    private int index;

    Grade(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
//To string methodu istenilen şekilde oluşturuldu.
    @Override
    public String toString() {
        return "Grade " + this.name() + " corresponds to numeric grade " + this.index;
    }
}
