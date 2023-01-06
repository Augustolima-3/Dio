public class Main {
    public static void main(String[] args) {

        int intA= 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + " intB= " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objtB = objA;

        System.out.println("objA= " + objA+ " objtB= " + objtB);
        objA.setNum(2);
        System.out.println("objA= " + objA+ " objtB= " + objtB);
    }
}
