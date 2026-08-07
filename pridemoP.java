
class pridemop {
    protected int z = 22;
}


class PridemoD extends pridemop {
    private int y = 20;

    public static void main(String... args) {
        PridemoD pdd = new PridemoD();
        System.out.println(pdd.y);
        System.out.println(pdd.z);
    }
}