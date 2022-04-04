public class Triangle {
    int a;
    int b;
    int c;


    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setSides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isGreaterThanNull() {
        return a > 0 && b > 0 && c > 0;
    }

    public boolean isTriangle() {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }

    public String isEquilateralTriangle(int a, int b, int c) {
        if (a == b && b == c)
            return "Равносторонний треугольник";
        else
            return "Неравносторонний треугольник";
    }

    public String isIsoscelesTriangle() {
        if (a == b || b == c || a == c)
            return "Равнобедренный треугольник";
        else
            return "Неравносторонний треугольник";
    }

    public String triangleType() {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (b + c) > a && (a + c) > b) {
                if (a == b && b == c)
                    return "Равносторонний треугольник";
                else if (a == b || b == c || a == c)
                    return "Равнобедренный треугольник";
                else
                    return "Неравносторонний треугольник";
            }
            else
                return "Треугольник не существует";
        }
        else
            return "Треугольник не существует";
    }
}
