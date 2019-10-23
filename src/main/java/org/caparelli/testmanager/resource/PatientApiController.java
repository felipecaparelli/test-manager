package org.caparelli.testmanager.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.caparelli.testmanager.request.Patient;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T23:28:27.788+02:00")

@Controller
public class PatientApiController implements PatientApi {

    private static final Logger log = LoggerFactory.getLogger(PatientApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PatientApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createPatient(@ApiParam(value = "Created patient object" ,required=true )  @Valid @RequestBody Patient body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePatient(@ApiParam(value = "The patientId that needs to be deleted",required=true) @PathVariable("patientId") String patientId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Patient> getPatientByName(@NotNull @ApiParam(value = "The name that needs to be fetched. Use patient name for ordering", required = true) @Valid @RequestParam(value = "name", required = true) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Patient>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"patientId\" : 1,  \"phone\" : \"phone\",  \"documentNumber\" : \"documentNumber\",  \"email\" : \"email\"}", Patient.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Patient>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Patient>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePatient(@ApiParam(value = "patientId that need to be updated",required=true) @PathVariable("patientId") String patientId,@ApiParam(value = "Updated patient object" ,required=true )  @Valid @RequestBody Patient body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
