package local.data;

public class Primitives {

    byte byteNumber = 1;
    short shortNumber = 1;
    int i = 1;
    long l = 1;
    float f = 1;
    double d = 1;
    char c = 1;
    boolean bo = true;

    void foo() {

        shortNumber = byteNumber;
        byteNumber = (byte) shortNumber;
        // byteNumber = (byte) bo; // Cast imposible

        byteNumber = (byte) i;
        byteNumber = (byte) l;
        byteNumber = (byte) f;
        byteNumber = (byte) d;
        byteNumber = (byte) c;

    }

    void Wrappers(){
        Byte byteNumber= 1;
        Short shortNumber=1;
        Integer iObj= 1;
        Long l = 1l;
        Float f = 1f;
        Double d = 1d;
        Character c = 1;
        Boolean bo = true;

        Number n = 2;

        l = n.longValue();
    }

}
