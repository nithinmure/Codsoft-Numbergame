public class RdGen {
  protected int rnd(){
    double random = Math.random();
    double x = random*100;
    int y = (int)x + 1;
    return y;
  }
}
