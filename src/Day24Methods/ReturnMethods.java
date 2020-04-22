package Day24Methods;
/*
declare methods:
    AccessModifier    Specifier   return-Type   methodName(Paramter){
                        Statements;
                                    }
Acccessmodifer: public
    specifier: static, final, abstract, synchronized
    return-type: void, any other data type
    paramter: any dataType

    static: can be called through class name
    return methods: return-type is not void it's mandatory to return value from the
                    method
 */
public class ReturnMethods {
    public static void maxNum(int a, int b) {

        if (a >= b) {

            System.out.println(a);

        } else {

            System.out.println(b);

        }
    }

    public static void main(String[] args) {

        //  int a = maxNum(10, 20);

        int result = Addition(1000, 2000);

        System.out.println(result); // 3000

        int result2 =  result + 2000;   // 5000

        System.out.println(result2); // 5000

    }

    public static int Addition(int a, int b){
        return a+b;
        //   System.out.println("Hello");
    }

}
