public class  Kelvin extends BaseConverter {
    private String name;
    @Override
    public void convert(double temperature) {
        double t =  temperature+273.15;
        System.out.println(temperature+" selsiya v kelvin = "+ t );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
