/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.caparelli.testmanager.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T23:28:27.788+02:00")

@Api(value = "laboratory", description = "the laboratory API")
public interface LaboratoryApi {

    @ApiOperation(value = "Returns orders by status", nickname = "getActiveOrders", notes = "Returns a map of active orders", response = Integer.class, responseContainer = "Map", tags={ "laboratory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    @RequestMapping(value = "/laboratory/order",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Map<String, Integer>> getActiveOrders();

}
