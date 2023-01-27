package eu.pp.test.app.controller;

import java.util.Date;

import eu.pp.test.app.data.EmployeeRepository;
import eu.pp.test.app.model.Employee;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MajkelB
 */
@RestController
public class TestController {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TestController.class);

    @Value( "${test.val}" )
    private String testVal;

    private final EmployeeRepository repository;

    @Autowired
    public TestController( EmployeeRepository repository ) {
        this.repository = repository;
    }

    @GetMapping("/test")
    String test() {
        return "test4: " + testVal;
    }

    @GetMapping("/initDB")
    String initDB() {
        Employee e = new Employee();
        e.setId( 33L );
        e.setName( "John" );
        e.setRole( "Captain" );

        repository.save( e );
        repository.flush();

        return "DB initialized";
    }

//    @GetMapping("/insert")
//    String insert() {
//        WSCall call = WSCallFactory.getInstance().getRandomWSCall();
//        repository.save( call );
//        repository.flush();
//        return "(" + call.getResultCode() + ")" + call.getServiceName();
//    }



}
