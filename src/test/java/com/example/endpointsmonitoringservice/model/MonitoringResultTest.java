package com.example.endpointsmonitoringservice.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonitoringResultTest {
    @Test
    public void testGettersAndSetters() {
        MonitoringResult result = new MonitoringResult();
        result.setId(1L);
        result.setStatusCode(200);
        result.setPayload("example of any response received");
        result.setCheckTime(LocalDateTime.now());

        assertEquals(1L, result.getId());
        assertEquals(200, result.getStatusCode());
        assertEquals("example of any response received", result.getPayload());
        assertEquals(LocalDateTime.now().getYear(), result.getCheckTime().getYear());
    }
}
