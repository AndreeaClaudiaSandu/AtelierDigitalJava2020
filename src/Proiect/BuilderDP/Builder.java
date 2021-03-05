package Proiect.BuilderDP;

public class Builder {
    static class Car{
        private String brand;
        private String model;

        private int engine;
        private int horsepower;
        private String fuel;
        private int year;


        public String getBrand(){
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getEngine() {
            return engine;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String getFuel() {
            return fuel;
        }

        public int getYear() {
            return year;
        }

        private Car(CarBuilder builder){
            this.brand=builder.brand;
            this.engine=builder.engine;
            this.model=builder.model;
            this.horsepower=builder.horsepower;
            this.fuel=builder.fuel;
            this.year=builder.year;
        }

        public static class CarBuilder{
            private String brand;
            private String model;
            private int engine;
            private int horsepower;
            private String fuel;
            private int year;

            public CarBuilder(String brand, String model){
                this.brand=brand;
                this.model=model;
            }

            public CarBuilder setEngine(int engine){
                this.engine=engine;
                return this;
            }

            public CarBuilder setHorsepower(int horsepower){
                this.horsepower=horsepower;
                return this;
            }

            public CarBuilder setFuel(String fuel){
                this.fuel=fuel;
                return this;
            }

            public CarBuilder setYear(int year){
                this.year=year;
                return this;
            }

            public Car build(){
                return new Car(this);
            }

        }
    }
}
