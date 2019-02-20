public abstract class Plant {
    private String displayName;
    private int height;
    private int age;

    public Plant(String displayName,int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.setAge(age);
    }

    public void growOneYear() {
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }


    public void doSpring() {
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getDisplayName()+ "heig" + getHeight());
    }

    public abstract void doSummer();
    public abstract void doAutumn();

    public void doWinter() {
        System.out.println(getDisplayName()+ "heig" + getHeight());

    }

    public abstract int getGrowPerSeason();
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getDisplayName()  {
        return displayName;

    }
    public void printStatusForSeason(String season) {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
