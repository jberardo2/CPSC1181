/**
  Class to represent a Baloon<br>
  A balloon can be filled adding some air<br>
  We can retrieve the balloon's volume, surface area and radius

  @author Joao Berardo
  @version 1.0
  @since June, 04 2017
*/
public class Balloon
{
	// instance variables
	private double volume;
	private double surfaceArea;
	private double radius;
	private double airAmount;
	
	/**
	  Constructor using default values
	*/
	public Balloon()
	{
		volume = 0.0;
		surfaceArea = 0.0;
		radius = 0.0;
	}
	
	/**
	  Fills the balloon with the given amount of air
	  @param amount Amount of air to be filled
	*/
	public void addAir(double amount)
	{
		volume += amount;
		calculateRadius();
		calculateSurfaceArea();
	}
	
	/**
	  Get the current amount of air
	  @return amount of air in the balloon
	*/
	public double getAirAmount()
	{
		return airAmount;
	}
	
	/**
	  Gets the current volume
	  @return balloonn's volume
	*/
	public double getVolume()
	{
		return volume;
	}
	
	/**
	  Gets the surface area
	  @return balloon's surface area
	*/
	public double getSurfaceArea()
	{
		return surfaceArea;
	}
	
	/**
	  Get the radius
	  @return balloon's radius
	*/
	public double getRadius()
	{
		return radius;
	}
	

	// calculate the balloon's surface area
	// Formula for surface area:
	// 4 * (pi * sqr(radius))
	private void calculateSurfaceArea()
	{
		this.surfaceArea = 4.0 * (Math.PI * Math.pow(this.radius, 2.0));
	}
	
	// calculate the balloon's radius
	// Formula for radius:
	// ( 3 * (volume / (4 * pi))) / (1 / 3)
	private void calculateRadius()
	{
		this.radius = Math.pow(3.0 * (this.volume / (4.0 * Math.PI)), (1.0 / 3.0));

	}
}
