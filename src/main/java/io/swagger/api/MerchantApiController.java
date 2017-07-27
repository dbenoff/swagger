package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.InlineResponse200;
import io.swagger.model.Merchant;
import io.swagger.service.MerchantSearchParameters;
import io.swagger.service.MerchantSearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

@Controller
public class MerchantApiController implements MerchantApi {

    @Autowired
    private MerchantSearchServiceImpl merchantSearchService;

    public ResponseEntity<List<InlineResponse200>> merchantLocationGet( @NotNull@ApiParam(value = "If true, omit the contact information from returned locations.", required = true, defaultValue = "false") @RequestParam(value = "omitContactInfo", required = true, defaultValue="false") Boolean omitContactInfo,
         @Min(1) @Max(100)@ApiParam(value = "The maximum number of locations to return for a single query.", defaultValue = "10") @RequestParam(value = "maximumResults", required = false, defaultValue="10") Integer maximumResults,
        @ApiParam(value = "Identify and sort merchants or locations for which the search text offers approximate matches.") @RequestParam(value = "searchText", required = false) String searchText,
        @ApiParam(value = "Limits results to a region with its center specified by the given GPS latitude.") @RequestParam(value = "latitude", required = false) Double latitude,
        @ApiParam(value = "Limits results to a region with its center specified by the given GPS longitude.") @RequestParam(value = "longitude", required = false) Double longitude,
         @Min(100) @Max(100000)@ApiParam(value = "Radius of the search area in meters.", defaultValue = "50000") @RequestParam(value = "searchRadius", required = false, defaultValue="50000") Integer searchRadius,
        @ApiParam(value = "If true, omit the list of supported consumer features from the returned locations.", defaultValue = "false") @RequestParam(value = "omitConsumerFeatures", required = false, defaultValue="false") Boolean omitConsumerFeatures,
        @ApiParam(value = "If true, omit the merchant information from returned locations.", defaultValue = "false") @RequestParam(value = "omitMerchantInfo", required = false, defaultValue="false") Boolean omitMerchantInfo) {
        // do some magic!
        MerchantSearchParameters params = new MerchantSearchParameters();
        params.name = searchText;
        List<Merchant> merchants = merchantSearchService.searchForMerchants(params);
        List<InlineResponse200> responses = new ArrayList<>();
        for(Merchant merchant : merchants){
            InlineResponse200 inlineResponse200 = new InlineResponse200();
            inlineResponse200.setName(merchant.getName());
            responses.add(inlineResponse200);
        }
        return new ResponseEntity<List<InlineResponse200>>(responses, HttpStatus.OK);
    }

}
