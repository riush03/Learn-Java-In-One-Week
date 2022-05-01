public class MultilevelHierachy {
    private double width;
    private  double height;
    private  double lenght;

    //construct clone of an object
    MultilevelHierachy(MultilevelHierachy ob)
    {
        width = ob.width;
        height = ob.height;
        lenght = ob.lenght;
    }

    //constructor used when all dimensions are specified
    MultilevelHierachy(double w,double h,double l)
    {
        width = w;
        height = h;
        lenght = l;
    }

    //constructor used when no dimensions are specified
    MultilevelHierachy()
    {
        width = -1;
        height = -1;
        lenght = -1;
    }

    //constructor used when a cibe is created
    MultilevelHierachy(double len)
    {
        width = height = lenght = len;
    }

    //compute and return volume
    double volume()
    {
        return width*height*lenght;
    }
}

//Add weight
class Weight extends MultilevelHierachy{
    double weight; //weight of my container

    //construct a clone of an object
    Weight(Weight ob)
    {
        super(ob);
        weight = ob.weight;
    }

    //constructor when all parameters are specified
    Weight(double w,double h,double l,double m)
    {
        super(w,h,l);
        weight = m;
    }

    //when no parameters are specified
    Weight()
    {
        super();
        weight = -1;
    }

    //when cube is used
    Weight(double len,double m)
    {
        super(len);
        weight = m;
    }

}

//Add shipping costs
class Shipment extends Weight{
    double cost;

    //construct clone of an object
    Shipment(Shipment ob)
    {
        super(ob);
        cost = ob.cost;
    }

    //when parameters are specified
    Shipment(double w,double h,double l,double m,double c)
    {
        super(w,h,l,m);
        cost = c;
    }

    //when no parameters are specified
    Shipment()
    {
        super();
        cost = -1;
    }

    //cube o
    Shipment(double len,double m,double c){
        super(len,m);
        cost = c;
    }
}

class DemoShipment{
    public static void main(String[] args)
    {
        Shipment my_shipment = new Shipment(10,14,45,23,10.67);

        double vol;

        vol = my_shipment.volume();
        //volume of shipment
        System.out.println("The volume of the shipment is "+vol+"cubic metres");
        //weight of shipment
        System.out.println("The weight of the shipment is "+my_shipment.weight+"kg");
        //cost of the shipment
        System.out.println("The cost of the shipment is $"+my_shipment.cost);
        System.out.println();

    }
}