package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends CrudRepository< Product, Integer> {
}
