public class Loop {

    public static void main(String[] args) {
//          1 2 3 4 5 i
//        4 > > > = >
//        3 < < = > >
//        2 < = > > >
//        1 = > > > >
//        0 > > > > >
//        j
        for(int i = 1; i < 6;++i) {
            for (int j = 4; j >= 0; --j) {
                System.out.printf(((i > j) ? "*" : " "));
            }
            System.out.println();
        }
    }
}
