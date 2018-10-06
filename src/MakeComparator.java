/*import java.util.Comparator;

class MakeComparator implements Comparable<Car> {
    @Override
    public int compareTo(Car o){
        return Comparator.comparing(Car::getMake)
                .thenComparing(Car::getModel)
                .thenComparingDouble(Car::getHorsePower)
                .thenComparingDouble(Car::getEngine)
                .thenComparing(Car::getTransmission)
                .thenComparingInt(Car::getYear)
                .compare(this, o);
    }
}*/