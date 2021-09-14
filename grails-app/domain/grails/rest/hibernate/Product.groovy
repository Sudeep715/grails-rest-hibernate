package grails.rest.hibernate

class Product {

    String name
    Double price

    static constraints = {
        name blank:false
        price range:0.0..1000.00
    }
}
