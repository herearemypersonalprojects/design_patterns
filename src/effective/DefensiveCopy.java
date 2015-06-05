package effective;

import java.util.Date;

public final class DefensiveCopy {
	private final Date start;
	private final Date end;
	
	public DefensiveCopy(Date s, Date e) {
		Date ss =  new Date(s.getTime());
		Date ee = new Date(e.getTime());
		
		if (ss.compareTo(ee) > 0) {
			throw new IllegalArgumentException("Input is not ok");
		}
		
		start = ss;
		end = ee;
	}
	
	public Date getStart() {
		return new Date(start.getTime());
	}
	
	public Date getEnd() {
		return new Date(end.getTime());
	}
	
	public static void main(String[] args) {
		Date s = new Date();
		Date e = new Date();
		DefensiveCopy c = new DefensiveCopy(s, e);
		
		s.setYear(2000);
		
		System.out.println(c.getStart().toString());
	}
}
