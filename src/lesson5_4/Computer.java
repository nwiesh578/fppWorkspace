package lesson5_4;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
		return ramSize*processorSpeed;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Computer)) return false;
		Computer c = (Computer)ob;
		return c.manufacturer.equals(manufacturer) && c.processor.equals(processor) && 
				c.diskSize == diskSize && c.ramSize == ramSize 
				&& c.processorSpeed == processorSpeed;
	}
	
	@Override
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + manufacturer.hashCode();
		result = 31 * result + processor.hashCode();
		result = 31 * result + new Integer(diskSize).hashCode();
		result = 31 * result + new Integer(ramSize).hashCode();
		result = 31 * result + new Double(processorSpeed).hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer :- " + manufacturer + ", processor :- " + processor + ", ramSize :- " + ramSize
				+ ", diskSize :- " + diskSize + ", processorSpeed :- " + processorSpeed + ", computePower() :- " + computePower()
				+ "]";
	}	
	
}
