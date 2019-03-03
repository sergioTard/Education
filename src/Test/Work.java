package Test;

public class Work implements Comparable{
    public Work(int prise){
        this.prise = prise;
    }
    public int prise;

    @Override
    public int compareTo(Object o) {
        Work other = (Work) o;
        return (this.prise >= (other.prise)) ? 1 : -1;
    }
}
