package org.ssglobal.training.codes;

public enum Classification {
	
	EXCELLENT,
	VERY_SATISFACTORY,
	SATISFACTORY,
	PASS,
	FAIL;
	
	public static Classification evaluate(double grade) {
		if(grade >= 95) {
			return EXCELLENT;
		}else if((grade >= 90) && (grade < 95)) {
			return VERY_SATISFACTORY;
		}else if((grade >= 80) && (grade < 90)) {
			return SATISFACTORY;
		}else if((grade >= 70) && (grade < 90)) {
			return SATISFACTORY;
		}else {
			return FAIL;
		}
	}
	
	public static double computeWeights(Classification rating) {
		switch(rating) {
			case EXCELLENT:
				return 100.0;
			case VERY_SATISFACTORY:
				return 90;
			case SATISFACTORY:
				return 80.0;
			default:
				return 50.0;
		}
	}
}
