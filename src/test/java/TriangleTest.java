import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {

    @DataProvider()
    public static Object[][] greaterThanNullInput() {
        return new Object[][]{
           { new Triangle(7, 8, 9), true },
           { new Triangle(0, 2, 3), false },
           { new Triangle(-1, 4, 5), false },
        };
    }

    @Test(dataProvider = "greaterThanNullInput")
    public void checkGreaterThanNull(Triangle triangle, boolean expected) {
        Assert.assertEquals(expected, triangle.isGreaterThanNull());
        }

}

//    @Test(expectedExceptions = InputMismatchException.class)
//    public void outOfRange() {
//        int a = 10000000000000000;
//        System.out.println("Input is out of range for the expected type");
//    }