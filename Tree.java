public class Tree extends Plant{

    private static int GROW_PER_SEASON =15;

    public Tree(String displayName, int height, int age) {
        super(displayName, height, age);

    }

    @Override
    public void doSummer() {
        setHeight(getHeight()+ getGrowPerSeason());
        System.out.println(getDisplayName()+"height"+ getHeight());

    }

    @Override
    public void doAutumn() {
        System.out.println(getDisplayName()+"height"+ getHeight());

    }

    @Override
    public int getGrowPerSeason() {

        return GROW_PER_SEASON;
    }
}
