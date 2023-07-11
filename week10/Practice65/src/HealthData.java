
public class HealthData<H,W> {
    private String name;
    private W weight;
    private H height;
    
    public HealthData(String name, H height, W weight) {
        setName(name); setWeight(weight); setHeight(height);
    }
    void setName(String name) { this.name = name; }
    void setWeight(W weight) { this.weight = weight; }
    void setHeight(H height) { this.height = height; }
    String getName() { return name; }
    W getWeight() { return weight; }
    H getHeight() { return height; }
    
    public String toString() {
        String ret = "";
        ret += "(" + getName() + ", ";
        ret += getHeight() + ", ";
        ret += getWeight() + ")";
        return ret;
    }
}