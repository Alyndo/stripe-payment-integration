package com.alwyn.techie.stripeIntegration.api;

import com.alwyn.techie.stripeIntegration.dto.StripeChargeDto;
import com.alwyn.techie.stripeIntegration.dto.StripeTokenDto;
import com.alwyn.techie.stripeIntegration.service.StripeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stripe")
@AllArgsConstructor
public class StripeApi {

    private final StripeService stripeService;

    @Operation(summary = "Create card token",
            description = "REST endpoint to create card token")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Token Created Successfully"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Server Error")
    })
    @PostMapping("/card/token")
    @ResponseBody
    public StripeTokenDto createCardToken(@RequestBody StripeTokenDto model){

        return stripeService.createCardToken(model);
    }

    @Operation(summary = "Create Charges",
            description = "REST endpoint to create charges")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Charge created successfully"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Server Error")
    })
    @PostMapping("/charge")
    @ResponseBody
    public StripeChargeDto charge(@RequestBody StripeChargeDto model){

        return stripeService.charge(model);
    }
}
