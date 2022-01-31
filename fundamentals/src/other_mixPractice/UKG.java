package other_mixPractice;

public class UKG {

	int sid;
	String sname;
	double h;

	public UKG(String sname, int sid, double h) {
		this.sid = sid;
		this.sname = sname;
		this.h = h;
	}

	public String toString() {
		return "Name is:: " + sname + " ID is:: " + sid + " Height is:: " + h;
	}

}
