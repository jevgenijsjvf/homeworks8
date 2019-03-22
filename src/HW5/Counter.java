package HW5;

import HW4.Stock;

public class Counter {
    private int value;
    private int step;
    private int ValuePrev;

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
    }
    public int getValue() {
        return value;
    }

    public int getValuePrev() {
        return ValuePrev;
    }

    public void setValuePrev(int valuePrev) {
        ValuePrev = valuePrev;
    }

    public String increment() {
        value=value+step;

        if (value>100){
            value=100;
            return "Value can'b be more than 100. Value returned to the maximum possible value.";
        }
        return "Value increased by one step. ";
        }

    public String decrement()   {
        value=value-step;
        if (value<0){
            value=0;
            return "Value can'b be less than 0. Value returned to the minimum possible value.";
        } return "Value decreased by one step. ";
    }

    public int clear(){
        System.out.print("Value reset. ");
        return value=0;
    }

    public int getStep() {
        return step;
    }

    public String setStep(int step) {
        this.step = step;
        if (step>=1&&getStep()<=10) {
            return "Step sep.";
        } else {
            this.step=0;
            return "Step can't be less than 0 and more than 10. Step returned to 0. ";
        }
    }

    public int setValue(int value) {
        this.value=value;
        if (getValue()>0&&getValue()<=100) {
            System.out.print("Value set. ");
            return value;
        } else {
            this.value=getValuePrev();
            System.out.print("Value can't be less than 0 and more than 100. Value returned previous value. ");
            return value;
    }}



    }

