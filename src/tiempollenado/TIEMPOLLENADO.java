package tiempollenado;

public class TIEMPOLLENADO{
	private Double L;
	private Double A;
	private Double B;
	private Double Q;
	private Double H;
	private Double R;
	private Double X;
	
	public TIEMPOLLENADO(String [] args) {
		
		this.L = Double.parseDouble(args[0]);
		this.A = Double.parseDouble(args[1]);
		this.B = Double.parseDouble(args[2]);
		this.Q = Double.parseDouble(args[3]);
		this.H = Double.parseDouble(args[4]);
		this.R = Double.parseDouble(args[5]);
		this.X = Double.parseDouble(args[6]);
	}


	public Double getL() {
		return L;
	}


	public void setL(Double l) {
		L = l;
	}


	public Double getA() {
		return A;
	}


	public void setA(Double a) {
		A = a;
	}


	public Double getB() {
		return B;
	}


	public void setB(Double b) {
		B = b;
	}


	public Double getQ() {
		return Q;
	}


	public void setQ(Double q) {
		Q = q;
	}


	public Double getH() {
		return H;
	}


	public void setH(Double h) {
		H = h;
	}


	public Double getR() {
		return R;
	}


	public void setR(Double r) {
		R = r;
	}


	public Double getX() {
		return X;
	}


	public void setX(Double x) {
		X = x;
	}


	public Double tiempollenado(String[] parametro){
		 
		  float AT=0;
		  double pi=3.1416;
		AT = (float) (A*Math.cos(Q)*L + B*L + pi*Math.pow(R,2));// calculando el area del techo y cilindro
		  AT=  AT/100;
		   float tiempolluvia=0;
		   tiempolluvia = (float) (X*AT*100 *10000/100);
	       
		   float VC= 0;
		   VC = (float) (pi*Math.pow(R,2)*Math.pow(10,6)*H);
		   
		return (double) (VC/tiempolluvia);
	  }
}
