package hillel.classWork.classWork_14.enums;

public enum Operations {
    MULTIPLY('*') {
        @Override
        public double count(double a, double b) {
            return a*b;
        }
    },
    DIVISION('/'){
        @Override
        public double count(double a, double b) {
            return a/b;
        }
    },
    ADDITION('+'){
        @Override
        public double count(double a, double b) {
            return a+b;
        }
    },
    SUBTRACTION('-'){
        @Override
        public double count(double a, double b) {
            return a-b;
        }
    };

    char value;

    Operations(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public abstract double count(double a, double b);
}
