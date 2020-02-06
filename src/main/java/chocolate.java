public class chocolate extends newYearGift
{
    public chocolate(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void pack()
    {
        System.out.println(this.getName() + " is packing ......");
    }

}
