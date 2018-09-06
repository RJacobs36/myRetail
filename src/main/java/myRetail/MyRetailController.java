package myRetail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRetailController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final String url = "https://redsky.target.com/v2/pdp/tcin/";
    private static final String params = "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/products")
    public String product(@RequestParam(value="id")int id) {
        log.info(restTemplate.getForEntity(url + id + params, String.class).toString());

        Response response = (restTemplate.getForObject(url + id + params, Response.class));

        return "{id:"  + response.getItem().getTcin() + ",name:" + response.getItem().getProduct_description().toString();
    }
}
