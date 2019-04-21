package com.fosu.vo.exam;

import java.util.List;

public class AccuacyExam {

	private List<AccuacyChoiceExam> accuacyChoiceExam;
	
	private List<AccuacyBlankExam> accuacyBalankExam;
	
	private List<AccuacyShortExam> accuacyShortExam;

	public List<AccuacyChoiceExam> getAccuacyChoiceExam() {
		return accuacyChoiceExam;
	}

	public void setAccuacyChoiceExam(List<AccuacyChoiceExam> accuacyChoiceExam) {
		this.accuacyChoiceExam = accuacyChoiceExam;
	}

	public List<AccuacyBlankExam> getAccuacyBalankExam() {
		return accuacyBalankExam;
	}

	public void setAccuacyBalankExam(List<AccuacyBlankExam> accuacyBalankExam) {
		this.accuacyBalankExam = accuacyBalankExam;
	}

	public List<AccuacyShortExam> getAccuacyShortExam() {
		return accuacyShortExam;
	}

	public void setAccuacyShortExam(List<AccuacyShortExam> accuacyShortExam) {
		this.accuacyShortExam = accuacyShortExam;
	}

	
}
