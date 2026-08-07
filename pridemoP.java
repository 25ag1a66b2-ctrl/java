class pridemop {
    protected int z = 22;
}
class pridemoD extends pridemop{
    private int y = 20;

    public static void main(String... args) {
        pridemoD pdd = new pridemoD();
        System.out.println(pdd.y);
        System.out.println(pdd.z);
    }
}