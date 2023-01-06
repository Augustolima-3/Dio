public class Main2 {

    public static void main(String[] args) {

        No no1 = new No("Conteúdo no1");
        //no1 > 2

        No no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2);
        //no2 > 3

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);
        //no3 >4

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);
        //no4 > null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("_________");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
