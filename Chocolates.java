package epam.hometask2;
	public class Chocolates extends Cadbury implements Milk
	{
	String candiname;
	int weight;
	Chocolates(String str , int weight)
	{
	candiname = str;
	this.weight = weight;
	}
	public String candiName()
	{
	return candiname;
	}

	public int wgt()
	{
	return weight;
	}
	public String toString() {
		return String.format(candiname+ " with weight " + weight + "grams");
	}
	public void mi()
	{
	System.out.println("Chocolates Contains milk");
	}
	}