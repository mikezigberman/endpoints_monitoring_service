package com.example.endpointsmonitoringservice.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonitoredEndpointTest {
    @Test
    public void testGettersAndSetters() {
        MonitoredEndpoint endpoint = new MonitoredEndpoint();
        endpoint.setId(1L);
        endpoint.setUrl("https://exampleofsomesite.com");
        endpoint.setCreatedDate(LocalDateTime.now());

        assertEquals(1L, endpoint.getId());
        assertEquals("https://exampleofsomesite.com", endpoint.getUrl());
        assertEquals(LocalDateTime.now().getYear(), endpoint.getCreatedDate().getYear());
    }
}
