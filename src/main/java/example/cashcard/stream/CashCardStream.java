package example.cashcard.stream;

import example.cashcard.domain.Transaction;
import example.cashcard.service.DataSourceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class CashCardStream {

    @Bean
    public Supplier<Transaction> approveRequest(DataSourceService dataSourceService) {
        return dataSourceService::getData;
    }

    @Bean
    public DataSourceService dataSourceService() {
        return new DataSourceService();
    }
}
