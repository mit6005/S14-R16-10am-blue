package music;
// ADDING TESTING COMMENT
/**
 * Rest represents a pause in a piece of music.
 */
public class Rest implements Music {
    private final double duration;
    
    private void checkRep() {
        assert duration >= 0;
    }
    
    /**
     * Make a Rest.
     * Requires duration >= 0
     * @return rest that lasts for duration beats
     */
    public Rest(double duration) { 
        this.duration = duration; 
        checkRep();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(duration);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Rest other = (Rest) obj;
        if (duration != other.duration)
            return false;
        return true;
    }
    
    
    @Override
    public String toString() {
        return "." + duration;
    }

    @Override
    public double duration() {
        return this.duration;
    }
}
