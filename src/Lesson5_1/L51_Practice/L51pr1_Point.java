package Lesson5_1.L51_Practice;


public class L51pr1_Point {
//    Создать класс Point
//    Хранит статик константу
//    ZERO (x=0, y=0) типа Point
//
//    Хранит не статик
//    double x, y;
//
//    Имеет не статик функции:
//
//            ●	public double calcLength(Point otherPoint)
//    Она возвращает расстояние между двумя точками
//
//●	public double calcLength()
//    Возвращает длину от точки ZERO до данной точки
//    Необходимо(!) использовать функцию calcLength(Point otherPoint) в расчетах
//
//●	public Point normalize()
//    Нормализует вектор(точку). Исходный объект не изменяется. Результат записывается в новый объект.
//    Google в помощь о нормализации.
//            Необходимо(!) использовать функцию calcLength() в расчетах

    private final static L51pr1_Point ZERO = new L51pr1_Point(0,0);

          public double x;
    public double y;


    public L51pr1_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLength(L51pr1_Point otherPoint){
        double lengs = Math.pow(Math.pow((otherPoint.getX() - getX()), 2) +
                Math.pow((otherPoint.getY() - getY()), 2), 0.5 );
        return lengs;
    }

    public double calculateLength(){
        double lengs = Math.pow(Math.pow((getX() -ZERO.getX()), 2) + Math.pow((getY()-ZERO.getY()), 2), 0.5 );
        return lengs;
    }

    public L51pr1_Point normolize (){
        double lengs = calculateLength();
        double newX = getX() / lengs;
        double newY = getY() / lengs;
        L51pr1_Point newPoint = new L51pr1_Point(newX, newY);
        return newPoint;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

//    public static void main(String[] args) {
//        L51pr1_Point point1 = new L51pr1_Point(10, 20);
//        System.out.println(point1.calculateLength());
//        System.out.println(point1.getX());
//        System.out.println(point1.getY());
//    }
}
