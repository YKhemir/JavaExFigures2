
public class Cercle {
	// Attributs de la classe Cercle 
	private Centre centre; 
	private double r;
	
	public class Centre {
		private double x;
		private double y;
		
		public Centre(double x, double y) {
			this.x = x;
            this.y = y;
		}


		// Méthodes
		public void deplace (double x, double y) {
			this.setX(x) ;
			this.setY(y);
		}
		
		
		public double getX() {
			return x;
		}


		public void setX(double x) {
			this.x = x;
		}


		public double getY() {
			return y;
		}


		public void setY(double y) {
			this.y = y;
		}
		


		@Override
		public String toString() {
			return "Centre [x=" + x + ", y=" + y + "]";
		}
		
		

		
		
	}
	
	
	// Méthodes 
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double surface () {
		return Math.PI * Math.pow(getR(), 2 );
	}
	
	// Méthode pour déplacer le cercle en utilisant la méthode deplace de la classe Centre
    public void deplace(double x, double y) {
        this.centre.deplace(x, y);
    }
	
	// Constructeur 
	public Cercle(double x, double y, double r) {
		this.centre =  new Centre (x,y);
		this.setR(r);
	}
	public void affiche() {
		System.out.println("Cercle de rayon :" + r);
		System.out.println("Le rayon avec le centre du cercle : rayon  "+ r + " et "  + centre );
		System.out.println("La surface du cercle est de : " + surface());
		
	}
	
}
