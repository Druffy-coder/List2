package Derevo;

public class main {

    public static void main(String[] args) {
        List<Integer> list = new List<>((a, b) -> {
            if(((int)a.getValue() - (int)b.getValue()) > 0) {
                return 1;
            }
            else if (((int)a.getValue() - (int)b.getValue()) < 0) {
                return -1;
            }
            else {
                return 0;
            }
        });
        Randomizer.randomInt(list,4);
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());
        List<String> list = new List<>();
        Randomizer.randomString(list,4, 7);
        System.out.println(list.toString());

    }
}



