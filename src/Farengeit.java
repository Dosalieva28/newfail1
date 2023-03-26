public class Farengeit extends BaseConverter {
    @Override
    public void convert(double temperature) {
     double f = 1.8* temperature+32;
        System.out.println(temperature+   "  selsiya v forengeit  =  "   + f );
    }
}
