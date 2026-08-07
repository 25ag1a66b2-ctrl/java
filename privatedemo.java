class PriDemoP{
    private static int a = 9;
    private static int result() {
        return a;
    }
}

class PriDemoC{
    public static void main(String... args) {
        System.out.println(PriDemoP.result());
    }
}
//error: privatedemo.java:10: error: result() has private access in PriDemoP
//    System.out.println(PriDemoP.result());
