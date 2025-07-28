package Day7.Overriding.covariant;

class Color {
    // method getColor returns an object of type Color
    protected Color getColor() {
        Color s = new Color();
        return s;
    }
}

// this class will inherit from the class Color and will override the getColor() method 
// returning the object of the type Red class
class Red extends Color {
    @Override
    public Red getColor() {
        Red s = new Red();
        return s;
    }
}

public class CovariantOverriding {
    public static void main(String[] args) {
        Color c1 = new Color();
        Color c2 = c1.getColor();
        System.out.println(c2);

        Red r1 = new Red();
        Red r2 = r1.getColor();
        System.out.println(r2);
    }
}