package Day37_Construct;

public class CybertekStudents {
                    // Static:
    static String schoolName; // static will always be 1 object/data
                            // DO NOT need to input this when creating the object since it will always remain the same

                    // instance Variables: we must place this in the paramters
    String studentName; // instance variable will allow object to be different/multiple datas
    int groupNumber; // instance variable will allow object to be different/multiple datas
    String batch; // instance variable will allow object to be different/multiple datas
    // Can we initialize these variables in a constructor? YES

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName = "Cybertek University"; // schoolName DOES NOT need to be in the parameter since it is always the same
        // use this. to assign the parameters to the instance variables
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }
    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in Group #: "+groupNumber+", at "+schoolName;
    }
}
