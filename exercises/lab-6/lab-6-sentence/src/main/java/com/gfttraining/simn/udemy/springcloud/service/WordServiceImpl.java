package com.gfttraining.simn.udemy.springcloud.service;

import com.gfttraining.simn.udemy.springcloud.dao.*;
import com.gfttraining.simn.udemy.springcloud.domain.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	VerbClient verbClient;
	@Autowired
	SubjectClient subjectClient;
	@Autowired
	ArticleClient articleClient;
	@Autowired
	AdjectiveClient adjectiveClient;
	@Autowired
	NounClient nounClient;
	
	
	@Override
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "emptyWord")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	public Word getNoun() {
		return nounClient.getWord();
	}

	public Word emptyWord() {
		return new Word("");
	}
}
