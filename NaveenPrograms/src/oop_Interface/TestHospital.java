package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {

		//Variable of interface class is accessible in other classes as well
		System.out.println(USMedical.a);
		System.out.println(FortisHospital.a);
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		
		fh.medicalReasearch();
		fh.publishMedicalNews();
			
		//top casting: child class object can be referred by parent interface reference variable
		USMedical us = new FortisHospital();
		
		us.pediaServices();
		us.emergencyServices();
		us.OrthoServices();
		us.physioServices();
		
		//FortisHospital fh1 = new USMedical();				
	}
}
