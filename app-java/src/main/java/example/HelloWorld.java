package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    logger.log("coveredByUnitTest1");
    logger.log("coveredByUnitTest2");
    logger.log("My Message");
  }

  public void coveredByIntegrationTest() {
    logger.log("coveredByIntegrationTest1");
    logger.log("coveredByIntegrationTest2");
    logger.log("coveredByIntegrationTest3");
  }

  public void notCovered() {
    logger.log("notCovered");
  }

}
