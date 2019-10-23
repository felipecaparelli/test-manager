/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.caparelli.testmanager.resource;

import io.swagger.annotations.*;
import org.caparelli.testmanager.request.Patient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T23:28:27.788+02:00")

@Api(value = "patient", description = "the patient API")
public interface PatientApi {

    @ApiOperation(value = "Create patient", nickname = "createPatient", notes = "", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/patient",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createPatient(@ApiParam(value = "Created patient object" ,required=true )  @Valid @RequestBody Patient body);


    @ApiOperation(value = "Delete patient", nickname = "deletePatient", notes = "", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid patientId supplied"),
        @ApiResponse(code = 404, message = "Patient not found") })
    @RequestMapping(value = "/patient/{patientId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePatient(@ApiParam(value = "The patientId that needs to be deleted",required=true) @PathVariable("patientId") String patientId);


    @ApiOperation(value = "Get patient by name", nickname = "getPatientByName", notes = "", response = Patient.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Patient.class),
        @ApiResponse(code = 404, message = "Patient not found") })
    @RequestMapping(value = "/patient/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Patient> getPatientByName(@NotNull @ApiParam(value = "The name that needs to be fetched. Use patient name for ordering", required = true) @Valid @RequestParam(value = "name", required = true) String name);


    @ApiOperation(value = "Updated patient", nickname = "updatePatient", notes = "", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid patient supplied"),
        @ApiResponse(code = 404, message = "Patient not found") })
    @RequestMapping(value = "/patient/{patientId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatePatient(@ApiParam(value = "patientId that need to be updated",required=true) @PathVariable("patientId") String patientId,@ApiParam(value = "Updated patient object" ,required=true )  @Valid @RequestBody Patient body);

}