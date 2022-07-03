package gunjanbookzyproject.projectshowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectShowcaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectShowcaseApplication.class, args);
	
	}
	@GetMapping
	public String gunjan(){
		return "hello gunjan,successfully deployed";
	}
		
 
}
