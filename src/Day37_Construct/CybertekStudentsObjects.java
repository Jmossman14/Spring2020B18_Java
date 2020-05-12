package Day37_Construct;

public class CybertekStudentsObjects {
    public static void main(String[] args) {
        // create an object to test the CybertekStudents data
        CybertekStudents student1 = new CybertekStudents("Judy", 11, "Batch 18");

        //below should return [return "Name: "+studentName+", Batch: "+batch+", in Group #: "+groupNumber+", at "+schoolName;]
        System.out.println(student1); // output: Name: Judy, Batch: Batch 18, in Group #: 11, at Cybertek University

        CybertekStudents student2 = new CybertekStudents("Keora", 15, "Batch 18");
        System.out.println(student2); // output:Name: Keora, Batch: Batch 18, in Group #: 15, at Cybertek University


    }
}
