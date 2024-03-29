package mypractice.collectionsandgenerics.collectionelements;

public class Player implements Comparable<Player> {
    private String name;
    private int age;
    private int totalRuns;
    private int totalMatches;
    private int average;
    private int unbeatenMatches;

    public Player(String name, int age, int totalRuns, int totalMatches, int unbeatenMatches) {
        this.name = name;
        this.age = age;
        this.totalRuns = totalRuns;
        this.totalMatches = totalMatches;
        this.average = this.totalRuns / (this.totalMatches - this.unbeatenMatches);
        this.unbeatenMatches = unbeatenMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage() {
        this.average = this.totalRuns / (this.totalMatches - this.unbeatenMatches);
    }

    public int getUnbeatenMatches() {
        return unbeatenMatches;
    }

    public void setUnbeatenMatches(int unbeatenMatches) {
        this.unbeatenMatches = unbeatenMatches;
    }

   /* public int compareTo(Player o) {
        if (this.average > o.average) {
            return -5;
        } else if (this.average < o.average)
            return 5;
        else return 0;
    }*/


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p/>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p/>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p/>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p/>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p/>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object.
     * @throws ClassCastException if the specified object's type prevents it
     *                            from being compared to this object.
     */
    public int compareTo(Player o) {
       return this.name.compareTo(o.getName());
    }
}