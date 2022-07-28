
public class EarlyLate {

	public static void main(String[] args) {
	
	animal an = new animal();
	an.giveBirth();
	
	mammal ma = new mammal();
	ma.giveBirth();
	
	eutheria eu = new eutheria();
	eu.giveBirth();
	
	metatheria me = new metatheria();
	me.giveBirth();
	
	prototheria po = new prototheria();
	po.giveBirth();
	
	animal ref = an;//early binding
	ref.giveBirth();
	
	ref = ma;
	ref.giveBirth();//late binding
	
	ref = eu;
	ref.giveBirth();//late binding
	
	ref = po;
	ref.giveBirth();//late binding
	}
}

class animal
{
	void giveBirth()
	{
		System.out.println("animal gives birth ");
	}
}

class mammal extends animal
{
	
}

class eutheria extends mammal
{
	
}

class metatheria extends mammal
{
	
}

class prototheria extends mammal
{
	
}