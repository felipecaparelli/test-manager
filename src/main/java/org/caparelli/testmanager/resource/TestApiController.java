package org.caparelli.testmanager.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.caparelli.testmanager.request.Operation;
import org.caparelli.testmanager.request.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T23:28:27.788+02:00")

@Controller
public class TestApiController implements TestApi {

    private static final Logger log = LoggerFactory.getLogger(TestApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TestApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addTestOperation(@ApiParam(value = "ID of test to return",required=true) @PathVariable("testId") Long testId,@ApiParam(value = "Operation object to be added inside the test" ,required=true )  @Valid @RequestBody Operation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createTest(@ApiParam(value = "Test object that needs to be created" ,required=true )  @Valid @RequestBody Test body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTest(@ApiParam(value = "Test id to delete",required=true) @PathVariable("testId") Long testId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Test>> findTestsByType(@NotNull @ApiParam(value = "Type values that need to be considered for filter", required = true, allowableValues = "BIOCHEMISTRY, MICROBIOLOGY, HEMATOLOGY") @Valid @RequestParam(value = "type", required = true) List<String> type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Test>>(objectMapper.readValue("[ {  \"operations\" : [ {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  }, {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  } ],  \"testId\" : 5,  \"type\" : \"BIOCHEMISTRY\"}, {  \"operations\" : [ {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  }, {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  } ],  \"testId\" : 5,  \"type\" : \"BIOCHEMISTRY\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Test>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Test>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Test> getTestById(@ApiParam(value = "ID of test to return",required=true) @PathVariable("testId") Long testId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Test>(objectMapper.readValue("{  \"operations\" : [ {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  }, {    \"unit\" : \"unit\",    \"name\" : \"name\",    \"operationId\" : 5,    \"value\" : \"value\"  } ],  \"testId\" : 5,  \"type\" : \"BIOCHEMISTRY\"}", Test.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Test>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Test>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTest(@ApiParam(value = "Test object that needs to be updated" ,required=true )  @Valid @RequestBody Test body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
