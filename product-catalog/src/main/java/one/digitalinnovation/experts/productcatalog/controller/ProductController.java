package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping (method = RequestMethod.POST)
    Product Create( @RequestBody Product product ) {
        return productRepository.save ( product );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById( @PathVariable Integer id ) {
     return productRepository.findById ( id );
    }
}
