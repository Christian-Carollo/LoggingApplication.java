package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    @Value("${customEnvs.n1}")
    private int n1;

    @Value("${customEnvs.n2}")
    private int n2;

    public int getPotenza(){
        try {
            logger.info("Starting Calculate");

            int potenza = n1*n2;

            return potenza;
        }finally {
            logger.info("Ending Calculate");
        }
    }
}
