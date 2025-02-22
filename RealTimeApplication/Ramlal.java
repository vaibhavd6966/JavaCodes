package RealTimeApplication;

public class Ramlal {
	public void getOrder(String order) throws ClassNotFoundException, InstantiationException, Exception {
		Class c=Class.forName(order);
		Object o=c.newInstance(); //upcasting
		Tea tea=(Tea)o; //downcasting
		tea.making();
		tea.benefits();
	}
}

