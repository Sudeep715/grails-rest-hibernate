package grails.rest.hibernate

import grails.gorm.services.Service

@Service(Product)
interface ProductService {

    List<Product> findByNameLike(String name, Map args)
}
