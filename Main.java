public class Main {
    public static void main(String[] args) {
        Plant f1 = new Flower("Tulip", 0,1);
        Plant t1 = new Tree ("Oak", 3, 20);

        Plant[] plants = {f1, t1};
        growPlants(plants, 1);

        System.out.println(f1.getDisplayName()+ " height is " + f1.getHeight());
        System.out.println(t1.getDisplayName()+ " height is " + t1.getHeight());
    }
    public static void growPlants(Plant[] plants, int numberOfYaers) {
        for( int i=0; i<3; i++) {
            for(Plant p:plants) {
                p.growOneYear();
            }

        }
    }
}
