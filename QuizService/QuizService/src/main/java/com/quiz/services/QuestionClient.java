package com.quiz.services;

import com.quiz.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Need to enable feignClients in the main App

//Instead of feign we can also use the following

//The Spring Framework provides the following choices for making calls to REST endpoints:
//
//RestClient - synchronous client with a fluent API.
//
//WebClient - non-blocking, reactive client with fluent API.

//Previously we were just calling the URL we know the service is running on if we have 2 instances running of the question service 1 on port 8082 and 1 on 9092 and for some reason the 8082 is no longer working and we want quiz service to call the 9092 when ever the 8082 is down this is called load balancing

//we can create another instance of question serive by using maven package and it will create a target folder that will have a snapshot of the .jar file and we can run that .jar file in terminal using java -jar filename

//@FeignClient(url = "http://localhost:8082", value = "Question-client")

//load balancing - For load balancing we gave the name of our QUESTION-SERVICE in application.properties of the question microservice project so now it knows on whichever port the QUESTION-SERVICE is running it will use that server to make the API call
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
