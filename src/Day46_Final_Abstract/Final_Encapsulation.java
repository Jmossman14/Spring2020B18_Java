package Day46_Final_Abstract;

public class Final_Encapsulation {
    final private int data1 = 200;
    private int data2 = 300;

    // manual getter & setter:
    public int getData1(){ //Getter:  reads the data in data1
        return data1;
    }

   /* public void setData1(int data1){// Setter:
    this.data1 = data1; //  use this to call the variable through the parameter
    }
    SETTER cannot be used in a Final variable, because SETTER is meant to change the variable
*/
    // shortcut: right click- > generate ->  getter & setter -> select the variable
    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }


}
