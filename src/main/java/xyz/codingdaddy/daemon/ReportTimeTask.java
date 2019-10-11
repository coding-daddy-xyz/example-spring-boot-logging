package xyz.codingdaddy.daemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * Task used to log current time
 *
 * @author serhiy
 */
@Component
public class ReportTimeTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportTimeTask.class);

    /**
     * Logs current time
     */
    @Scheduled(fixedRate = 1000)
    public void reportTime() {
        LOGGER.info("Current time: " + ZonedDateTime.now());
    }
}
