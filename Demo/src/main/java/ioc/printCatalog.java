package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class printCatalog implements CommandLineRunner {

    @Autowired
    Catalog catalog;

//    public printCatalog() {
//        System.out.println("PrintCatalog()");
    

    @Override
    public void run(String... args) throws Exception {
        System.out.println(catalog.getClass());
        for (var book : catalog.getBooks())
            System.out.println(book);
    }
}
