package org.caparelli.testmanager.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.caparelli.testmanager.request.Order;
import org.caparelli.testmanager.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@RestController
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private OrderService service;

    @Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request, OrderService service) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.service = service;
    }

    public ResponseEntity<Void> createOrder(@ApiParam(value = "Order object that needs to be created" ,required=true )  @Valid @RequestBody Order order) {
        try {
            org.caparelli.testmanager.model.Order o = service.create(order);
            if(o == null) throw new RuntimeException("Error when trying to create the order");
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build();
        }
    }

    public ResponseEntity<Void> deleteOrder(@ApiParam(value = "Order id to delete",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Order>> findOrdersByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "pending, processed") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Order>>(objectMapper.readValue("[ {  \"tests\" : [ {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  }, {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  } ],  \"orderedBy\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"clinicianId\" : 6,    \"email\" : \"email\"  },  \"orderId\" : 0,  \"patient\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"patientId\" : 1,    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"email\" : \"email\"  },  \"status\" : \"pending\"}, {  \"tests\" : [ {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  }, {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  } ],  \"orderedBy\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"clinicianId\" : 6,    \"email\" : \"email\"  },  \"orderId\" : 0,  \"patient\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"patientId\" : 1,    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"email\" : \"email\"  },  \"status\" : \"pending\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of order to return",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{  \"tests\" : [ {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  }, {    \"operations\" : [ {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    }, {      \"unit\" : \"unit\",      \"name\" : \"name\",      \"operationId\" : 5,      \"value\" : \"value\"    } ],    \"testId\" : 5,    \"type\" : \"BIOCHEMISTRY\"  } ],  \"orderedBy\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"clinicianId\" : 6,    \"email\" : \"email\"  },  \"orderId\" : 0,  \"patient\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"patientId\" : 1,    \"phone\" : \"phone\",    \"documentNumber\" : \"documentNumber\",    \"email\" : \"email\"  },  \"status\" : \"pending\"}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateOrder(@ApiParam(value = "Order object that needs to be updated" ,required=true )  @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
