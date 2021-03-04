package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockNegativeException extends Exception {

    public BeerStockNegativeException(Long id, int quantityToIncrement) {
        super(String.format("It is not possible to decrement %s Beer with %s ID. The stock would be negative. Operation was Canceled.", quantityToIncrement, id));
    }
}
