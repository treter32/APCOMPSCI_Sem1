/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("china.png");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
   public static void testKeepOnlyBlue()
  {
    Picture china = new Picture("china.png");
    china.keepOnlyBlue();
    china.explore();
  }
   public static void testNegate()
   {
	Picture china = new Picture("china.png");
    china.negate();
    china.explore();
   }
   
   public static void testGrayscale()
   {
	Picture china = new Picture("china.png");
    china.negate();
    china.explore();
   }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture china = new Picture("china.png");
    china.explore();
    china.mirrorVertical();
    china.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture china = new Picture("china.png");
    china.explore();
    china.mirrorHorizontal();
    china.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture china = new Picture("china.png");
    china.mirrorVerticalRightToLeft();
    china.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture china = new Picture("china.png");
    china.mirrorHorizontalBotToTop();
    china.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    //Picture canvas = new Picture("640x480.jpg");
	Picture canvas = new Picture("seagull.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testCopy()
  {
	 Picture beach = new Picture("swan.jpg");
	  beach.explore();
	  beach.copy(new Picture("swan.jpg"), 0, 0, 999999, 999999); //should copy the whole thing
	  beach.explore();
  }
  
  public static void testMyCollage()
  {
	Picture canvas = new Picture("640x480.jpg"); //empty
    canvas.myCollage();
    canvas.explore();  
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   testNegate();
   testGrayscale();
    //testFixUnderwater();
   testMirrorVertical();
	testMirrorHorizontal();
    testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
   // testMirrorDiagonal();
    //testCollage();
	testMyCollage();
   
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	testMirrorVerticalRightToLeft();
	testMirrorHorizontalBotToTop();
  }
}