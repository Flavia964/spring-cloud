package one.digitalinnovation.experts.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.elasticsearch.annotations.Document;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



//@Document ( indexName = "product", Type = "catalog")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;


    public
    Long getId ( ) {
        return id;
    }

    public
    void setId ( Long id ) {
        this.id = id;
    }

    public
    String getName ( ) {
        return name;
    }

    public
    void setName ( String name ) {
        this.name = name;
    }

    public
    Integer getAmount ( ) {
        return amount;
    }

    public
    void setAmount ( Integer amount ) {
        this.amount = amount;
    }
}
