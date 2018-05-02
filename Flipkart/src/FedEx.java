
public class FedEx implements IDeliver
{
	@override
	public void deliverProduct(String name,long phone,String address)
	{
		System.out.println("Deliveted the product"+name+""+phone+"at"+address);
}

}
