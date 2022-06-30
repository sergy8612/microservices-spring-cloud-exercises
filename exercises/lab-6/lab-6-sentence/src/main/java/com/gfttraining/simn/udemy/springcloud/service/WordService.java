package com.gfttraining.simn.udemy.springcloud.service;


import com.gfttraining.simn.udemy.springcloud.domain.Word;

public interface WordService {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();
	
}
