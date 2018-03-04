package create.BuilderPattern;

public class Computer {

    private String cpu;
    private String ram;
    private String monitor;
    /**
     * @return the cpu
     */
    public String getCpu() {
        return cpu;
    }
    /**
     * @param cpu the cpu to set
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }
    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }
    /**
     * @return the monitor
     */
    public String getMonitor() {
        return monitor;
    }
    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String toString(){
        return "PC:" + this.cpu + ", " + this.ram + ", " + this.monitor;
    }
}