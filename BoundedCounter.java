public class BoundedCounter {
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        if(this.value == this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public void setValue(int value) {
        if(value >= 0 && value <= upperLimit) {
            this.value = value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String toString() {
        if(this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
}
