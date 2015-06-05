package effective;

public final class PhoneNumber implements Comparable<PhoneNumber> {
	private final short prefix;
	private final short lineNumer;	
	private final short areaCode;
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 999, "line number");
		
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumer = (short) lineNumber;
	}
	
	private static void rangeCheck(int arg, int max, String name) {
		if (0 > arg || arg > max) {
			throw new IllegalArgumentException(name + ": " + arg);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber p = (PhoneNumber)o;
		return (p.lineNumer == this.lineNumer &&  p.areaCode == this.areaCode && p.prefix == this.prefix);
	}
	
	@Override
	public int hashCode() {
		return this.areaCode + this.lineNumer + this.prefix;
	}
	
	@Override
	public String toString() {
		return (this.areaCode + ":" + this.lineNumer + ":" + this.prefix);
	}

	public int compareTo(PhoneNumber o) {
		if (o == this) {
			return 0;
		}
		if (!(o instanceof PhoneNumber)) {
			throw new IllegalArgumentException();
		}		
		PhoneNumber p  = (PhoneNumber) o;
		return this.lineNumer > p.lineNumer ? 1 : this.lineNumer == p.lineNumer ? 0 : -1;
	}
}
