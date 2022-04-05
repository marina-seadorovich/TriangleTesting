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


    @DataProvider()
    public static Object[][] isTriangleInput() {
        return new Object[][]{
                { new Triangle(1, 2, 3), false },
                { new Triangle(1073741824, 1073741823, 1), false },
                { new Triangle(1, 1, 1), true },
                { new Triangle(1073741823, 1073741823, 1073741823), true },
                { new Triangle(7, 8, 9), true },
        };
    }

    @Test(dataProvider = "isTriangleInput")
    public void checkIsTriangle(Triangle triangle, boolean expected) {
        Assert.assertEquals(expected, triangle.isTriangle());
    }


    @DataProvider()
    public static Object[][] isEquilateralTriangleInput() {
        return new Object[][]{
                { new Triangle(1, 1, 1), "Равносторонний треугольник" },
                { new Triangle(1073741823, 1073741823, 1073741823), "Равносторонний треугольник" },
                { new Triangle(5, 5, 5), "Равносторонний треугольник" },
                { new Triangle(7, 8, 9), "Неравносторонний треугольник" },
        };
    }

    @Test(dataProvider = "isEquilateralTriangleInput")
    public void checkIsEquilateralTriangle(Triangle triangle, String expected) {
       Assert.assertEquals(triangle.isEquilateralTriangle(triangle.a, triangle.b, triangle.c), expected);
    }


    @DataProvider()
    public static Object[][] isIsoscelesTriangleInput() {
        return new Object[][]{
                { new Triangle(2, 2, 1), "Равнобедренный треугольник" },
                { new Triangle(1073741823, 1073741823, 1), "Равнобедренный треугольник" },
                { new Triangle(5, 5, 3), "Равнобедренный треугольник" },
                { new Triangle(7, 8, 9), "Неравнобедренный треугольник" },
        };
    }

    @Test(dataProvider = "isIsoscelesTriangleInput")
    public void checkIsIsoscelesTriangle(Triangle triangle, String expected) {
        Assert.assertEquals(triangle.isIsoscelesTriangle(), expected);
    }


    @DataProvider()
    public static Object[][] triangleTypeInput() {
        return new Object[][]{
                { new Triangle(1, 1, 1), "Равносторонний треугольник" },
                { new Triangle(2, 2, 1), "Равнобедренный треугольник" },
                { new Triangle(7, 8, 9), "Неравносторонний треугольник" },
                { new Triangle(0, 1, 1), "Треугольник не существует" },
                { new Triangle(-1, 5, 5), "Треугольник не существует" },
                { new Triangle(1, 2, 3), "Треугольник не существует" },
                { new Triangle(1073741824, 1073741823, 1), "Треугольник не существует" },

        };
    }

    @Test(dataProvider = "triangleTypeInput")
    public void checkTriangleType(Triangle triangle, String expected) {
        Assert.assertEquals(triangle.triangleType(), expected);
    }
}

