public class Flower extends Plant {
    private static int GROW_PER_SEASON =5;
    public Flower(String displayName, int height, int age) {
        super(displayName, 0, 0);
    }

    @Override
    public void doSummer() {
        System.out.println(getDisplayName()+ "heig" + getHeight());

    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getDisplayName()+ "heig" + getHeight());

    }

    @Override
    public int getGrowPerSeason() {
        return GROW_PER_SEASON;
    }

}
