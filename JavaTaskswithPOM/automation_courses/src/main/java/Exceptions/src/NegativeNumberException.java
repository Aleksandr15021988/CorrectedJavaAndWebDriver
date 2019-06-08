public class NegativeNumberException extends Exception {
    double n;
    NegativeNumberException(double n){
        this.n=n;

    }
    public String toString() {
    return n + " является отрицательным числом";
    }
}
