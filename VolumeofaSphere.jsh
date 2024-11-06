import java.util.Scanner;
double sphere(double d){
	double r = d/2;
	return(4.0/3.0)*Math.PI*Math.pow(r,3);
	}
Scanner scanner = new Scanner(System.in);
System.out.println("Sphere:");
double diameter = scanner.nextDouble();
double volume = sphere(diameter);
System.out.println("Volume:"+volume);

