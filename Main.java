public class Main {
    public static void main(String[] args) {
        Fighter khabib=new Fighter("khabib",75,200,15,40);
        Fighter mcgregor=new Fighter("mcgregor",70,200,15,40);

        Ring match=new Ring(khabib,mcgregor,70,80);
        match.run();
    }
}