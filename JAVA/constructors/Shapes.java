class Shapes {
    public static void main(String a[]) {
        DifShapes circle1 = new DifShapes(3);
        DifShapes rect1 = new DifShapes(3, 7);
        DifShapes cube1 = new DifShapes(3, 4, 6);
    }
}

class DifShapes {
    DifShapes(int radius) {
        System.out.println("the area of circle is " + 3.14 * radius * radius);
    }

    DifShapes(int l, int b) {
        System.out.println("the area of circle is " + l * b);
    }

    DifShapes(int l, int b, int h) {
        System.out.println("the area of circle is " + l * b * h);
    }

}