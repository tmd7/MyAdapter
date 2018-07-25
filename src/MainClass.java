/**
 * The Client class has some business logic
 * */
public class MainClass {

  public static void main(String[] args) {
    int distanceKm = 60;
    System.out.println("Distance Km: " + distanceKm);

    new Adapter().convertDistance(distanceKm);
  }
}

interface ClientInterface {
  void convertDistance(int distanceKm);
}

/**
 * The Adapter class when input data is int type and output data is double type
 * */
class Adapter implements ClientInterface{

  @Override
  public void convertDistance(int distanceKm) {
    double distanceMi = distanceKm * 1.6093;
    new SomeService().printDistanceMi(distanceMi);
  }
}


/**
 * The SomeService class which works only with double value
 * */
class SomeService {

  void printDistanceMi(double distanceMi) {
    System.out.println("Distance Mi: " + distanceMi);
  }
}
